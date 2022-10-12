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
          <h3>Se encuentra en el ciclo 2022-03</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div>
        <router-link to="/estudiantes">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Estudiantes</button></router-link><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Organizaciones Sociales</button>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Docentes</button>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Grupos de clase</button>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Emprendimientos</button>

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
