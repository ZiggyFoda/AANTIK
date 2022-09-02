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
      
    }
  },
  data() {
      return {
        items: [
          { ID: 40, Nombres: 'Dickerson', Apellido: 'Macdonald', Asignatura: '2353001', Clase: '4202', Emprendimiento: 'emprendimiento 2' },
          { ID: 21, Nombres: 'Larsen', Apellido: 'Shaw', Asignatura: '2353001', Clase: '4202' },
          { ID: 89, Nombres: 'Geneva', Apellido: 'Wilson', Asignatura: '2353001', Clase: '4206', Emprendimiento: 'emprendimiento 2' },
          { ID: 38, Nombres: 'Jami', Apellido: 'Carney', Asignatura: '2353001', Clase: '4208', Emprendimiento: 'emprendimiento 1' }
        ],
        items2: [
          { ID: 40, Nombres: 'Dickerson', Apellido: 'Macdonald', Asignatura: '2353001', Clase: '4202', Requisitos: 'Satisfecho' },
          { ID: 21, Nombres: 'Larsen', Apellido: 'Shaw', Asignatura: '2353001', Clase: '4202', Requisitos: 'Pendiente' },
          { ID: 89, Nombres: 'Geneva', Apellido: 'Wilson', Asignatura: '2353001', Clase: '4206', Requisitos: 'Pendiente' },
          { ID: 38, Nombres: 'Jami', Apellido: 'Carney', Asignatura: '2353001', Clase: '4208', Requisitos: 'Satisfecho' }
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
