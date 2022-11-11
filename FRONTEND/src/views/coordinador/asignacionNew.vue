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
          <h3>Nuevo resultado de asignación</h3>
        </div>
        
        <br>
        RESULTADOS 
        <br><br>
        Listado de sugerencias
           
        <br>
        <div>
          <b-table striped hover id="pages-table" :items="users" :fields="fields">
            <template #cell(asignar)="row">
              <b-button class="mr-2">Asignar
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
import SidebarMenuAkahon from "@/components/SideBarCoord.vue"
import axios from "axios";
export default {
  name: 'estudiantesCord',
  props: {
    msg: String
  },
   components: {
    SidebarMenuAkahon,
  },
  data() {
    return {
      estudiantes: {

        id: null,

        nombre: null,

        clase: null,

        emprendimiento: null,

        asignar: null,


} ,
      fields: [
        {
          key: "id",
        },
        {
          key: "nombre",
        },
        {
          key: "clase",
        },
        {
          key: "emprendmineito",
        },
        {
          key: "Asignar",
        },
        
      ],

      form: {
          estado: '',

        },

        estado: [{ text: 'Selecione una', value: null }, 'Pendiente', 'Satisfecho'],
        show: true
      }
    },
    items: [
    {
      label: "Refrescar",
      icon: "pi pi-fw pi-refresh",
      command: () => {
        this.getAll();
      }
    }
  ],
  mounted() {

axios.get("http://localhost:8080/api/asignacionNueva").then(

(response) => {

this.items= response.data;

}

);
},
  methods: {
    handleInput(value, data) {},
  },
};

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
