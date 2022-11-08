<template>
  <div id="app">
    <!-- <img width="25%" src="./assets/logo.png"> -->
    <container></container>
    <br>
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
