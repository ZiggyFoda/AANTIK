<template>
  <b-container>  
      <div>
        <sidebar-menu-akahon 
          @search-input-emit="search"
        />
      </div> 
  <b-row>
    <b-col>
    <br><br>
    <h3>Diligencie la siguiente información de la noticia</h3>
    <br><br>
    <div>
      <b-form @submit="onSubmit" @reset="onReset" v-if="show">

        <b-form-group id="input-group-1" label="Titulo:" label-for="input-1">     
          <b-form-input
            id="input-1"
            v-model="form.titulo"
            placeholder="Titulo"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-1" label="Noticia:" label-for="input-2">     
          <b-form-input
            id="input-2"
            v-model="form.noticia"
            placeholder="Noticia"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-1" label="Fuente:" label-for="input-3">     
          <b-form-input
            id="input-3"
            v-model="form.Url"
            placeholder="Fuente"
            required
          ></b-form-input>
        </b-form-group>
    
        <b-button type="submit" variant="primary">Guardar</b-button>
        <b-button type="reset" variant="danger">Cancelar</b-button>
      </b-form>
      <br>
      <router-link to="/noticias">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Ver otras noticias</button></router-link>
      <br>
      <router-link to="/studentHome">
        <button type="submit" class="btn btn-dark btn-lg btn-block">
        Volver</button></router-link>
    </div>
  </b-col>
      <b-col>
        
      </b-col>
    </b-row>
  </b-container>  
</template>

<script>
import SidebarMenuAkahon from "@/components/SideBar.vue"

  export default {
    data() {
      return {
        form: {
          email: '',
          name: '',
          food: null,
          checked: []
        },
        localidad: [{ text: 'Selecione una', value: null }, 'Usaquén', 'Chapinero', 'Santa Fe', 'San Cristóbal', 'Usme', 'Tunjuelito', 'Bosa', 'Kennedy', 'Fontibón', 'Engativá', 'Suba', 'Barrios Unidos', 'Teusaquillo', '	Los Mártires', 'Antonio Nariño', 'Puente Aranda', 'La Candelaria', 'Rafael Uribe Uribe', 'Ciudad Bolívar', 'Sumapaz'],
        experiencia: [{ text: 'Selecione una', value: null }, 'Monitoria en la javeriana', 'Trabajo social o voluntariado', 'No'],
        limitacion: [{ text: 'Selecione una', value: null }, 'Social', 'Psicológica', 'Física', 'No'],
        transporte: [{ text: 'Selecione una', value: null }, 'Carro', 'Moto', 'Otro', 'No'],
        profe: [{ text: 'Selecione una', value: null }, '', '', '', ''],
        show: true
      }
    },
    components: {
    SidebarMenuAkahon,
    },
    methods: {
      onSubmit(event) {
        event.preventDefault()
        alert(JSON.stringify(this.form))
      },
      onReset(event) {
        event.preventDefault()
        // Reset our form values
        this.form.email = ''
        this.form.name = ''
        this.form.food = null
        this.form.checked = []
        // Trick to reset/clear native browser form validation state
        this.show = false
        this.$nextTick(() => {
          this.show = true
        })
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
</style>


