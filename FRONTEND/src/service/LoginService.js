import axios from 'axios';

export default class LoginService {

    url = "http://localhost:8080/";

    getAll() {
        return axios.get(this.url + "all");
    }

    save(user) {
        return axios.post(this.url + "save", user)
    }
    

    register(email, password) {
      const user = { email, password };
      return axios.post(ENDPOINT_PATH + "regiser", user);
    }
    login(email, password) {
      const user = { email, password };
      return axios.post(ENDPOINT_PATH + "login", user);
    }
}