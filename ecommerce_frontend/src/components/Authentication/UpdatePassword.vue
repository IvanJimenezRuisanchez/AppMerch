<template>
    <div class="container-fluid mt-5">
        <div class="row justify-content-center">
            <div class="col-3">
                <form id="login" action="" > 
                        <h2>Mettre à jour le mot de passe</h2>
                        <input id="input" type="password" class="form-control mt-3"  placeholder="Nouveau mot de passe" v-model="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" v-on:keydown.enter.prevent='submit' required title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
                        <input id="input" type="text" class="form-control mt-2"  placeholder="Token de validation" v-on:keydown.enter.prevent='submit' v-model="key" required>
                        <router-link to="/">
                            <button id="loginButton" type="submit" class="btn w-100 mt-4 =" v-on:click="updatePassword" src="https://github.com/IvanJimenezRuisanchez/Tp4/blob/master/src/main/java/com/tp3/service/ServiceClient.java">CHANGER</button>
                        <br><br><hr>
                        </router-link>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
import ClientService from '@/service/ClientService';

    export default{
        name : "UpdatePassword",
    data(){
            return{
                password : '',
                key : ''
            }
        },
        methods : {
            updatePassword: function(){
                ClientService.updatePassword(this.password,this.key)
            }
        }}
</script>

<style lang="css" scoped>
    @import 'style.css';
</style>