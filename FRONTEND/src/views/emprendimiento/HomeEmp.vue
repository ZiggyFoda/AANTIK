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
          <h3>Emprendimiento 'nombre'</h3>
          <label-edit :text="text" id="labeledit1" v-on:text-updated="textUpdated" placeholder="Enter some text"></label-edit>
        </div>
        <br>
        Aquí puede responder las preguntas del benchmarking.

        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Responder</button>
        <br>
        Aquí puede ver su estado
        <button @click="$bvModal.show('my-modal1')" class="btn btn-dark btn-lg btn-block">
        Ver estado</button>
        <b-modal id="my-modal1">Estado: En proceso de maduracion (tilde plz)</b-modal>
        <br>
        Aquí puede ver los estudiantes asiganados a su proyecto
        <button @click="$bvModal.show('my-modal2')" class="btn btn-dark btn-lg btn-block">
        Estudiantes</button>
        <b-modal id="my-modal2">Billy info billy <br> Mandy info Mandy</b-modal>        
        <br>
        Recuerde mantener sus datos actualizados con el fin de garantizar
         el buen funcionamiento del sistema.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Actualizar datos</button>
        <br>
        Aqui puede ver el historial de los procesos de madurez realizados
        desde el uso de la aplicación.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Ver historial</button>
        <br>
        Si te interesa conocer de estrategias sugeridas de crecimiento
         basado en la situación del sector economico, ingresa aquí.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Benchmarking</button>
        <br>
        En este módulo puede encontrar noticias por sector economico y 
        enfocadas a los emprendimientos, adicionalmente puede acceder a la 
        red de colaboracion.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Módulo de información</button>
        <br>
        Si te interesa conseguir clientes, proveedores o posibles 
        aliados, ingrese aquí.
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Tejido social</button>
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
