<template>
        <div class="product-grid p-2">
            <div class="product-image mb-2">
                <a href="#" class="image">
                    <img src="../../assets/img/jordan.jpg">
                </a>
                <div class="title">{{nom}}</div>
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
    font-size: xx-large;
    font-weight: 600;
    margin: 0 0 7px;
    font-family: Georgia, 'Times New Roman', Times, serif;
    text-transform: uppercase;
    float: left;
}
.product-grid .price{
    clear: both;
    float: left;
    color: #0d0d0d;
    font-size: large;
    font-weight: bold;
    font-family: Arial, Helvetica, sans-serif;
}
</style>