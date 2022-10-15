<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/escudoPUJ.png" width="20%" height="10%" >

    <hr width=100% color=#e3b82a  size=50   noshade="noshade">
    <hr width=100%  color=#fff size=50   noshade="noshade">
    <hr width=100%  color=#2C5698  size=50   noshade="noshade">
    <div class="texto">
    <h1><br>Ayuda del sistema AANTIK para coordinadores de asignastura</h1>
    <p class="align-left">
      <b-card>
      <template #header>
        <h6 class="mb-0"> </h6>
      </template>
      <h2>Subir archivos de excel</h2>
      Para subir una tabla de excel, debe guardar estos datos como .csv y mantener el formato definido 
      en la actualización mas reciente del software:
      <br>
      <h3>Subir estudiantes preinscritos</h3>
      .
      <br><h2>Fechas límite para actualización de información</h2>
      Recuerde que el buen funcionamiento del software se encuentra limitado con fechas, con el fin 
      de mantener un buen funcionamiento, guiado en los procesos que se lleven con el calendario 
      de la universidad:
      <br><h3>Ingresar estudiantes preinscritos</h3>
      <br><h3>Ingresar estudiantes inscrito</h3>
      <br><h3>Ingresar organizaciones sociales</h3>
      <br><h3>Ingresar emprendimientos</h3>
      <br><h3>Ingresar docentes</h3>
      <br><h3>Ingresar Grupos de clase</h3>
      <template #footer>
        <em> </em>
      </template>
    </b-card>

    </p>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import Login from '@/views/Login.vue'

export default {
  name: 'home',
  components: {
    Login
  }
}
</script>

<style scoped>

  hr {
    height: 25px;
    margin-top: 0px;
    margin-bottom: 0px;
  }
  img {
    margin-bottom:35px;
    margin-top:30px;
  }
  p {
    text-align: left;
    margin-top: 5%;
    margin-left: 12%;
    margin-right: 12%;
  }
  div.texto {
    text-align: left;
    margin-top: 5%;
    margin-left: 12%;
    margin-right: 12%;
  }
</style>
  
