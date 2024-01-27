import React from "react";
import "./item.css";
import { Link } from "react-router-dom";

export const Item = ({ id, image, name, new_price, old_price }) => (
  <div className="item" key={id}>
    <Link to={`/product/${id}`} aria-label={`View product "${name}"`}>
      <img onClick={window.scrollTo(0,0)} src={image} alt={name} title={name} />
    </Link>
    <p>{name}</p>
    <div className="item-prices" style={{ display: "flex" }}>
      <div className="item-price-new">${new_price}</div>
      {old_price && <div className="item-price-old">${old_price}</div>}
    </div>
  </div>
);

Item.defaultProps = {
  id: "",
  image: "",
  name: "",
  new_price: "",
  old_price: "",
};
