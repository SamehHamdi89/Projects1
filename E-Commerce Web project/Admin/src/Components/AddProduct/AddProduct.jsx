/* eslint-disable no-unused-vars */
import React, { useState } from 'react'
import './AddProduct.css'
import upload_area from '../../assets/upload_area.svg'

const AddProduct = () => {
    const [image,setImage] = useState(false);
    const [productDetails,setProduct] = useState({
        name:"",
        image:"",
        category:"Women",
        new_price:"",
        old_price:"",
    })

    const imageUploder = (i)=>{
        setImage(i.target.files[0]);
    }

    const ChangeHandler = (i)=>{
        setProduct({...productDetails,[i.target.name]:i.target.value})
    }

    const addProduct = async()=> {
        console.log(productDetails);
        let responseData;
        let product = productDetails;

        let formData = new FormData();
        formData.append('product',image);

        await fetch('http://localhost:3001/upload',{
            method:'POST',
            headers:{
                Accept:'application/json',
            },
            body:formData,
        }).then((resp) => resp.json()).then((data)=>{responseData=data});
        if(responseData.success){
            product.image = responseData.image_url;
            console.log(product);
            await fetch('http://localhost:3001/addproduct',{
                method:'POST',
                headers:{
                    Accept:'application/json',
                    'Content-Type':'application/json',
                },
                body:JSON.stringify(product),
            }).then((resp)=>resp.json()).then((data)=>{
                data.success?alert("Product Added"):alert("Failed")
            })
        }
    }

  return (
    <div className='addproduct'>
        <div className="addproduct-itemfield">
            <p>Product Title</p>
            <input value={productDetails.name} onChange={ChangeHandler} type="text" name="name" placeholder='Type Here'/>
        </div>
        <div className="addproduct-price">
            <div className="addproduct-itemfield">
                <p>Price($)</p>
                <input value={productDetails.old_price} onChange={ChangeHandler} type="text" name='old_price' placeholder='Type Here'/>
            </div>
            <div className="addproduct-itemfield">
                <p>Offer Price($)</p>
                <input value={productDetails.new_price} onChange={ChangeHandler} type="text" name='new_price' placeholder='Type Here'/>
            </div>
        </div>
        <div className="addproduct-itemfield">
            <p>Product Category</p>
            <select value={productDetails.category} onChange={ChangeHandler} name="category" className='addproduct-selector'>
                <option value="Women">Women</option>
                <option value="Men">Men</option>
                <option value="Kids">Kids</option>
            </select>
        </div>
        <div className="addproduct-itemfield">
            <label htmlFor="file-input">
                <img src={image?URL.createObjectURL(image):upload_area} className='addproduct-thumnail-img' alt="" />
            </label><br />
            <input onChange={imageUploder} type="file" name="image" id="file-input" hidden/>
        </div>
        <button onClick={()=>{addProduct()}} className='addproduct-btn'>Add Product</button>
    </div>
  )
}

export default AddProduct