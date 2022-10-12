<template>
  <div id="app" class="container-fluid">
    <div class="large-12 medium-12 small-12 cell" id="app">
      <input type="file" accept="application/json" />
    </div>
    <div class="col-md-9 panel panel-default">
      <tree
        ref="tree"
        :identifier="getId"
        :zoomable="zoomable"
        :data="Graph.tree"
        :node-text="nodeText"
        :margin-x="Marginx"
        :margin-y="Marginy"
        :radius="radius"
        :type="type"
        :layout-type="layoutType"
        :duration="duration"
        class="tree"
        @clicked="onClick"
        @expand="onExpand"
        @retract="onRetract"
      />
    </div>
  </div>
</template>

<script>
import { tree } from "vued3tree";
import axios from "axios";
// import data from "../../data/data";
var data = {
  Graph: {
    tree: {
      id: 0,
      text: "DiscogsClient MAIN",
      photo: "http://lorempixel.com/60/60/cats/2",
      children: [
        {
          id: 1,
          text: "DiscogsClient",
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
      ],
    },

    text: "DiscogsClient",
  },
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
}

.node circle {
  fill: #fff;
  stroke: steelblue;
  stroke-width: 1.5px;
}

.node text {
  font: 10px sans-serif;
}

.link {
  fill: none;
  stroke: #ccc;
  stroke-width: 1.5px;
}

.tree {
  height: 800px;
  width: 800px;
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
</style>
