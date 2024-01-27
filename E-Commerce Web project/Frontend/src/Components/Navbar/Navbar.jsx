import React, { useContext, useRef, useState } from "react";
import "./Navbar.css";
import logo from "../Assets/logo.png";
import cart_icon from "../Assets/cart_icon.png";
import { Link } from "react-router-dom";
import { ShopContext } from "../../Context/ShopContext";
import dropdown_icon from '../Assets/nav-dropdown-icon.png'

export const Navbar = () => {

  const [menu,setMenu] = useState("shop");
  const {getTotalCartItems} = useContext(ShopContext)
  const menuRef = useRef();

  const dropDown_toggle = (i)=>{
    menuRef.current.classList.toggle('nav-menu-visible');
    i.target.classList.toggle('open');
  }

  return (
    <div className="navbar">
    <div className="nav-logo">
      <img src={logo} alt="Shopper" />
      <p> SHOPPER </p>
    </div>
    <img className="nav-dropdown" alt="Dropdown" onClick={dropDown_toggle} src={dropdown_icon} />
    <ul ref={menuRef} className="nav-menu">
      <li onClick={() => setMenu("shop")} key="shop"><Link style={{textDecoration:'none'}} to='/'>Shop</Link> {menu === "shop" && <hr className="nav-menu-hr" />}</li>
      <li onClick={() => setMenu("mens")} key="mens"><Link style={{textDecoration:'none'}} to='/mens'>Men</Link>{menu === "mens" && <hr className="nav-menu-hr" />}</li>
      <li onClick={() => setMenu("women")} key="women"><Link style={{textDecoration:'none'}} to='/women'>Women</Link>{menu === "women" && <hr className="nav-menu-hr" />}</li>
      <li onClick={() => setMenu("kids")} key="kids"><Link style={{textDecoration:'none'}} to='/kids'>Kids</Link>{menu === "kids" && <hr className="nav-menu-hr" />}</li>
    </ul>
    <div className="nav-login-cart">
      {localStorage.getItem('auth-token')
        ?<button type="button" onClick={() => {
          localStorage.removeItem('auth-token');
          window.location.replace('/')
          }}>LogOut</button>
        :<Link to='/login'><button>Login</button></Link>}
      <Link to='/cart'><img src={cart_icon} alt="Cart" /></Link>
      <div className="nav-cart-count">{getTotalCartItems()}</div>
    </div>
  </div>
)
};
