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
        </div>


        Listado de estudiantes preinscritos
        <br>
        <div>

          
         <b-editable-table striped hoverw
      bordered
      class="editable-table"
      v-model="users"
      :fields="fields"
      @input-change="handleInput">

          </b-editable-table>
        </div>
        Listado de estudiantes inscritos

           <br>
           <div>
             <b-table striped hover id="pages-table" :items="users" :fields="fields">
               <template #cell(Editar)="row">
                <router-link to="/stuEdit">
                 <b-button class="mr-2">Editar
                 </b-button></router-link>
               </template>
               <template #cell(Eliminar)="row">
                 <b-button class="mr-2">Eliminar
                 </b-button>
               </template>
             </b-table>
           </div>
           <br>  
              </b-col>
              <b-col>
              
              </b-col>
            </b-row>
          </b-container>   
        </template>

<script>
import axios from "axios";
import SidebarMenuAkahon from "@/components/SideBar.vue"
import service from "@/service/studentData"
export default {
  components: {
    SidebarMenuAkahon,
  },
name: "user",

data() {

  return{
    users: {

id: null,

nombre: null,

asignatura: null,

identificacion: null,

} ,

fields: [

  { key: "id" },

  { key: "nombre" },

  { key: "asignatura" },

  { key: "Editar" },

  { key: "Eliminar" }

],



  }
},
mounted() {

  axios.get("http://localhost:8080/api/gesStu").then(

(response) => {

  this.users= response.data;

}

);
}




}



/*
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
    update(data) {
      // I need to disable the button here
      this.output = data;
      data.item.name = "Dave";
      this.$refs["btn" + data.index].disabled = true      
    }
  },
  
      return {
        items: [
          { ID: 40, Nombres: 'Dickerson', Apellido: 'Macdonald', Asignatura: '2353001', Clase: '4202', Emprendimiento: 'emprendimiento 2' },
          { ID: 21, Nombres: 'Larsen', Apellido: 'Shaw', Asignatura: '2353001', Clase: '4202' },
          { ID: 89, Nombres: 'Geneva', Apellido: 'Wilson', Asignatura: '2353001', Clase: '4206', Emprendimiento: 'emprendimiento 2' },
          { ID: 38, Nombres: 'Jami', Apellido: 'Carney', Asignatura: '2353001', Clase: '4208', Emprendimiento: 'emprendimiento 1',isActive: true }
        ],
        items2: [
          { ID: 40, Nombres: 'Dickerson', Apellido: 'Macdonald', Asignatura: '2353001', Requisitos: 'Satisfecho' },
          { ID: 21, Nombres: 'Larsen', Apellido: 'Shaw', Asignatura: '2353001', Requisitos: 'Pendiente' },
          { ID: 89, Nombres: 'Geneva', Apellido: 'Wilson', Asignatura: '2353001', Requisitos: 'Pendiente' },
          { ID: 38, Nombres: 'Jami', Apellido: 'Carney', Asignatura: '2353001', Requisitos: 'Satisfecho' }
        ],fields: [
          {
            key: "ID",
            label: "ID",
            sortable: true
          },
          { key: "Nombres" },
          { key: "Apellido" },
          { key: "Asignatura" },
          { key: "Clase" },
          { key: "Emprendimiento" },
          { key: "Editar" },
          { key: "Eliminar" }
        ],fields2: [
          {
            key: "ID",
            label: "ID",
            sortable: true
          },
          { key: "Nombres" },
          { key: "Apellido" },
          { key: "Asignatura" },
          { key: "Requisitos" },
          { key: "Editar" },
          { key: "Eliminar" }
        ]
      }      
  }
}*/

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
