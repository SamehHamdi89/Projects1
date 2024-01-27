import React from 'react'
import './DescriptionBox.css'

export const DescriptionBox = () => {
  return (
    <div className='descriptionbox'>
      <div className="descriptionbox-navigator">
        <div className="descriptionbox-nav-box">Description</div>
        <div className="descriptionbox-nav-box fade">Reviews (122)</div>
      </div>
      <div className="descriptionbox-description">
        <p>
            The Shazam website is an online platform that facilitates buying and selling of products
            or services over the internet servers as a virtual marketplace where businesses and
            individuals showcase their products, interact with customers, and conduct transactions
            without the need for a physical presense. E-commerce websites have gained immense
            popularity due to their convenient accessibility and the global reach they offer.
        </p>
        <p>
            E-commerce websites typically display products or services a detailed descriptions,images,
            prices, and any available variations(eg: sizes, colors) Each product usually has its own dedicated
            page with relevant information.
        </p>
      </div>
    </div>
  )
}
