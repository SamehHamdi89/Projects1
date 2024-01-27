import React, { useEffect, useState } from 'react'
import './Popular.css'
// import data_product from '../Assets/data'
import {Item} from '../Item/item'

export const Popular = () => {

   
  const [data_product,setPopular] = useState([])

  useEffect(()=>{
    fetch('http://localhost:3001/popular')
    .then((response)=>response.json())
    .then((data)=>setPopular(data));
  },[]) 

  return (
    <div className='popular'>
        <h1>Popular in Women</h1>
        <hr/>
        <div className="popular-item">
            {data_product.map((item,i)=>{
                return <Item key={i} id={item.id} name={item.name} image={item.image} new_price={item.new_price} old_price={item.old_price}/>
            })}
        </div>
    </div>
  )
}
