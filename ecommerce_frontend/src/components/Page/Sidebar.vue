<template>
    <nav class="navbar navbar-expand-lg navbarPrin">
        <div id="menuLinks">
            <a class="" href="#">
                <svg xmlns="http://www.w3.org/2000/svg" style="margin-bottom: 5px; margin-right: 5px" width="21" height="21" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
            <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
            <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
            </svg>Account</a>
            <router-link to="Panier"><a>
                <svg xmlns="http://www.w3.org/2000/svg" style="margin-bottom: 5px; margin-right: 5px" width="21" height="21" fill="currentColor" class="bi bi-bag-check" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                <path d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z"/>
                </svg>Panier
            </a></router-link>
        </div>
        <button id="menu" class="menu" type="button" v-on:click="menu">
            <span class="fas fa-bars" id="menuSpan"></span>
        </button>
    </nav>
    <nav id="sidebar" class="sidebar">
                <ul>
                    <router-link to="/"><li><a>Home</a></li></router-link>
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
                    <router-link to="Login"><li><a>Login</a></li></router-link>
                    <router-link to="CreateAccount"><li><a>Register</a></li></router-link>
                    <router-link to="Panier"><li><a>Panier</a></li></router-link>
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
        border: none;
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
    #menuSpan{
        font-size: 20px;
    }
    nav ul li a #span.rotate{
        transform: translateY(-50%) rotate(-180deg);
    }

</style>