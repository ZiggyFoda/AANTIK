<template>
  <b-container padding-right= 0px padding-left="0px">   
    <b-row>
    <b-col>    
    </b-col>
    <b-col>
     <div class="vue-tempalte">
        <img alt="Vue logo" src="../assets/escudoPUJ.png" width="100%" height="25%"/>
        <form @submit.prevent="handleSubmit">
            <h3 class="titulo">AANTIK</h3>
            <h3>Recuperación de password</h3>
            <div class="form-group">
                <label>Correo</label>
                <input type="email" class="form-control" v-model="emailee" placeholder="ejemplo@javeriana.edu.co"/>
            </div>
            <button type="submit" class="btn btn-dark btn-lg btn-block" >
            Enviar</button>
        </form>
    </div>
    <div class="form-group" >
          <div v-if="message" class="alert alert-secondary" role="alert">
            {{ message }}
          </div>
        </div>
    </b-col>
    
    <b-col>
    </b-col>
  </b-row>
  <footer>
  <hr width=100%  color=#e3b82a  size=50   noshade="noshade">
  <hr width=100%  color=#fff size=50   noshade="noshade">
  <hr width=100%  color=#2C5698  size=50   noshade="noshade">

  </footer>
  </b-container>
</template>

<script>
import axios from 'axios';
import LoginService from "../service/LoginService";
export default {
  name: "recuperaPswrd",
  data(){
    return{
      user:{
        email: ""
     },
     message: ""
    }
  },
  methods:{
     handleSubmit() {
         axios.post("http://localhost:8080/user/recuperaPswrd",{
          email: this.emailee
         }).then((data) =>{
          this.message = data.data.message;
         })
      }
    }
  }


//////////////////////////////
/*import LoginService from "../service/LoginService";
export default {
  name: "CrudApp",
  data() {
    return{
      persona: {
        username: null,
        password: null
      }
    };
  },
  loginService: null,
  created() {
    this.loginService = new LoginService();
  },
  methods: {
    async save() {
      var data = {
        username: this.persona.username,
        password: this.persona.password,

      };
      try {

        let self = this;
        await this.loginService.save(this.persona)
        .then(function(response) {
          console.log(response.data);
          if (response.data==1)
          self.$router.push({name:'about' })
        }).catch(function(error) {
          console.log(error);
        });

        //.then(response => this.$router.push("/about"))
        //.catch(error => this.$router.push("/login"));
      } catch (error) {
        console.log(error);
      }
    },
      print() {
        console.log("Esto es un método"+this.persona.email);
      }
  }  
}*/
////////////////////

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
hr {
  height: 25px;
  margin-top: 0px;
  margin-bottom: 0px;
}
.container, .container-sm {
  max-width: 100%;
}
.row {
    display: flex;
    flex-wrap: wrap;
    margin-right: 15%;
    margin-left: 15%;
}
.container, .container-fluid, .container-sm, .container-md, .container-lg, .container-xl {
    padding-top: 35px;
}
footer {
      position: absolute;
      bottom: 0;
      width: 98%;
      height: 80px;
      color: white;
  }
.titulo{
  font-family: times;
  color: #2C5698 ;
  font-style: bold;
  font-size: 30pt;
}
.form-group{
  margin-top: 5px;
}
.btn{
  margin-top: 5px;
}
</style>
