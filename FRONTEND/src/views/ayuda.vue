<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/escudoPUJ.png" width="20%" height="10%" >

    <hr width=100% color=#e3b82a  size=50   noshade="noshade">
    <hr width=100%  color=#fff size=50   noshade="noshade">
    <hr width=100%  color=#2C5698  size=50   noshade="noshade">

    <h3>Bienvenido a AANTIK</h3>
    <p>AANTIK es un sistema de información personalizado para la gestión de procesos de madures
      empresarial en emprendimientos que pertenecen al programa de PSU, facilitando tareas de 
      asignación de entidad y estudiantes por medio de la personalización.
      Se permite gestionar todo el proceso de madurez empresarial del emprendimiento accediento a 
      servicios adicionales de benchmarking, información con noticias relevantes y por interés,
      foro para comunicación entre entidades, tejido social que facilita el contacto de proveedores
      y clientes entre las organizaciones que usan AANTIK.
    </p>
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
    text-align: justify;
    margin-top: 5%;
    margin-left: 12%;
    margin-right: 12%;
  }
</style>
  
