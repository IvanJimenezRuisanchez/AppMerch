<template>
    <div>
            <h2>SignUp</h2>
            <svg xmlns="http://www.w3.org/2000/svg" width="150" height="150" fill="currentColor" class="bi bi-card-checklist" viewBox="0 0 16 16">
            <path d="M14.5 3a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-13a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h13zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
            <path d="M7 5.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 1 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0zM7 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 0 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0z"/>
            </svg>
            <div class="form-group">
                <label for="input">First Name</label>
                <input id="input" type="text" class="form-control" placeholder="First Name">
                <label for="input">Last Name</label>
                <input id="input" type="text" class="form-control" placeholder="Last Name">
            </div>
            <div class="form-group">
                <label for="input">Email address</label>
                <input id="input" type="email" class="form-control" placeholder="Enter your email">
            </div>
            <div class="form-group">
                <label for="input">Password</label>
                <input id="input" type="password" class="form-control" placeholder="Password">
            <button id="loginButton" type="submit" class="btn w-100 mt-4 =">CREATE ACCOUNT</button>
        </div>
        </div>
</template>
<script>
    export default{
        name : "CreateAccount"
    }
</script>
<style>

</style>