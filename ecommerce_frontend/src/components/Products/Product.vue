<template>
        <div class="product-grid">
            <div class="product-image">
                <a href="#" class="image">
                    <img src="../../assets/img/jordan.jpg">
                </a>
                <ul class="product-links">
                    <li><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                    <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                    </svg></a></li>
                </ul>
                <button class="add-to-cart btn-primary">AJOUTER AU PANIER</button>
            </div>
            <div class="product-content">
                <h3 class="title"><a href="#">{{nom}}</a></h3>
                <div class="price">${{prix}}</div>
            </div>
        </div>
</template>

<script>
    export default{
        name: 'Product',
        props: {
            'nom' : String,
            'prix': Number,
        },
    }
</script>

<style>
.product-grid{
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    text-align: center;
    box-shadow: 1px -2px 15px -3px rgba(0,0,0,0.58);
}
.product-grid .product-image{
    overflow: hidden;
    position: relative;
    z-index: -1;
}
.product-grid .product-image a.image{display: block; }
.product-grid .product-image img{
    width: 100%;
    height: auto;
}
.product-grid .product-links{
    padding: 0;
    margin: 0;
    list-style: none;
    position: absolute;
    top: 10px;
    right: -50px;
    transition: all .5s ease 0s;
}
.product-grid:hover .product-links{ right: 20px; }
.product-grid .product-links li a{
    color: #333;
    background: transparent;
    font-size: x-large;
    line-height: 38px;
    width: 38px;
    height: 38px;
    display: block;
    transition: all 0.3s;
}
.product-grid .product-links li a:hover{
    color: black;
}
.product-grid .add-to-cart{
    background: mediumseagreen;
    color: black;
    font-size: 16px;
    text-transform: uppercase;
    letter-spacing: 2px;
    width: 100%;
    border: none;
    padding: 10px 26px;
    position: absolute;
    left: 0;
    bottom: -60px;
    transition: all 0.3s ease 0s;
    font-weight: bold;
}
.product-grid:hover .add-to-cart{ bottom: 0; }
.product-grid .product-content{
    background: #fff;
    padding: 15px;
    border: 3px double rgba(0,0,0,0.14);;
}
.product-grid .title{
    font-size: 16px;
    font-weight: 600;
    text-transform: capitalize;
    margin: 0 0 7px;
}
.product-grid .title a{
    color: black;
    transition: all 0.3s ease 0s;
}
.product-grid .title a:hover{ color: mediumseagreen; }
.product-grid .price{
    color: #0d0d0d;
    font-size: medium;
    font-weight: bold;
    font-family: Arial, Helvetica, sans-serif;
}
</style>