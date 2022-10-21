<template>
    <div class="card rounded-3 cardItem" >
          <div class="card-body p-2">
            <div class="row">
              <div class="col-2">
                <img
                  src="../../assets/img/jordan.jpg"
                  class="img-fluid rounded-3" alt="Cotton T-shirt">
              </div>
              <div class="col-8">
                <span id="entete">{{product.nom}}&nbsp-&nbsp{{product.categorie}}&nbsp(&nbsp{{product.size}}&nbsp/&nbsp{{product.couleur}}&nbsp)</span>
                <div  class="mt-5"><span id="quantity">Quantity:</span><span id="prix">${{product.prix}}</span></div>
            </div>
            <div class="col-1"></div>
            <div class="col-1"><button id="icon"><svg v-on:click="deleteItem" xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-x-circle-fill" viewBox="0 0 16 16">
              <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM5.354 4.646a.5.5 0 1 0-.708.708L7.293 8l-2.647 2.646a.5.5 0 0 0 .708.708L8 8.707l2.646 2.647a.5.5 0 0 0 .708-.708L8.707 8l2.647-2.646a.5.5 0 0 0-.708-.708L8 7.293 5.354 4.646z"/>
            </svg></button></div>
          </div>
        </div>
      </div>
</template>
<script>
    import "@fontsource/open-sans"
    import store from "@/states/store";
    export default{
    name: 'Pannier',
    props: {
            'product'  : Object,
    },
    methods:{
        deleteItem :function(){
            store.commit('delete',this.product.id)
        }
    }
    }
</script>
<style>
  .cardItem{
    padding: 5px;
    margin-top: 5px;
  }
  #entete{
    font-weight: bold;
    text-transform: uppercase;
    font-size: xx-large;
    font-family: 'Open Sans';
    margin-left: 0;
  }
  #quantity{
    text-transform: capitalize;
    font-size: medium;
    font-family: 'Open Sans';
    float: left; 
  }
  #prix{
    text-transform: uppercase;
    font-size: x-large;
    font-family: 'Open Sans';
    float: right;
  }
  #icon{
    border: none;
    background-color: transparent;
    color: red;
  }
</style>