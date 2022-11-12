<template>
    <b-container>  
         <div>
            <sidebar-menu-akahon 
              @search-input-emit="search"
            />
          </div> 
      <b-row>
        <b-col>
          <p>
          <br>
          <br>
            <h3>Diagnóstico de madurez</h3>
          </p>
          <br>
          Favor responder
          <br>
          <br>
          <br>
          <br>

          <div>
            <li v-for='item in dg'>
             {{ item.pregunta }}

                <div v-for="item2 of item.rub" :key="item2.rubrica " class="container">
                    <label
                        :class="{ 'label--selected': activeOption === item2 }"
                        class="label"
                    >
                        <input
                        type="radio"
                        :name="item.codigo"
                        :value="item2"
                        />
                    </label>
                    {{ item2.rubrica  }}
                </div>


                <div>
                    <b-form inline>
                        <label class="sr-only" for="inline-form-input-name">{{item.id}}</label>
                        <b-form-input
                        id="inline-form-input-name"
                        class="mb-2 mr-sm-2 mb-sm-0"
                        :placeholder= item.codigo
                        ></b-form-input>

                        <b-form-select
                        id="input-3"
                        :options=item.rub.rubrica
                        ></b-form-select>

                        <b-form-select
                        id="inline-form-custom-select-pref"
                        class="mb-2 mr-sm-2 mb-sm-0"
                        :options=rb
                        :value="null"
                        ></b-form-select>

                    </b-form>
                </div>
            </li>
           
            </div>
        </b-col>
      </b-row>
    </b-container>   
</template>
  
<script>
import SidebarMenuAkahon from "@/components/SideBarCoord.vue"
import LoginService from "@/service/LoginService";

export default {
//name: 'estudiantesCord2',
    props: {
        msg: String
    },
        components: {
        SidebarMenuAkahon,
    },
    data() {
        return{
            dg:[ {
                id: null,
                codigo: null,
                pregunta: null,
                insump: null,
                automatica: null,
                rub: []
            } ],
            rb: [{ text: 'Choose...', value: null }, 'One', 'Two', 'Three']
        };
    },
    loginService: null,
    created() {
        this.loginService = new LoginService();
        this.getAll();
        this.print();
    },
    methods: {
        getAll() {
        this.loginService.getAllDgv().then(data => {
            this.dg = data.data;
            console.log("gj-----");
            console.log("key-----",typeof data.headers);
        });
        console.log("gj-----");
        },
        print() {
            console.log("DATOS-----",this.dg.codigo);
            console.log("DATOS-----",this.dg.rub);
        }
    }
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
li{
display: block;
margin: 25px 10px;
text-align: left;
}
text{
color:red;
}
</style>
