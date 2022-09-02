<template>
    <form id="login" action="">
        <div class="form-group">
            <h2>SignUp</h2>
            <svg xmlns="http://www.w3.org/2000/svg" width="150" height="150" fill="currentColor" class="bi bi-card-checklist" viewBox="0 0 16 16">
            <path d="M14.5 3a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-13a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h13zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
            <path d="M7 5.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 1 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0zM7 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 0 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0z"/>
            </svg>
            <div class="form-group">
                <label for="input" >First Name</label>
                <input required id="input" type="text" class="form-control" placeholder="First Name" v-model="firstName" v-on:keydown.enter.prevent='submit' />
                <label>Last Name</label>
                <input required id="input" type="text" class="form-control" placeholder="Last Name" v-model="lastName" v-on:keydown.enter.prevent='submit' />
            </div>
            <div class="form-group">
                <label for="input" >Email address</label>
                <input required id="input" type="email" class="form-control" placeholder="Enter your email" v-model="email"  v-on:keydown.enter.prevent='submit' />
            </div>
            <div class="form-group">
                <label for="input">Password</label>
                <input required id="input" type="password" class="form-control" placeholder="Password" v-model="passWord" v-on:keydown.enter.prevent='submit' pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
            <router-link to="/"><button id="loginButton" type="submit" class="btn w-100 mt-4" v-on:click="submit">CREATE ACCOUNT</button></router-link>
        </div>
        <router-link to="/"><button id= 'link' class="btn btn-link">Return To Login</button></router-link>
    </div>
    </form>
</template>
<script>
    import ClientService from '@/service/ClientService';
    export default{
        name : "CreateAccount",
        data() {
            return {
                firstName : '',
                lastName : '',
                email : '',
                passWord : '',
            }
        },
        methods: {
        submit : function(){
            ClientService.createAccount(this.firstName,this.lastName,this.email,this.passWord)
        }
    },
    }
</script>
<style lang="css" scoped>
    @import 'style.css';
</style>