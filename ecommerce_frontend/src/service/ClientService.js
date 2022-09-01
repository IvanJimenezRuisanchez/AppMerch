import axios from "axios";

const CLIENT_RESTAPI_CREATEACCOUNT = 'http://localhost:8081/api/createAccount'
const CLIENT_RESTAPI_LOGIN = 'http://localhost:8081/api/login'
const CLIENT_RESTAPI_RESETPASSWORD = 'http://localhost:8081/api/resetPassword'

class ClientService {
    createAccount(firstName,lastName,email,passWord){
        return axios.post(CLIENT_RESTAPI_CREATEACCOUNT,{firstName : firstName, lastName : lastName,email: email,passWord : passWord});
    }
    login(email,passWord){
        return axios.post(CLIENT_RESTAPI_LOGIN,{email: email,passWord : passWord});
    }
    resetPassword(email){
        return axios.post(CLIENT_RESTAPI_RESETPASSWORD,{email: email});
    }
}

export default new ClientService()