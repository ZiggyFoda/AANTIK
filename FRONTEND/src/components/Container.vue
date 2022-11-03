<template>
  <b-container> 
  <div>
    <h2>Bienvenido al tejido humano</h2>
    <p>
  Este es un espacio colaborativo, donde podrá contactar a posibles clientes proveedores 
  y aliados estratégicos.
  <br></p></div>
    <div class="container">
      <Playground :nodes="nodes" :links="links"></Playground>
    </div>
  </b-container>
</template>
  
<script>
import Playground from "./Playground";
import TejidoService from "@/service/TejidoService";
  
  export default {
    name: "Container",
    components: {
      Playground,
    },
    data() {
      return {
        nodes: [
          { id: "node1", x: -50, y: 100, width: 320, height: 300, texto:'CLIENTES', 
          clientes:[{nombre:'cliente2',producto:'fresa',contacto:'3102223315'},
          {nombre:'cliente2',producto:'fresa',contacto:'3102223315'}]},
          { id: "node2", x: 700, y: 100, width: 320, height: 300 ,texto:'PROVEEDORES',
          clientes:[{nombre:'proveedor-2',producto:'jugos',contacto:'3102223315'}]},
          { id: "node3", x: 330, y: 290, width: 320, height: 300 ,texto:'ALIADOS',
          clientes:[{nombre:'aliado 2',producto:'moras',contacto:'3102223315'}]},
          { id: "node4", x: 400, y: 80, width: 150, height: 100 ,texto:'Emprendimiento',
          clientes:{nombre:'',producto:'',contacto:''}},
        ],
        auxiliar: null,
        links: [{ from: "node1", to: "node4" },
        { from: "node2", to: "node4" },
        { from: "node4", to: "node3" }]
      };
    },
    tejidoService: null,
    created() {      
      this.tejidoService = new TejidoService();
      this.getAll();
    },
    methods: {      
      getAll() {
      this.tejidoService.getAll().then(data => {
        this.auxiliar = data.data;
      });
      },
      print() {
        console.log("Esto es un método-----");
        console.log("Esto es un método"+this.auxiliar);
      }
    }
  };
  </script>
  
  <style scoped>
  .container {
    position: relative;
    width: 100%;
    height: 100%;
  }
  </style>
  