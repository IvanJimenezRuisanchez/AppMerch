<template>
    <section class="py-5">
        <div class="container-fluid px-4 px-lg-5 my-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div  class="col-md-4">
                    <img  src="../../assets/img/jordan.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="col-md-3">
                    <h1 class="display-5 fw-bolder">{{product.nom}}</h1>
                    <div class="mb-1">Categorie&nbsp<span style="text-transform: uppercase;">{{product.categorie}}</span></div>
                    <div class="mb-1">Materiel &nbsp<span style="text-transform: uppercase;">{{materiel}}</span></div>
                    <div class="mb-1">Prix&nbsp<span>${{product.prix}}</span></div>
                    <span class="medium m-2">Couleurs</span>
                    <ul class="list-inline">
                        <li v-for="couleur in couleurs" v-bind:id="couleur"  :style="{ 'background-color': couleur}" class="list-inline-item m-2" style="border-radius: 50%;"><button class="btn" v-on:click="selectCouleur(couleur)" style="border: none;"></button></li>
                    </ul>
                    <span class="medium m-2">Tailles</span>
                    <ul class="list-inline">
                        <li v-for="taille in tailles"  v-bind:id="taille" class="list-inline-item mr-1"><button  class="btn" v-on:click="selectTaille(taille)"><span class="text-decoration-none">{{taille}}</span></button></li>
                    </ul>
                    <button id="cart" type="button" class="btn" v-on:click="addToPannier(product)">AJOUTER AU PANIER</button>
                    <hr>
                    <div class="mb-3"><p class="desc">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                    </p></div> 
                </div>
            </div>
        </div>
    </section>
</template>
<script>
import store from '@/states/store'

    export default{
        name: "ProductDetails",
        data() {
            return {
                tailles : [],
                couleurs : [],
                activeTaille: '',
                activeColor: '',
                product : '',
            }
        },
        methods :{
            selectTaille :function(taille){
                document.getElementById(this.activeTaille).style.borderBottom = 'none'
                document.getElementById(taille).style.borderBottom = '3px solid RGB(239, 192, 80)'
                this.activeTaille = taille
            },
            selectCouleur :function(couleur){
                document.getElementById(this.activeColor).style.border = 'none'
                document.getElementById(couleur).style.border = '2px solid black'
                this.activeColor = couleur
            },
            addToPannier : function(product){
                const item = {
                    id : product.id,
                    nom : product.nom,
                    prix : product.prix,
                    couleur : this.activeColor,
                    size: this.activeTaille,
                    categorie: product.categorie
                }
                store.commit('addToCart',item)
                this.$router.push('/')
            },
        },
        mounted(){
            const tailles = 'S/M/L/X'
            const couleurs = 'red/yellow/blue/green'
            this.product=store.getters.getProductById
            this.couleurs = couleurs.split("/")
            this.tailles = tailles.split("/")
            this.activeTaille = this.tailles[0]
            this.activeColor = this.couleurs[0]
        },
}
</script>
<style>
    ul li .btn{
        font-weight: bold;
    }
    ul li .btn span{
        font-size: medium;
    }
    .desc {
        margin: 10px;
        display: inline-block;
        width:100%;
        word-wrap:break-word;
        font-weight: lighter;
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
</style>
