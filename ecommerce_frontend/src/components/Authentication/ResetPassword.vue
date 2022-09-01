<template>
    <div>
        <div class="form-group">
            <h2>Reset Password</h2>
            <svg xmlns="http://www.w3.org/2000/svg" width="150" height="150" fill="currentColor" class="bi bi-envelope-check" viewBox="0 0 16 16">
            <path d="M2 2a2 2 0 0 0-2 2v8.01A2 2 0 0 0 2 14h5.5a.5.5 0 0 0 0-1H2a1 1 0 0 1-.966-.741l5.64-3.471L8 9.583l7-4.2V8.5a.5.5 0 0 0 1 0V4a2 2 0 0 0-2-2H2Zm3.708 6.208L1 11.105V5.383l4.708 2.825ZM1 4.217V4a1 1 0 0 1 1-1h12a1 1 0 0 1 1 1v.217l-7 4.2-7-4.2Z"/>
            <path d="M16 12.5a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Zm-1.993-1.679a.5.5 0 0 0-.686.172l-1.17 1.95-.547-.547a.5.5 0 0 0-.708.708l.774.773a.75.75 0 0 0 1.174-.144l1.335-2.226a.5.5 0 0 0-.172-.686Z"/>
            </svg>
            <p>Enter your email addres and we'll send you an email with instructions to reset your password
            </p>
            <input id="input" type="email" class="form-control" placeholder="Email address">
            <button id="loginButton" type="submit" class="btn w-100 mt-4 =">SEND</button><br><br><hr>
            <div id="info">
                <svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" fill="currentColor" class="bi bi-info-circle" viewBox="0 0 16 16">
                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                <path d="m8.93 6.588-2.29.287-.082.38.45.083c.294.07.352.176.288.469l-.738 3.468c-.194.897.105 1.319.808 1.319.545 0 1.178-.252 1.465-.598l.088-.416c-.2.176-.492.246-.686.246-.275 0-.375-.193-.304-.533L8.93 6.588zM9 4.5a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
                </svg>
                <p id="icon">If you dont receive an email from us within a few minutes check your spam filter as sometimes they end up in there. The email will be from:<br><span>blabla@help.21</span></p>
            </div>
        </div>
    </div>
</template>
<script>
    export default{
        name: 'ResetPassword'
    }
</script>
<style>
    #info{
        display: flex;
    }
    #icon{
        margin-top: 10px;
        font-weight: bold;
    }
    span{
        text-decoration: underline;
        font-size: x-large;
        text-align: center;
    }
</style>