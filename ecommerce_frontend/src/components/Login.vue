<template>
    <form>
        <div id="login">
            <h2>Member Login</h2>
            <svg xmlns="http://www.w3.org/2000/svg" width="150" height="150" fill="currentColor" class="bi bi-people-fill" viewBox="0 0 16 16">
            <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1H7zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
            <path fill-rule="evenodd" d="M5.216 14A2.238 2.238 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.325 6.325 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1h4.216z"/>
            <path d="M4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5z"/>
            </svg>
            <div class="form-group">
            <label for="input">Email address</label>
            <input id="input" type="email" class="form-control" placeholder="Enter your email">
        </div>
        <div class="form-group">
            <label for="input">Password</label>
            <input id="input" type="password" class="form-control" placeholder="Password">
            <button id="loginButton" type="submit" class="btn w-100 mt-4 ">LOGIN</button>
        </div>
        </div>
    </form>
</template>

<script>
    export default {
    name: "Login"
    }
</script>
<style>
    #login{
        margin: 10px;
        padding: 20px;
        background-color: whitesmoke;
        border: 1px solid rgba(117, 116, 116, 0.26);
        box-shadow: 1px -2px 15px -3px rgba(0,0,0,0.88);
        border-radius: 15px;
    }
    #login h2{
        font-weight: bold;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        -webkit-animation: focus-in-expand-fwd 2s cubic-bezier(0.250, 0.460, 0.450, 0.940) both;
	        animation: focus-in-expand-fwd 2s cubic-bezier(0.250, 0.460, 0.450, 0.940) both;
    }
    form{
        margin: 20px;
        width: 500px;
        padding: 20px;
    }
    label{
        float: left;
        margin: 5px;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        font-size: x-large;
    }
    #extrabuttons{
        box-shadow: 1px -2px 15px -3px rgba(0,0,0,0.58);
    }
    #login input{
        border-radius: 20px;
        padding: 15px;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        font-weight: bold;
        background-color: floralwhite;
    }
    #login input:focus::placeholder{
        color: transparent;
    }
    #loginButton{
        background-color: mediumseagreen;
        color: white;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        font-size: large;
        border-radius: 20px;
        padding: 10px;
    }
        @-webkit-keyframes focus-in-expand-fwd {
    0% {
        letter-spacing: -0.5em;
        -webkit-transform: translateZ(-800px);
                transform: translateZ(-800px);
        -webkit-filter: blur(12px);
                filter: blur(12px);
        opacity: 0;
    }
    100% {
        -webkit-transform: translateZ(0);
                transform: translateZ(0);
        -webkit-filter: blur(0);
                filter: blur(0);
        opacity: 1;
    }
    }
    @keyframes focus-in-expand-fwd {
    0% {
        letter-spacing: -0.5em;
        -webkit-transform: translateZ(-800px);
                transform: translateZ(-800px);
        -webkit-filter: blur(12px);
                filter: blur(12px);
        opacity: 0;
    }
    100% {
        -webkit-transform: translateZ(0);
                transform: translateZ(0);
        -webkit-filter: blur(0);
                filter: blur(0);
        opacity: 1;
    }
    }
    
</style>