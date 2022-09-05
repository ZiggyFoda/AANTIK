<template>
  <b-container>   
    <v-footer padless>
  <hr width=100%  color=#e3b82a  size=50   noshade="noshade">
  <hr width=100%  color=#fff size=50   noshade="noshade">
  <hr width=100%  color=#2C5698  size=50   noshade="noshade"></v-footer>
  </b-container>
</template>



<script>
import LoginService from "../service/LoginService";
  export default {
      name: 'loginUser',
  data() {
            return {}
  }, 
  loginService: null,
  created() {
    this.loginService = new LoginService();
  },
  methods: {
    save() {
      this.loginService.save(this.user).then(data => {
        if (data.status === 200) {
          this.displayModal = false;
          this.user = {
            username: null,
            password: null
          };
          this.getAll();
        }
      });
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
