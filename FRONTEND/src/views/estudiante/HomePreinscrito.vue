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
          <h3>Se encuentra preinscrito en el ciclo '2022-03'</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div><br>
        Es importante que verifique sus datos y los actualice
        <router-link to="/estudiantes">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Actualizar datos</button></router-link>
        <br>
        La asignación de emprendimientos se realizará por medio de la personalización 
        para esto debe llenar el formulario que se encuentra aquí
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Formato de personalización</button>
        <br>
        Verifique el cumplimiento de sus requisitos, en caso de haber algún error 
        comuniquese con el/la coordinador/a de la asignatura.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Consultar requisitos</button>
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
