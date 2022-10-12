<template>
<b-container class="bv-example-row">
  <div class="home">
    <img alt="Vue logo" src="../assets/escudoPUJ.png" width="20%" height="10%" >

    <hr width=100% color=#e3b82a  size=50   noshade="noshade">
    <hr width=100%  color=#fff size=50   noshade="noshade">
    <hr width=100%  color=#2C5698  size=50   noshade="noshade">
    <div class="texto">
    <h1><br>Bienvenido al foro de AANTIK</h1>
    </div>
  </div>
  
  <div v-for="(item, i) in items">
  <b-card title="Pregunta de " ><v-card-title v-text="item.Nombres"/>
    <b-card-text>
      Fecha: <v-card-text v-text="item.Fecha"/><br>
      <v-card-text v-text="item.Pregunta"/><br>
      <br>RESPUESTAS<br></b-card-text>
      <div v-for="(item, i) in items2">
        <b-card><v-card-title v-text="item.Nombres"/>
          <b-card-text  v-text="item.Respuesta"></b-card-text> 
        </b-card>
      </div> 
      <b-form-textarea
      id="textarea"
      v-model="text"
      placeholder="Ingresar una respuesta..."
      rows="3"
      max-rows="6"
    ></b-form-textarea>
  </b-card>
  </div>
   
    <b-col></b-col>

</b-container>
</template>

<script>
export default {
  name: 'foro',
  props: {
    msg: String
  },
   components: {
  },
  methods: {
    search() {
      
    }
  },
  data() {
      return {
        items: [
          { Nombres: 'America solidaria', Pregunta: 'Como puedo registrar un nuevo emprendimiento', Fecha: '01/01/22'},
          { Nombres: 'Org Soc1 ', Pregunta: 'Como puedo encontrar clientes', Fecha: '02/03/22' },
         ],
        items2: [
          { Nombres: 'Emprendimiento 1', Respuesta: 'Comunicandose con coordinacion de proyectos' },
          { Nombres: 'Estudiante pepito', Respuesta: 'Te enviaremos un correo con la información'},
       ]
      }      
  }
}
</script>

<style scoped>

  hr {
    height: 25px;
    margin-top: 0px;
    margin-bottom: 0px;
  }
  img {
    margin-bottom:35px;
    margin-top:30px;
  }
  p {
    text-align: left;
    margin-top: 5%;
    margin-left: 12%;
    margin-right: 12%;
  }
  b-row.entidad{
    text-align: left;
    color: aqua;
    margin-top: 5%;
    margin-left: 12%;
    margin-right: 12%;
  }
</style>
  
