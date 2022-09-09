<template>
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
    }
  },
  created(){
    ClientService.getProducts().then(response => ( this.products = response.data));
}
}
</script>
<style>
  .container .row{
    border: none;
  }
</style>