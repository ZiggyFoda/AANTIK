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
          <h3>Panel administrativo</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div><br><br>
        <router-link to="/estudiantes">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar estudiantes</button></router-link><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar Organizaciones Sociales</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar Docentes</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar grupos de clase</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar emprendimientos</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar coordinadores</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar foro</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar noticias</button><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Gestionar indicadores</button>
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
