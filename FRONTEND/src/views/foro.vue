<template>
<b-container class="bv-example-row">
  <div class="home">
    <img alt="Vue logo" src="../assets/escudoPUJ.png" width="20%" height="10%" >

    <hr width=100% color=#e3b82a  size=50   noshade="noshade">
    <hr width=100%  color=#fff size=50   noshade="noshade">
    <hr width=100%  color=#2C5698  size=50   noshade="noshade">
    <div class="texto">
    <h1><br>Bienvenido a la red colaborativa de AANTIK</h1><br>
    <h3>Acá podrá solucionar sus dudas con la comunidad</h3><br>
    </div>
  </div>
  
  <div v-for="item in items" :key="item.id">
    <b-card bg-variant="light" border-variant="secondary">
      <template #header>
        <h6 class="mb-0"> <b>Pregunta de: </b> </h6> <v-card-title v-text="item.Nombres"/>
      </template>
      <h4><b><v-card-title v-text="item.Titulo"/></b></h4>
      <b-card-text>
        <h6><b>Fecha:</b></h6> <v-card-text v-text="item.Fecha"/><br><br>
        <v-card-text v-text="item.Pregunta"/><br><br>
        
          <textarea class="inputArea" v-model="Commenttext" type="text" placeholder=" Ingresar una respuesta..." ref="com"></textarea>
          <Button @click="handleComments" class="btn btn-primary btn-block">
            Comentar
          </Button>
          
      <div class="respostas" v-for="comments in comment" :key="comments.id">
        <b-card class="card-body">
          <b>
            <div>
            <v-card-body class="dataTitle" v-text="comments.createdby"/>
            </div>
            <div class="dataComment">
            <v-card-body v-text="comments.createDate"/>
            </div>
          </b>
          <b-card-text class="databody" v-text="comments.commentBody"></b-card-text> 
        </b-card>
      </div>
       </b-card-text>
      <template #footer>
        <em> </em>
      </template>
    </b-card>
    <br>
  </div>
    <b-col></b-col>
</b-container>
</template>

<script>
import axios from 'axios';
import service from "@/service/auth.service"
import estudianteEditVue from './coordinador/estudianteEdit.vue';
export default {
  name: 'foro',
  props: {
    msg: String
  },components: {
  },
  data() {
      return {
        commentBody:"",
        createdby:"",
        idPost:"",
        response:"",
        test:"",
        items: [
          { Nombres: 'America solidaria', Pregunta: 'Como puedo registrar un nuevo emprendimiento', Fecha: '01/01/22'},
          { Nombres: 'Org Soc1 ', Pregunta: 'Como puedo encontrar clientes', Fecha: '02/03/22' },
         ],
         comment:{
          idPost:null,
          id:null,
          createdby:null,
          commentBody:null,
          createDate:null
         },
         commenfield:[
          {
            key:"idpost",
          },
          {
            key:"id"
          },
          {
            key: "createdby"
          },
          {
            key: "commentBody"
          },
          {
            key: "createDate"
          }
        
          ],
        items2: [
          { Nombres: 'Emprendimiento 1', Respuesta: 'Comunicandose con coordinacion de proyectos' },
         // { Nombres: 'Estudiante pepito', Respuesta: 'Te enviaremos un correo con la información'}
       ]
      }      
  },
  methods: {
    handleComments(){
      console.log(service.getUser())
      //console.log(this.Commenttext)
      return axios.post("http://localhost:8080/make", {
        
        createdby:service.getUser(),
        commentBody: this.Commenttext,
        idPost:"ss",

    }).then((response) => {
      this.comment=response.data;
      this.Commenttext="";
    })
    
    }
  },
  mounted(){
    axios.get("http://localhost:8080/foro").then((response)=>{
      console.log(response)
      this.comment=response.data;
      console.log(this.comment)
    })
  }
  
  
}
</script>

<style scoped>

  hr {
    height: 25px;
    margin-top: 0px;
    margin-bottom: 0px;
  }
  .card-body {
    flex: 1 1 auto;
    min-height: 0.8px;
    padding: 1.25rem;
    border-radius: 0.9rem;
}
  .btn{
    width: 15%;
  }
  .respostas{
    margin-top: 10px;
    border-radius: 2rem;
    height: auto;

  }
  .databody{
    font-family: "Georgia";
  }
  .dataTitle{
    font-family: "Lucida Handwriting";
  }
  .dataComment{
    color: darkgrey;
    text-align: left;
    font-family: "Courrier New";
    text-size-adjust: 2px;
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
  .inputArea{
    width: 100%;
    border-radius: 0.25em;
  }
</style>
  
