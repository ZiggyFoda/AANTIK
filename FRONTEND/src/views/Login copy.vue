<template>
  <b-container>   
    <b-row>
    <b-col>    
    </b-col>
    <b-col>
     <div class="vue-tempalte">
        <img alt="Vue logo" src="../assets/escudoPUJ.png" width="75%" height="25%"/>
        <form>
            <h3>AANTIK</h3>
            <h3>Inicio de sesión</h3>
            <div class="form-group">
                <label>Correo electronico</label>
                <input v-model="persona.username" type="email" class="form-control form-control-lg"/>
            </div>
            <div class="form-group">
                <label>Contraseña</label>
                <input v-model="persona.password" type="password" class="form-control form-control-lg" />
            </div>
            <button type="submit" class="btn btn-dark btn-lg btn-block" @click="save">
            Ingresar</button>
            <p class="forgot-password text-right mt-2 mb-4">
                <router-link to="/login">Olvidó su contraseña?</router-link>
            </p>
        </form>
    </div>
    </b-col>
    
    <b-col>
    </b-col>
  </b-row>
  </b-container>
</template>



<script>
import LoginService from "../service/LoginService";
export default {
  name: "CrudApp",
  data() {
    return{
      persona: {
        username: null,
        password: null
      }
    };
  },
  loginService: null,
  created() {
    this.loginService = new LoginService();
  },
  methods: {
    async save() {
      try {
        this.loginService.save(this.persona);
        console.log(this.persona);
        this.$router.push("/")
      } catch (error) {
        console.log(error);
      }
    },
      print() {
        console.log("Esto es un método"+this.persona.email);
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
