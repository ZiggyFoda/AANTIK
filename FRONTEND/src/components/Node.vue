<template>
    <div class="node" ref="node" :style="computedStyle"></div>
  </template>
  
  <script>
  //import { addEvent } from "../utils";
  
  export default {
    props: {
      x: Number,
      y: Number,
      width: Number,
      height: Number,
      parent: Object
    },
    data() {
      return {
        dragging: false,
        initialX: 0,
        initialY: 0,
        offsetX: 0,
        offsetY: 0
      };
    },
    computed: {
      computedStyle() {
        return {
          left: `${this.initialX}px`,
          top: `${this.initialY}px`,
          width: `${this.width}px`,
          height: `${this.height}px`
        };
      }
    },
    created() {
      this.initialX = this.x;
      this.initialY = this.y;
    },
    mounted() {
      const nodeEl = this.$refs.node;
   //   this.cancelDragStart = addEvent(nodeEl, "mousedown", this.onDragStart);
     // this.cancelDragEnd = addEvent(nodeEl, "mouseup", this.onDragEnd);
      //this.cancelDragging = addEvent(nodeEl, "mousemove", this.onDragging);
      // this.cancelLeave = addEvent(nodeEl, "mouseleave", this.onLeave);
    },
    beforeDestroy() {
      // const nodeEl = this.refs.node
      this.cancelDragStart && this.cancelDragStart();
      this.cancelDragEnd && this.cancelDragEnd();
      this.cancelDragging && this.cancelDragging();
    },
    methods: {
      onLeave() {
        if (this.dragging) {
          this.dragging = false;
        }
      },
      onDragStart(ev) {
        if (this.dragging) {
          return;
        }
        this.dragging = true;
        this.offsetX = ev.offsetX;
        this.offsetY = ev.offsetY;
      },
      onDragging(ev) {
        if (!this.dragging) {
          return;
        }
        const movementX = ev.offsetX - this.offsetX;
        const movementY = ev.offsetY - this.offsetY;
        this.initialX = this.initialX + movementX;
        this.initialY = this.initialY + movementY;
        this.$emit("update:x", this.initialX);
        this.$emit("update:y", this.initialY);
      },
      onDragEnd(ev) {
        if (ev.stopPropagation) {
          ev.stopPropagation();
        }
        if (ev.preventDefault) {
          ev.preventDefault();
        }
        if (!this.dragging) {
          return;
        }
        this.dragging = false;
        this.offsetX = 0;
        this.offsetY = 0;
      }
    }
  };
  </script>
  
  <style lang='css' scoped>
  .node {
    position: absolute;
    background: green;
    font: italic;
  }
  </style>