<template>
  <div id="app" class="container-fluid">

    <div class="col-md-9 panel panel-default">
      <tree
        ref="tree"
        :identifier="getId"
        :zoomable="zoomable"
        :data="Graph.tree2"
        :node-text="nodeText"
        :margin-x="Marginx"
        :margin-y="Marginy"
        :radius="radius"
        :type="type"
        :layout-type="vertical"
        :duration="duration"
        class="tree"
        @clicked="onClick"
        @expand="onExpand"
        @retract="onRetract"
      >
      
    </tree>
    </div>
  </div>
</template>

<script>
//import { tree } from "vued3tree";
import axios from "axios";
// import data from "../../data/data";
var data = {
  Graph: {
    tree: {
      id: 0,
      text: "ENTIDAD",
      photo: "http://lorempixel.com/60/60/cats/2",
      children: [
        {
          id: 1,
          text: "CLIENTES",
          photo: "http://lorempixel.com/60/60/cats/3",
          children: [
            {
              id: 11,
              text: "Data",
              photo: "http://lorempixel.com/60/60/cats/5",
              children: [
                {
                  id: 49,
                  text: "Query",
                  children: [
                    {
                      children: [],
                      id: 53,
                      text: "DiscogsEntityType",
                    },
                    {
                      children: [],
                      id: 51,
                      text: "DiscogsSortInformation",
                    },
                  ],
                },
              ],
            },
            {
              id: 8,
              text: "Internal",
              photo: "http://lorempixel.com/60/60/cats/2",
              children: [
                {
                  children: [],
                  id: 9,
                  text: "DiscogsWebClient",
                },
                {
                  children: [],
                  id: 10,
                  text: "IDiscogsWebClient",
                },
              ],
            },
            {
              children: [],
              id: 2,
              text: "DiscogsAuthentifierClient",
              photo: "http://lorempixel.com/60/60/cats/2",
            },
            {
              children: [],
              id: 3,
              text: "DiscogsClient",
              photo: "http://lorempixel.com/60/60/cats/4",
            },
          ],
        },
        {
          id: 49,
          text: "PROVEEDORES",
          children: [
            {
              children: [],
              id: 53,
              text: "DiscogsEntityType",
            },
            {
              children: [],
              id: 51,
              text: "DiscogsSortInformation",
            },
          ],
        },
        {
          id: 49,
          text: "ALIADOS",
          children: [
            {
              children: [],
              id: 53,
              text: "DiscogsEntityType",
            },
            {
              children: [],
              id: 51,
              text: "DiscogsSortInformation",
            },
          ],
        },
      ],
    },

    text: "DiscogsClient",
  },
  aliado:[{
    nombre:'empresa2',
    direccion: 'cra 34# 34',
    telefono: '2322332',
    descripcion: 'emprendimiento base',
  },
  {
    nombre:'empresa3',
    direccion: 'cra 34# 34',
    telefono: '2322332',
    descripcion: 'emprendimiento base',
  }],
  Graph: {
    tree2: {
      text: 'Empresa1',
      children: [
        {
          text: 'ALIADOS',
          children: [{
            ALIAM:[{NOM:'´HJUH'}],
            text: '[ALIAM] \n hjhg'
            
          }],         
      },
      {
          text: 'CLIENTES',
          children: [{
            text: '[aliado]'
          }],         
      },
      {
          text: 'PROVEEDORES',
          children: [{
            text: '[aliado]'
          }],         
      }
      ],
 
    }
  }
};

Object.assign(data, {
  type: "tree",
  duration: 750,
  Marginx: 30,
  Marginy: 30,
  radius: 3,
  nodeText: "text",
  currentNode: null,
  zoomable: true,
  isLoading: false,
  events: [],
});

export default {
  name: "app",
  data() {
    return data;
  },
  components: {
    tree,
  },
  methods: {
    getId(node) {
      return node.id;
    },
    onClick(evt) {
      this.currentNode = evt.element;
      this.onEvent("onClick", evt);
    },
    onExpand(evt) {
      this.onEvent("onExpand", evt);
    },
    onRetract(evt) {
      this.onEvent("onRetract", evt);
    },
    onEvent(eventName, data) {
      this.events.push({ eventName, data: data.data });
    },
  },

  async mounted() {},
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 20px;
}

.node {
  cursor: pointer;
  height: 20px;
}

.node circle {
  fill: #fff;
  stroke: steelblue;
  stroke-width: 1.5px;
}

.node text {
  font: 55px sans-serif;
}

.link {
  fill: none;
  stroke: #ccc;
  stroke-width: 1.5px;
}

.tree {
  height: 600px;
  width: 1000px;
}

.graph-root {
  height: 800px;
  width: 100%;
}

.feedback {
  height: 50px;
  line-height: 50px;
  vertical-align: middle;
}

.log {
  height: 200px;
  overflow-x: auto;
  overflow-y: auto;
  overflow: auto;
  text-align: left;
}

text {
    display: block;
    white-space: nowrap;
    font-size: 550px;
}
</style>
