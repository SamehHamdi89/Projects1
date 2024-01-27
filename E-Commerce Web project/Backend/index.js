const port = 3001;
const express = require('express');
const app = express();
const mongoose = require('mongoose');
const jwt = require('jsonwebtoken');
const multer = require('multer');
const path = require("path");
const cors = require("cors");

app.use(express.json());
app.use(cors());

// Database Connection with Mongodb
mongoose.connect("mongodb+srv://Shazam87:Dragu781Ash1@cluster0.x7bdepy.mongodb.net/e-commerce")
.then(() => console.log("MongoDB Connected..."));

// API Endpoints

app.get("/",(req,res)=>{
    res.send("Express App is Running")
})

// Image Storage Configuration

const storage = multer.diskStorage({
    destination: './upload/images',
    filename: (req,file,cb)=>{
        return cb(null, '/' + file.fieldname + '_' + Date.now() + path.extname(file.originalname))    
    }
})

const upload = multer({storage:storage})

//Upload images

app.use('/images',express.static('upload/images'))

app.post("/upload",upload.single('product'),(req,res)=>{
    res.json({
        success: 1,
        image_url: 'http://localhost:'+ port + '/images'+ req.file.filename
    })
})

// Creating products

 const Product = mongoose.model("Product",{
    id: {
        type: Number,
        required: true,
    },
    name:{
        type: String,
        required: true,
    },
    image:{
        type:String,
        required: true,
    },
    category:{
        type: String,
        required: true,
    },
    new_price:{
        type:Number,
        required:true,
    },
    old_price:{
        type:Number,
        required: true,
    },
    date:{
        type:Date,
        default: Date.now(),
    },
    available:{
        type:Boolean,
        default: true,
    },
 })

 app.post('/addproduct',async(req,res)=>{
    let products = await Product.find({});
    let id;
    if (products.length > 0){
        let last_product_array = products.slice(-1);
        let last_product = last_product_array[0];
        id = last_product.id + 1;
    }
    else{
        id=1;
        }

    const product = new Product({
        id: id,
        name: req.body.name,
        image: req.body.image,
        category: req.body.category,
        new_price: req.body.new_price,
        old_price: req.body.old_price,
    });
    console.log(product);
    await product.save();
    console.log('Product added!');
    res.json({
        success:true,
        name:req.body.name,
    })
 })

 //For Deleting products

 app.post("/removeproduct", async (req, res) => {
   try {
     const removed_product = await Product.deleteOne({ id: req.body.id });
     if (!removed_product)
       return res.status(404).send("No product with the given ID was found.");
     res.json({
       success: true,
       name: req.body.name,
     });
     console.log("Deleted");
   } catch (error) {
     res.status(400).send(error);
   }
 });

 //Getting all products

 app.get('/allproducts',async(req,res)=>{
    let products = await Product.find({}); 
    res.json(products);
    console.log("All products ")
 })

 // Creating user model

 const Users = mongoose.model('Users',{
    name:{
        type : String,
    },
    email:{
        type : String,
        unique:true,
    },
    password:{
        type :String,
    },
    cartData:{
        type:Object,
    },
    date:{
        type:Date,
        default: Date.now(),
    }
 })

 // Creating user registration

 app.post('/signup',async(req,res)=>{
        let userExist = await Users.findOne({email: req.body.email})
        if (!userExist){
            let cart = {};
            for(let i=0; i<300;i++){
                cart[i]=0;
            }
            const newUser = new Users({
                name:req.body.username,
                email:req.body.email,
                password:req.body.password,
                cartData:cart,
            })
            
            await newUser.save();
            const data = {
                newUser:{
                    id:newUser.id
                }
            }
            const token = jwt.sign(data,'secret_ecom');
            res.json({success:true,token})
            }else{
                return res.status(400).json({success:false, alert:"Email is already in use"})
                }
 })

 // Creating User Login

 app.post('/login',async(req,res)=>{
    let user = await Users.findOne({email:req.body.email});
    if(!user){
        return res.json({success:false,errors:'Invalid Email or Password'})
        }
        const validPass = req.body.password === user.password;
        if (!validPass) {
            res.status(401).send({auth:false, message:'Invalid Email or Password'})
            }
            const data = {
                user:{id:user.id}
            }
            const token = jwt.sign(data,'secret_ecom');
            res.json({success:true,token})
 })

 // Creating endpoint for newCollection data

 app.get('/newcollections',async(req,res)=>{
    let products = await Product.find({});
    let newCollection = products.slice(1).slice(-8);
    console.log("NewCollection Fetched");
    res.send(newCollection);
 })

  // Creating endpoint for Popular data

  app.get('/popular',async(req,res)=>{
    let products = await Product.find({category:"Women"});
    let Popular = products.slice(0,4);
    console.log("Popular Fetched");
    res.send(Popular);
 })

 //Creating middleware to get user id
    const fetchUser = (req,res,next)=>{
        const token = req.header('auth-token');
        if(!token){
            res.status(401).send({errors:"Please login  first!"})
        }else{
            try{
                const data = jwt.verify(token,'secret_ecom')
                req.user = data.user;
                next();
            }catch(error){
                res.status(401).send({errors:"Auth failed!"})
            }
        }
    }

 //Creating endpoint for adding products in cart data

 app.post('/addtocart',fetchUser,async(req,res)=>{
    let userData = await Users.findOne({_id:req.user.id})
    userData.cartData[req.body.itemId] +=1
    await Users.findOneAndUpdate({_id:req.user.id},{cartData:userData.cartData})
    res.send("Added")
 })

  //Creating endpoint for removing products from cart data
  app.delete("/removefromcart",fetchUser,async(req,res)=>{
    let userData = await Users.findOne({_id:req.user.id})
    if(userData.cartData[req.body.itemId] > 0){
        userData.cartData[req.body.itemId] -=1
    }
    await Users.findOneAndUpdate({_id:req.user.id},{cartData:userData.cartData})
    res.send("Removed")
  })

  //Creating endpoint to get cart data
  app.post('/getcart',fetchUser,async(req,res)=>{
    console.log("Get Cart");
    let userData = await Users.findOne({_id:req.user.id})
    res.json(userData.cartData);
  })

app.listen(port,(error)=>{
    if (!error) {
        console.log("Server is running on http://localhost:" + port)
    }
    else{
        console.log("Error: " + error)
    }
})



