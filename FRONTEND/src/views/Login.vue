<template>
  <b-container>   
    <b-row>
    <b-col>
    </b-col>
    <b-col>
     <div class="vue-tempalte">
        <form>
            <h3>AANTIK</h3>
            <h3>Inicio de sesión estudiante</h3>
            Seleccione una opción:
            <select name="combo">
              <!-- Opciones de la lista -->
              <option value="1">Estudiante</option>
              <option value="2" selected>Organización Social</option> <!-- Opción por defecto -->
              <option value="3">Emprendimiento</option>
              <option value="3">Docente</option>
              <option value="3">Coordinador PSU</option>
              <option value="3">Administrador</option>
            </select>
            <div class="form-group">
                <label>Correo electronico</label>
                <input type="email" class="form-control form-control-lg" v-model="user.username"  />
            </div>
            <div class="form-group">
                <label>Contraseña</label>
                <input type="password" class="form-control form-control-lg" v-model="user.password"  />
            </div>
            <router-link to="/about">
            <button type="submit" class="btn btn-dark btn-lg btn-block" @click="save">
            Ingresar</button></router-link>
            <p class="forgot-password text-right mt-2 mb-4">
                <router-link to="/HelloWorld2" exact>Olvidó su contraseña?</router-link>
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
