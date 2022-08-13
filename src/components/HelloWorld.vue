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
            <div class="form-group">
                <label>Correo electronico</label>
                <input type="email" class="form-control form-control-lg" />
            </div>
            <div class="form-group">
                <label>Contraseña</label>
                <input type="password" class="form-control form-control-lg" />
            </div>
            <button type="submit" class="btn btn-dark btn-lg btn-block" @click="sendToView(view)">
            <router-link to="/about">Ingresar</router-link></button>
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

  export default {
      name: 'HelloWorld',
  data() {
            return {}
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
