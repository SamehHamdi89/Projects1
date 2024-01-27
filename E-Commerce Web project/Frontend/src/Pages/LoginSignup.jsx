import React, { useState } from "react";
import './CSS/LoginSignup.css'

export const LoginSignup = () => {

  const [state,setState] = useState("Login");
  const [formData,setFormData] = useState({
    username:"",
    email:"",
    password: ""
  })

  const changeHandler = (i)=>{
    setFormData({...formData,[i.target.name]:i.target.value})
  }

  const login = async()=>{
    console.log("Login Executed",formData);
    let responseData;
    await fetch('http://localhost:3001/login',{
      method:'POST',
      headers:{
        Accept:'application/form-Data',
        'Content-Type':'application/json',
      },
      body: JSON.stringify(formData)
    }).then((response)=>response.json()).then((data)=>responseData=data)
    if(responseData.success){
      localStorage.setItem('auth-token',responseData.token);
      window.location.replace("/");
      alert("Login Successfully")
    }
    else{
      alert("Email already exists")
    }
  }

  const signup = async()=>{
    console.log("Signup Executed",formData);
    let responseData;
    await fetch('http://localhost:3001/signup',{
      method:'POST',
      headers:{
        Accept:'application/form-Data',
        'Content-Type':'application/json',
      },
      body: JSON.stringify(formData)
    }).then((response)=>response.json()).then((data)=>responseData=data)
    if(responseData.success){
      localStorage.setItem('auth-token',responseData.token);
      window.location.replace("/");
      alert("User Created Successfully")
    }
    else{
      alert("Email already exists")
    }
  }
  
  return (
    <div className="loginsignup">
      <div className="loginsignup-container">
        <h1>{state}</h1>
        <div className="loginsignup-fields">
          {state==="Signup"?<input name='username' value={formData.username} onChange={changeHandler} type="text" placeholder="Your Name" />:<></>}
          <input name='email' value={formData.email} onChange={changeHandler} type="email" placeholder="Email Address" />
          <input name='password' value={formData.password} onChange={changeHandler} type="password" placeholder="Password" />
        </div>
        <button onClick={()=>{state==="Login"?login():signup()}}>Continue</button>
        {state==="Signup"?
        <p className="loginsignup-login">Already Have an account ? <span onClick={()=>{setState("Login")}}> Login Here</span></p>
        :<p className="loginsignup-login">Create an account ? <span onClick={()=>{setState("Signup")}}> Click Here</span></p>}
        
        <div className="loginsignup-agree">
          <input type="checkbox" name="" id="" />
          <p>By Continuing you agree to the terms of use & privacy policy. </p>
        </div>
      </div>
    </div>
  );
};
