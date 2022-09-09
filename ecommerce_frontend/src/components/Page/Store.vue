<template>
    <component :is="navbar"></component>
    <component :is="productList"></component>
</template>
<script>
import Product_list from '../Products/Product_list.vue';
import Navbar from './Navbar.vue';
    export default{
        name: 'Store',
        data(){
            return{
                'navbar' : '',
                'productList' : ''
            }
        },
        mounted(){
            this.navbar = Navbar,
            this.productList = Product_list
        }
    }
</script>
<style>
</style>