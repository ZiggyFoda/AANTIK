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
          <h3>Gestor de estudiantes</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div>
        <router-link to="/subirFile">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Agregar estudiante preinscrito</button></router-link><br>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Agregar estudiante</button>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Eliminar estudiante</button>
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Modificar estudiante</button>
        <br>
        Listado de estudiantes inscritos
        <br>
        <div>
          <b-table striped hover :items="items"></b-table>
        </div>
        <br>
        Listado de estudiantes preinscritos
        <br>
        <div>
          <b-table striped hover :items="items2"></b-table>
        </div>  
              </b-col>
              <b-col>
              
              </b-col>
            </b-row>
          </b-container>   
        </template>

<script>
import SidebarMenuAkahon from "@/components/SideBar.vue"

export default {
  name: 'estudiantesCord',
  props: {
    msg: String
  },
   components: {
    SidebarMenuAkahon,
  },
  methods: {
    search() {
      
    },
    get_contacts: function(){
      fetch("./contactos.php")
      .then(response=>response.json())
      .then(json=>{this.all_data=json.contactos})
    }
		
  },
  data() {
      return {
        items,
        items2
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
