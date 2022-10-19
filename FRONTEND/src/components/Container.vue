<template>
    <div class="container">
      <Playground :nodes="nodes" :links="links"></Playground>
    </div>
  </template>
  
  <script>
  import Playground from "./Playground";
  
  export default {
    name: "Container",
    components: {
      Playground,
    },
    data() {
      return {
        nodes: [
          { id: "node1", x: 10, y: 80, width: 200, height: 150 },
          { id: "node2", x: 550, y: 80, width: 200, height: 150 },
          { id: "node3", x: 280, y: 290, width: 200, height: 150 },
          { id: "node4", x: 280, y: 50, width: 200, height: 150 },
        ],
        links: [{ from: "node1", to: "node4" },
        { from: "node2", to: "node4" },
        { from: "node4", to: "node3" }],
      };
    },
  };
  </script>
  
  <style scoped>
  .container {
    position: relative;
    width: 100%;
    height: 100%;
  }
  </style>
  