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
         y asignar puntaje a las preguntas del diagnóstico que no se califican automáticamente.
        <router-link to="/estudiantes">
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Gestionar diagnóstico</button></router-link>
        <br>
        Aquí puede definir el proyecto social y subir los informes de soporte.
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Progreso</button>
        <br>
        Aquí puede consultar el benchmarking.
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Benchmarking</button>
        <br>
        Aquí puede subir una noticia, ver su historial o dirigirse a 
        las noticias publicadas en el sistema.
        <router-link to="/noticiaEs">
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Noticias</button></router-link>
        <br>
        Puede acceder a la red colaborativa y contestar preguntas realizados por los emprendimientos
         que se están asesorando en el ciclo actual.
        <router-link to="/foro">
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Red colaborativa</button></router-link>

        <br>
        Aquí puede consultar el proyecto asignado para que realice su asesoría técnica.
       
        <b-button v-b-modal.req class="btn btn-dark btn-lg w-100">Consultar asignación</b-button>

<b-modal id="req" title="Asignación">
  <p v-if="false" class="my-4"><b>Aun no tiene un emprendimiento asiganado</b>
  </p>
  <p v-else class="my-4">
    <b>Organizacion Social:</b> America Solidaria<br>
    <b>Emprendimiento:</b> Doña rosita<br>
    <b>Interlocutor:</b> Rosa Maria<br>
    <b>Telefono:</b> 316-325-2584<br>
    <b>Dirección:</b> Cr 123-45-6<br>

  </p>
</b-modal>
<br>
        No olvide mantener sus datos actualizados.
        <router-link to="/datosEs">   
        <button type="submit" class="btn btn-dark btn-lg w-100">
        Actualizar datos</button></router-link>

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
