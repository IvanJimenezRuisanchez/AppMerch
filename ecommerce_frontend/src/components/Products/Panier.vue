<template>
        <div class="card">
          <div class="card-body">
            <div class="col-12"  v-for="product in cart">
              <PannierItem :product=product></PannierItem>
            </div>
            <button type="button" class="btn btn-warning btn-block btn-lg">Proceed to Pay</button>
          </div>
        </div>
</template>

<script>
import store from "@/states/store";
import PannierItem from "./PanierItem";
export default{
    name: "Panier",
    data() {
        return {
            cart : ''
        };
    },
    mounted(){
      this.cart = store.getters.getCart
    },  
    components: { PannierItem }
}
</script>

<style>
  .card{
    border: none;
  }
</style>