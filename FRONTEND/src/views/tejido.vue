<template>
  <div id="app">
    <!-- <img width="25%" src="./assets/logo.png"> -->
    <container></container>
  </div>
</template>

<script>
import Container from "../components/Container";
import TejidoService from "@/service/TejidoService";

export default {
  name: "App",
  components: {
    Container
  },
  data(){    
    return{
     emprendimineto: [{clientes:[{nombre:null,teleefono:null,contacto:null}],
    aliados:[{nombre:null,teleefono:null,contacto:null}],
    proveedores:[{nombre:null,teleefono:null,contacto:null}]
  }],
    }
  },
  tejidoService: null,
  created() {      
      this.tejidoService = new TejidoService();
      this.getAll();
      this.print();
  },
  methods: {      
      getAll() {
      this.tejidoService.getAll().then(data => {
        this.emprendimineto = data.data;
        console.log("Esto es un método CLIE"+this.emprendimineto.clientes.teleefono);
        console.log("Esto es un método PROV"+this.emprendimineto.proveedores.nombre);
        console.log("Esto es un método ALIA"+this.emprendimineto.aliados.contacto);
      });
      },
      print() {
        console.log("Esto es un método-----");
        console.log("Esto es un método== "+this.emprendimineto.clientes);
      }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /* margin-top: 60px; */
  width: 100%;
  height: 100%;
}
html,
body {
  margin: 0;
  width: 100%;
  height: 100%;
}
</style>
