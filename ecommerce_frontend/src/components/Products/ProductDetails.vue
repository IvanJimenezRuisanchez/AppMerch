<template>
    <section class="py-5">
        <div class="container-fluid px-4 px-lg-5 my-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-md-4">
                    <img src="../../assets/img/jordan.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="col-md-4">
                    <h1 class="display-5 fw-bolder">{{product.nom}}</h1>
                    <div class="mb-1">Categorie&nbsp<span>{{product.categorie}}</span></div>
                    <div class="mb-1">Materiel &nbsp<span>{{materiel}}</span></div>
                    <div class="mb-1">Prix&nbsp<span>${{product.prix}}</span></div>
                    <div class="mb-3 text-justify">{{description}}</div>
                    <span class="medium m-2">Couleurs</span>
                    <ul class="list-inline">
                        <li id="colorItem" class="list-inline-item m-2 activeCouleur"><button class="btn"></button></li>
                        <li id="colorItem" class="list-inline-item m-2"><button class="btn"></button></li>
                        <li id="colorItem" class="list-inline-item m-2"><button class="btn"></button></li>
                    </ul>
                    <span class="medium m-2">Tailles</span>
                    <ul class="list-inline">
                        <li id="S" class="list-inline-item mr-1 active"><button class="btn" v-on:click="selectTaille('S')"><span class="text-decoration-none">S</span></button></li>
                        <li id="M" class="list-inline-item mr-1"><button class="btn" v-on:click="selectTaille('M')"><span class="text-decoration-none">M</span></button></li>
                        <li id="L" class="list-inline-item mr-1"><button class="btn" v-on:click="selectTaille('L')"><span class="text-decoration-none">L</span></button></li>
                        <li id="X" class="list-inline-item mr-1"><button class="btn" v-on:click="selectTaille('X')"><span class="text-decoration-none">X</span></button></li>
                        <li id="XL" class="list-inline-item"><button class="btn" v-on:click="selectTaille('XL')"><span class="text-decoration-none">XL</span></button></li>
                    </ul>
                    <button id="cart" type="button" class="btn">AJOUTER AU PANIER</button>
                </div>
            </div>
        </div>
    </section>
</template>
<script>
import store from '@/states/store'

    export default{
        name: "ProductDetails",
        props: {
            'nom' : String,
            'categorie': String,
            'prix': Number,
            'description': String,
            'couleurs' : String,
            'materiel' : String,
            'tailles': String
        },
        data() {
            return {
                taille: 'S',
                activeTaille: 'S',
                activeColor: '',
                product : ''
            }
        },
        methods :{
            selectTaille :function(taille){
                this.taille = taille
                document.getElementById(this.activeTaille).className = "list-inline-item mr-1"
                document.getElementById(taille).className = "list-inline-item mr-1 activeTaille"
                this.activeTaille = taille

            }
        },
        mounted(){
            this.product=store.getters.getProductById
        }
}
</script>
<style>
    ul li .btn{
        border: none;
        font-weight: bold;
    }
    ul li .btn span{
        font-size: medium;
    }
    #active{
        border-bottom: 3px solid RGB(239, 192, 80);
        border-radius: 0vmin;
    }
    .activeTaille{
       border-bottom: 3px solid RGB(239, 192, 80);
       border-radius: 0vmin;
    }
    .activeCouleur{
       border:  2px solid black;
    }
    #cart{
        background-color: RGB(239, 192, 80);
        width: 90%;
        border-radius: 0%;
        font-weight: bold;
    }
    span{
        text-decoration: none;
        font-weight: bold;
        font-family: Georgia, 'Times New Roman', Times, serif;
    }
    #colorItem{
        background-color: red;
        border-radius: 50%;
    }
</style>
