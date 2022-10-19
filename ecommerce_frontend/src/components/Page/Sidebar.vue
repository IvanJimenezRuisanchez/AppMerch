<template>
    <nav class="navbar navbar-expand-lg ">
        <div id="menuLinks">
            <a class="" href="#">Account</a>
            <a class="" href="#">Panier</a>
        </div>
        <button id="menu" class="menu" type="button" v-on:click="menu">
            <span class="fas fa-bars" id="menuSpan"></span>
        </button>
    </nav>
    <nav id="sidebar" class="sidebar">
                <ul>
                    <li><a>Home</a></li>
                    <li>
                        <a v-on:click="toggleVisibility">Collection
                            <span id="span" class="fas fa-caret-down first"></span>
                        </a>
                        <div class="details" v-if="isVisible" v-on:click="toggleVisibility()">
                            <ul>
                            <li><a href="">All</a></li>
                            <li><a href="">C-4000</a></li>
                            <li><a href="">T-shirts</a></li>
                            <li><a href="">Hoodies</a></li>
                        </ul>
                        </div>
                    </li>
                    <li><a>Login</a></li>
                    <li><a>Register</a></li>
                    <li><a>Panier</a></li>
                </ul>
            </nav>
</template>
<script>
export default {
    name: 'Sidebar',
    data() {
        return {
            isVisible: false,
            isMenuVisible : false,
        }
    },
    methods : {
        toggleVisibility() {
            this.isVisible = !this.isVisible
        },
        menu (){
            if(document.getElementById("menu").style.left == '260px'){
                document.getElementById("menu").style.left = '45px'
                document.getElementById("sidebar").style.left = '-250px'
            }
            else{
                document.getElementById("menu").style.left = '260px'
                document.getElementById("sidebar").style.left = '0px'
            }
        }
    },
}
</script>
<style>
    .navbar{
        background-color: #1e1e1e;
    }
    #menuLinks{
        color: white;
        position: absolute;
        right: 10%;
    }
    #menuLinks a{
        text-decoration: none;
        font-size: 18px;
        padding-left: 40px;
        font-weight: 500;
        width: 100%;
        color: white;
    }
    #menuLinks a:hover{
       color: orange;
       background-color: #1e1e1e;
    }
    .menu{
        position: relative;
        left: 45px;
        height: 45px;
        width: 45px;
        text-align: center;
        background-color: #1e1e1e;
        border-radius: 3px;
        transition: left 0.4s ease;
        color: white;
    }
    .sidebar{
       position: fixed;
       width: 250px;
       height: 100%;
       left: -250px;
       background: #1e1e1e;
       text-align: start;
       font-family: Arial, Helvetica, sans-serif;
       box-sizing: border-box;
       transition: left 0.4s ease;
    }
    nav ul{
        color: black;
        background-color: #1b1b1b;
        margin: 0;
        padding: 0;
        height: 100%;
        width: 100%;
        list-style: none;
    }
    nav ul li { 
        line-height: 60px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.1);
        color: white;
    }
    nav ul li a{ 
        position: relative;
        color: white;
        text-decoration: none;
        font-size: 18px;
        padding-left: 40px;
        font-weight: 500;
        display: block;
        width: 100%;
        border-left: 3px solid transparent;
    }
    nav ul li:hover{ 
       color: orange;
       background-color: #1e1e1e;
       border-left-color: orange;
    }
    nav ul li a:hover{ 
       color: orange;
       background-color: #1e1e1e;
       border-left-color: orange;
    }
    .sidebar .text{
        color: white;
        font-size: 25px;
        font-weight: 600;
        line-height: 65px;
        text-align: center;
        background-color: #1e1e1e;
        letter-spacing: 1px;
    }

    nav ul ul li{
        line-height: 42px;
        border-bottom: none;
    }
    nav ul ul li a{
        font-size: 17px;
        color: #e6e6e6;
        padding-left: 80px;
    }
    #span{
        position: absolute;
        top: 50%;
        right: 20px;
        transform: translateY(-50%);
        font-size: 22px;
        transition: transform 0.4s;
    }
    nav ul li a #span.rotate{
        transform: translateY(-50%) rotate(-180deg);
    }

</style>