<template>
    <div class="container-fluid mt-5">
        <div class="row justify-content-center">
            <div class="col-4">
    <form action="" id="login">
        <div class="form-group">
            <svg xmlns="http://www.w3.org/2000/svg" width="150" height="150" fill="currentColor" class="bi bi-people-fill" viewBox="0 0 16 16">
            <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1H7zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
            <path fill-rule="evenodd" d="M5.216 14A2.238 2.238 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.325 6.325 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1h4.216z"/>
            <path d="M4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5z"/>
            </svg>
            <div class="form-group">
                <label for="input">Adresse e-mail</label>
                <input required id="input" type="email" class="form-control" placeholder="Entrer votre Email" v-model="email" v-on:keydown.enter.prevent='submit'>
            </div>
        <div class="form-group">
                <label for="input">Mot de passe</label>
                <input  id="input" type="password" class="form-control" placeholder="Mot de passe" v-model="passWord"  v-on:keydown.enter.prevent='submit' pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
                <router-link to="/website">
                    <button id="loginButton" type="submit" class="btn w-100 mt-4 =" v-on:click="login">LOGIN</button>
                </router-link>
        </div>
        <div class="buttons">
            <router-link to="ResetPassword"><button id= 'link' class="btn btn-link">Mot de passe oublié?</button></router-link>
            <router-link to="CreateAccount"><button id= 'link' class="btn btn-link">Créez votre compte</button></router-link>
        </div>
        </div>
    </form>
    </div>
    </div>
    </div>
</template>

<script>
    import ClientService from '@/service/ClientService';
    export default {
    name: "Login",
    data(){
        return {
            email : '',
            passWord : '',
        }
    },
    methods: {
        login : function(){
            ClientService.login(this.email,this.passWord)
        }
    }
  }
</script>
<style lang="css" scoped>
    @import 'style.css';
</style>