<template>
    <form id="login" action=""> 
            <h2>Update Password</h2>
            <input id="input" type="password" class="form-control mt-3"  placeholder="New Password" v-model="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" v-on:keydown.enter.prevent='submit' required title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
            <input id="input" type="text" class="form-control mt-2"  placeholder="Token of validation" v-on:keydown.enter.prevent='submit' v-model="key" required>
            <router-link to="/">
                <button id="loginButton" type="submit" class="btn w-100 mt-4 =" v-on:click="sumbit" src="https://github.com/IvanJimenezRuisanchez/Tp4/blob/master/src/main/java/com/tp3/service/ServiceClient.java">CHANGE</button>
            <br><br><hr>
            </router-link>
    </form>
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
            sumbit: function(){
                ClientService.updatePassword(this.password,this.key)
            }
        }}
</script>

<style lang="css" scoped>
    @import 'style.css';
</style>