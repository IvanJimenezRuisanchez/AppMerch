<template>
   <div class="container"></div>
    <div  class="row mt-5 mb-2 justify-content-end">
      <div class="col-4">
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
          <label class="form-check-label" for="inlineRadio1">Shorts</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
          <label class="form-check-label" for="inlineRadio1">Shorts</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
          <label class="form-check-label" for="inlineRadio2">Chandails</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3">
          <label class="form-check-label" for="inlineRadio3">Hoodies</label>
        </div>
      </div>
      <div class="col-2" >
        <div class="input-group rounded">
            <input type="search" class="form-control rounded" placeholder="Search" aria-label="Chercher par nom" aria-describedby="search-addon" v-model="param" required/>
            <span class="input-group-text border-0" id="search-addon" v-on:click="chercherProduitsParNom">
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
              <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
            </svg>
            </span>
        </div>
      </div>
      <div class="col-2" ></div>
    </div>
    <div class="container">
    <div class="row">
      <div class="col-3 mt-5"  v-for="product in products">
            <Product :prix="product.prix" :nom="product.nom"></Product>
      </div>
    </div>
  </div>
</template>
<script>
import Product from "./Product.vue";
import ClientService from "@/service/ClientService";
export default {
  name: "ProductList",
  components: {
    Product : Product
  },
  data() {
    return {
        products: null,
        param: ''
    }
  },
  methods :{
    chercherProduitsParNom : function(){
        ClientService.getProductsByName(this.param).then(response => ( this.products = response.data));
    }
  },
  mounted(){
    ClientService.getProducts().then(response => ( this.products = response.data));
}
}
</script>
<style>
  .container .row{
    border: none;
  }
  .input-group{
    overflow: hidden;
    z-index: -1;
  }
</style>