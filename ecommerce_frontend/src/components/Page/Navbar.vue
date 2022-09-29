<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-2 p-0">
                <h1>Mon Merch App</h1>
                <ul class="list-group list-group-horizontal justify-content-center">
                    <p></p>
                    <li class="list-group-item"><button class="btn shadow-none"><span class="mr-2"><svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                    <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                    </svg>Rechercher</span></button></li>
                    <li class="list-group-item"><button class="btn shadow-none"><span>Catégories</span></button></li>
                    <li class="list-group-item"><button class="btn shadow-none" v-on:click="showLogin('Pannier')" ><span><svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
                    <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                    </svg>Mon pannier <span id="items">{{items}}</span></span></button></li>
                    <li class="list-group-item" v-on:click="showLogin('Login')"><button class="btn shadow-none"><span>LOGIN</span></button></li>
                    <li class="list-group-item"><button class="btn shadow-none"><span><svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-telephone-outbound-fill" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511zM11 .5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-1 0V1.707l-4.146 4.147a.5.5 0 0 1-.708-.708L14.293 1H11.5a.5.5 0 0 1-.5-.5z"/>
                    </svg>Contact Us</span></button></li>
                </ul> 
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row justify-content-center">
            <div class="col-4" id="side-div">
                <span><h1 class="mt-2">{{section}}</h1>
                <button id="cancel" class="btn shadow-none" v-on:click="hideSideDiv"><svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="currentColor" class="bi bi-x-lg" viewBox="0 0 16 16">
                <path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8 2.146 2.854Z"/>
                </svg></button></span>
                <component :is="composant"></component>
            </div>
        </div>
    </div>
</template>

<script>
    import store from "@/states/store"
    import LoginVue from '../Authentication/Login.vue'
    import Pannier from '../Products/Pannier.vue'
    export default{
        name: 'Navbar',
        components:{
             'Login' : LoginVue,
             'Pannier' : Pannier
        },
        data() {
            return {
                section : '',
                composant : '',
                items : ''
            }
        },
        async mounted(){
            this.items =store.getters.getPanierItems
        },
        methods: {
        showLogin : function(section){
            document.getElementById("side-div").style.display = "block"
            this.section = section
            this.composant = section
        },
        showPannier : function(section){
            document.getElementById("side-div").style.display = "block"
            this.section = section
            this.composant = section
        }, 
        hideSideDiv: function(){
            document.getElementById("side-div").style.display = "none"
        }
    }
    }
</script>

<style scoped>
    #menu{
        border: none;
        color: black;
        margin-left: 20px;
        padding: 0;
    }
    .navbar{
        background-color: RGB(239, 192, 80);
    }
    .container-fluid{
        -webkit-box-shadow: 0px 5px 15px 5px rgba(0,0,0,0.27); 
    }
    .row{
        border: 1px solid rgba(135, 132, 132, 0.393);
        border-top: none;
    }
    #items{
        font-size: larger;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    }
    .list-group .list-group-item{
        padding: 0;
        width: 100%;
        border: none;
        
    }
    .list-group .list-group-item:hover{
        box-shadow: inset 0 -2px 0 0 black;
        border-radius: 0;
    }
    .list-group .list-group-item .btn{
        padding: 25px;
        border: none;
    }
    span{
        font-size: medium;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        font-weight: bold;
        margin-left: 5px;
        text-decoration-line: none;
    }
    h1{
        font-size: large;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        font-weight: bold;
    }
    #side-div{
        height: 100%;
        position: fixed;
        top: 0;
        right: 0;
        -webkit-animation: slide-in-right 0.5s cubic-bezier(0.250, 0.460, 0.450, 0.940) both;
	        animation: slide-in-right 0.5s cubic-bezier(0.250, 0.460, 0.450, 0.940) both;
        box-shadow: 0px 5px 15px 5px rgba(0,0,0,0.27);
        display: none;
        background-color: white;
        overflow-y: scroll;
    }
    #side-div h1{
        text-transform: uppercase;
    }
    #cancel {
        position: fixed;
        top: 0;
        right: 0;
        margin: 20px;
        border: none;
    }

    @-webkit-keyframes slide-in-right {
  0% {
    -webkit-transform: translateX(1000px);
            transform: translateX(1000px);
    opacity: 0;
  }
  100% {
    -webkit-transform: translateX(0);
            transform: translateX(0);
    opacity: 1;
  }
}
@keyframes slide-in-right {
  0% {
    -webkit-transform: translateX(1000px);
            transform: translateX(1000px);
    opacity: 0;
  }
  100% {
    -webkit-transform: translateX(0);
            transform: translateX(0);
    opacity: 1;
  }
}

</style>