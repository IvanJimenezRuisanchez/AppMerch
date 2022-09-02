import { createApp } from 'vue'
import { createRouter, createWebHistory, useRouter } from 'vue-router'

import App from './App.vue'
import Login from './components/Authentication/Login.vue'
import CreateAccount from './components/Authentication/CreateAccount.vue'
import UpdatePassword from './components/Authentication/UpdatePassword.vue'
import ResetPassword from './components/Authentication/ResetPassword.vue'

const router = createRouter({
    history: createWebHistory(),
    routes : [
        {path : '/', name : 'Login', component : Login},
        {path : '/createAccount', name : 'CreateAccount', component : CreateAccount},
        {path : '/updatePassword', name : 'UpdatePassword', component : UpdatePassword},
        {path : '/resetPassword', name : 'ResetPassword', component : ResetPassword}
    ]
})
import 'bootstrap/dist/css/bootstrap.min.css'
createApp(App).use(router).mount('#app')
