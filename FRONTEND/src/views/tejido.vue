<template>
  <b-container class="bv-example-row">
    <div class="home">
      <img alt="Vue logo" src="../assets/escudoPUJ.png" width="20%" height="10%" >
  
      <hr width=100% color=#e3b82a  size=50   noshade="noshade">
      <hr width=100%  color=#fff size=50   noshade="noshade">
      <hr width=100%  color=#2C5698  size=50   noshade="noshade">
      <div class="texto">
      <h1><br>Bienvenido al Tejido Humano de AANTIK</h1>
      </div>
    </div>
    
    <div>
  <b-card-group columns>
    <b-card
      title="Emprendimiento"
    >
    
      <b-card-text>
        emprendmienito de artesanias
      </b-card-text>
    </b-card>
    <b-card-group deck>
      <div v-for="(item, i) in items">
    <b-card title="Cliente" >
      <b-card-text>
        This is a wider card with supporting text below as a natural lead-in to additional content.
        This content is a little bit longer.
      </b-card-text>
      <template #footer>
        <div>
  <b-button v-b-modal.modal-1>Contacto</b-button>

  <b-modal id="modal-1" i title="Informacion de contacto">
    <p class="my-4">Bogota, Colombia <br> Cr 15a #123-45</p>
  </b-modal>
</div>
      </template>
    </b-card>
  </div>
  </b-card-group>

  <b-card-group deck>
    <div v-for="(item2, i) in items">
    <b-card title="Proveedor" >
      <b-card-text>
        This is a wider card with supporting text below as a natural lead-in to additional content.
        This card has even longer content than the first to show that equal height action.
      </b-card-text>
      <template #footer>
        <div>
  <b-button v-b-modal.modal-1>Contacto</b-button>

  <b-modal id="modal-2" i title="Informacion de contacto">
    <p class="my-4">Bogota, Colombia <br> Cr 15a #123-45</p>
  </b-modal>
</div>
      </template>
    </b-card>
  </div>
  </b-card-group>
  <b-card-group deck>
    <div v-for="(item3, i) in items">
    <b-card title="Aliado Estrategico" >
      <b-card-text>
        This is a wider card with supporting text below as a natural lead-in to additional content.
        This card has even longer content than the first to show that equal height action.
      </b-card-text>
      <template #footer>
        <div>
  <b-button v-b-modal.modal-1>Contacto</b-button>

  <b-modal id="mod" title="Informacion de contacto">
    <p class="my-4">Bogota, Colombia <br> Cr 15a #123-45</p>
  </b-modal>
</div>
      </template>
    </b-card>
  </div>
  </b-card-group>

  </b-card-group>
</div>


    <div v-for="(item, i) in items">
      <b-card bg-variant="light" border-variant="secondary">
        <template #header>
          <h6 class="mb-0"> <b>Pregunta de: </b> </h6> <v-card-title v-text="item.Nombres"/>
        </template>
        <h4><b><v-card-title v-text="item.Titulo"/></b></h4>
        <b-card-text>
          <h6><b>Fecha:</b></h6> <v-card-text v-text="item.Fecha"/><br><br>
          <v-card-text v-text="item.Pregunta"/><br><br>
          <div v-for="(item, i) in items2">
          <b-card ><b><v-card-title v-text="item.Nombres"/></b>
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
            { Nombres: 'Org Soc1 ', Pregunta: 'Como puedo encontrar clientes', Fecha: '02/03/22' },
           ],
          items2: [
            { Nombres: 'Emprendimiento 1', Respuesta: 'Comunicandose con coordinacion de proyectos' },
            { Nombres: 'Estudiante pepito', Respuesta: 'Te enviaremos un correo con la información'},
         ],
         items3: [
            { Nombres: 'Emprendimiento 1', Respuesta: 'Comunicandose con coordinacion de proyectos' },
            { Nombres: 'Estudiante pepito', Respuesta: 'Te enviaremos un correo con la información'},
            { Nombres: 'Estudiante ps', Respuesta: 'Te enviaremos un correo con la información'},
         ],
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
    
  