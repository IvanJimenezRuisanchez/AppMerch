import { createApp } from 'vue'
import { createRouter, createWebHistory, useRouter } from 'vue-router'

import App from './App.vue'
import CreateAccount from './components/Authentication/CreateAccount.vue'
import UpdatePassword from './components/Authentication/UpdatePassword.vue'
import ResetPassword from './components/Authentication/ResetPassword.vue'
import ProducDetails from '../src/components/Products/ProductDetails.vue'
import Product_List from '../src/components/Products/Product_list.vue'

const router = createRouter({
    history: createWebHistory(),
    routes : [
        {path : '/createAccount', name : 'CreateAccount', component : CreateAccount},
        {path : '/updatePassword', name : 'UpdatePassword', component : UpdatePassword},
        {path : '/resetPassword', name : 'ResetPassword', component : ResetPassword},
        {path: '/', name: 'Home', component : Product_List},
        {path: '/productDetails' , name: 'ProductDetails',component : ProducDetails}
    ]
})

import 'bootstrap/dist/css/bootstrap.min.css'
createApp(App).use(router).mount('#app')
