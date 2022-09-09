import axios from "axios";

const CLIENT_RESTAPI_CREATEACCOUNT = 'http://localhost:8081/api/createAccount'
const CLIENT_RESTAPI_LOGIN = 'http://localhost:8081/api/login'
const CLIENT_RESTAPI_RESETPASSWORD = 'http://localhost:8081/api/resetPassword'
const CLIENT_RESTAPI_UPDATEPASSWORD = 'http://localhost:8081/api/updatePassword'
const CLIENT_RESTAPI_PRODUCTS = 'http://localhost:8081/api/products'
const CLIENT_RESTAPI_PRODUCTSBYNAME = 'http://localhost:8081/api/productsByName'
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
    updatePassword(passWord,key){
        return axios.post(CLIENT_RESTAPI_UPDATEPASSWORD,{passWord: passWord, key:key})
    }
    getProducts(){
        return axios.get(CLIENT_RESTAPI_PRODUCTS)
    }
    getProductsByName(name){
        return axios.get(CLIENT_RESTAPI_PRODUCTSBYNAME,{params: {nom: name}});
    }
}

export default new ClientService()