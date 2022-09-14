import axios from 'axios';

export default class LoginService {

    url = "http://localhost:8080/";

    getAll() {
        return axios.get(this.url + "all");
    }

    async save(user) {
        return axios.post(this.url + "save",{
          username:user.username,
          password:user.password,
        }).then(response => {
        console.log("RES"+response.id);
        })
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