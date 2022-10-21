<template>
  <b-container>  
       <div>
          <sidebar-menu-akahon 
            @search-input-emit="search"
          />
        </div> 
    <b-row>
      <b-col>
        <div class="hello">
          <h3>Se encuentra inscrito al ciclo 2022-03</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div><br>
        Aquí puede consultar el puntaje del diagnóstico del emprendimiento asignado
         y asignar puntaje a las presuntas del diagnóstico que no se califican automáticamente.
        <router-link to="/estudiantes">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar diagnóstico</button></router-link>
        <br>
        Aquí puede definir el proyecto social y subir los informes de soporte.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Progreso</button>
        <br>
        Aquí puede consultar el benchmarking.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Benchmarking</button>
        <br>
        Aquí puede subir una noticia, ver su historial o dirigirse a 
        las noticias publicadas en el sistema.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Noticias</button>
        <br>
        Puede acceder al foro y contestar preguntas realizados por los emprendimientos
         que se están asesorando en el ciclo actual.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Red colaborativa</button>
        <br>
        Aquí puede consultar el proyecto asignado para que realice su asesoría técnica.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Consultar asignación</button><br>
        No olvide mantener sus datos actualizados.     
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Actualizar datos</button>

      </b-col>
      <b-col>
        
      </b-col>
    </b-row>
  </b-container>   
</template>

<script>
import SidebarMenuAkahon from "@/components/SideBar.vue"

export default {
  name: 'Homecoordinador',
  props: {
    msg: String
  },
   components: {
    SidebarMenuAkahon,
  },
  methods: {
    search() {
      
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
