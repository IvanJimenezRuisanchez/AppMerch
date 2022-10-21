<template>
  <div class="container-fluid mt-5">
        <div class="row justify-content-center">
          <div class="col-4">
        <div class="card cardPanier">
          <div class="text">Panier</div>
          <img v-if="cartEmpty" src="../../assets/img/empty-cart.png" alt="">
          <div class="card-body">
            <div class="col-12"  v-for="product in cart">
              <PannierItem :product=product></PannierItem>
            </div>
            <button  v-if="true  != cartEmpty " type="button" class="btn btn-warning btn-block btn-lg pay">Proceed to Pay</button>
          </div>
        </div>
      </div>
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
            cart : '',
            cartEmpty : true,
        };
    },
    updated(){
      if(this.cart.length == 0){
        this.cartEmpty = true
      }
      else{
        this.cartEmpty = false
      }
    },
    mounted(){
      this.cart = store.getters.getCart
      if(this.cart.length == 0){
        this.cartEmpty = true
      }
      else{
        this.cartEmpty = false
      }
    },  
    components: { PannierItem }
}
</script>

<style>
  .cardPanier{
    box-shadow: 2px 0px 24px 11px rgba(0,0,0,0.41);
    margin: 10px;
    border-radius: 10px;
  }
  .pay{
    margin-top: 5px;
  }
  .text{
    font-size: 50px;
    font-weight: 100;
    margin: 10px;
  }
</style>