import axios from "axios";

const CLIENT_API_URL = 'http://localhost:8081/api'

class ClientService {
    logIn(){
        return axios.get(CLIENT_API_URL)
    }
}

export default new ClientService()