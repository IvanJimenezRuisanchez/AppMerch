import { createApp } from 'vue'
import { createRouter, createWebHistory, useRouter } from 'vue-router'

import App from './App.vue'
import CreateAccount from './components/Authentication/CreateAccount.vue'
import UpdatePassword from './components/Authentication/UpdatePassword.vue'
import ResetPassword from './components/Authentication/ResetPassword.vue'
import ProducDetails from '../src/components/Products/ProductDetails.vue'
import Product_List from '../src/components/Products/Product_list.vue'
import Login from '../src/components/Authentication/Login.vue'
import Panier from '../src/components/Products/Panier.vue'
const router = createRouter({
    history: createWebHistory(),
    routes : [
        {path : '/createAccount', name : 'CreateAccount', component : CreateAccount},
        {path : '/updatePassword', name : 'UpdatePassword', component : UpdatePassword},
        {path : '/resetPassword', name : 'ResetPassword', component : ResetPassword},
        {path: '/', name: 'Home', component : Product_List},
        {path: '/productDetails' , name: 'ProductDetails',component : ProducDetails},
        {path: '/login', name:'Login',component : Login},
        {path: '/panier', name:'Panier', component : Panier}
    ]
})

import 'bootstrap/dist/css/bootstrap.min.css'
import '@fortawesome/fontawesome-free/css/all.css'
import '@fortawesome/fontawesome-free/js/all.js'
global.jQuery = require('jquery');
var $ = global.jQuery;
window.$ = $;
createApp(App).use(router).mount('#app')
