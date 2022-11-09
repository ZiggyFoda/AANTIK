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
          <b-table striped hover id="pages-table" :items="items" :fields="fields">
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
  data() {
      return {
        items: [
          { ID: 40, Nombres: 'Dickerson', Clase:'2230' , Emprendimiento: 'emprendimiento 2' },
          { ID: 40, Nombres: 'Dickerson', Clase:'2230' , Emprendimiento: 'emprendimiento 2' },
          { ID: 40, Nombres: 'Dickerson', Clase:'2230' , Emprendimiento: 'emprendimiento 2' }
        ],fields: [
          {
            key: "ID",
            label: "ID",
            sortable: true
          },
          { key: "Nombres" },
          { key: "Clase" },
          { key: "Emprendimiento" },
          { key: "asignar" }
        ]
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
