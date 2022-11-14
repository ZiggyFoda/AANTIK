<template>
    <b-container>  
         <div>
            <sidebar-menu-akahon 
            />
          </div> 
      <b-row>
        <b-col>
          <div class="hello">
            <h3>Conozca los resultados del emprendimiento asesorado</h3>
          </div>
          Recuerde que el diagnóstico de madurez cuenta con preguntas que son cuantificadas
          automáticamente por el sistema, usted podrá modificar dichos valores y 
          asignar el puntaje a las preguntas que no han sido cuantificadas por AANTIK.
          <br>
          <br>
  
          resultados obtenidos de {{entidad}}
          <br>
          <div>
  
            
           <b-table striped hover :items="resp" :fields="campos">
              <template #cell(Editar)="row">
                <b-button class="mr-2" >Editar
                </b-button>
              </template>
            </b-table>
          </div>

             <br>  
        </b-col>
      </b-row>
    </b-container>   
</template>
  
<script>
import SidebarMenuAkahon from "@/components/SideBarSt.vue"
import AuthService from "@/service/auth.service"
import serviceD from "@/service/diagnosticoService"

  export default {
    components: {
      SidebarMenuAkahon,
    },
    name: "user",
  
    data() {
      return{
        resp:[{
          pregunta:null,
          respuesta:null,
          puntaje:null
        }],
  
        campos: [
          { key: "pregunta" },
          { key: "respuesta" },
          { key: "puntaje"},
          { key: "Editar" }
        ],
        entidad: "yku",
      }
    },
    mounted() {
        this.serviceD = new serviceD();
        this.getAll()
    },
    methods: {
        editarSt(idSt){
          console.log("id---------",idSt);
          //self.$router.push({name:'preEdit' })
        },
        editarPre(idSt){
          console.log("id---------",idSt);
          //self.$router.push({name:'preEdit' })
        },
        getAll() {
            try{
                this.serviceD.getRespDiag(AuthService.getCorreo())
                .then(function(response) {
                    console.log(response.data);
                }).catch(function(error) {
                    console.log(error);
                });   
            } catch (error) {
            console.log(error);
            }
        
        console.log("gj-----");
        console.log(this.resp.pregunta);
      },
    },
}
</script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  h3 {
    margin: 40px 0 0;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
  .w-100 {
      width: 80% !important;
  }
  </style>
  