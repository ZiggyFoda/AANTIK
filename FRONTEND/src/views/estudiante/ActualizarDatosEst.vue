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
    <h3>Diligencie el siguiente formulario con sus datos actualizados</h3>
    <br><br>
    <div>
      <b-form @submit="onSubmit" @reset="onReset" v-if="show">

        <b-form-group id="input-group-1" label="Teléfono:" label-for="input-1">     
          <b-form-input
            id="input-1"
            v-model="form.telefono"
            placeholder="Teléfono"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-1" label="Municipio:" label-for="input-1">     
          <b-form-input
            id="input-1"
            v-model="form.municipio"
            placeholder="Municipio"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-5" label="Localidad si esta en Bogotá D.C.:" label-for="input-3">     
          <b-form-select
          id="input-3"
          v-model="form.localidad"
          :options="localidad"
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="Barrio:" label-for="input-4">     
          <b-form-input
            id="input-4"
            v-model="form.barrio"
            placeholder="Barrio"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-4" label="Dirección:" label-for="input-5">     
          <b-form-input
            id="input-5"
            v-model="form.direccion"
            placeholder="Direción"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Tiene usted algún tipo de limitaciones a nivel social, psicológico o física?" label-for="input-6">     
          <b-form-select
            id="input-6"
            v-model="form.limitacion"
            :options="limitacion"
            required
          ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-5" label="¿Tiene alguna limitación para realizar su práctica social en alguna localidad de Bogotá?" label-for="input-17">     
          <b-form-select
          id="input-7"
          v-model="form.localidadrest"
          :options="localidad"
          required
        ></b-form-select>
        </b-form-group>


        <b-form-group label="Seleccione los días y campo horario en el que desea recibir notificaciones:" v-slot="{ ariaDescribedby }">
      <b-form-checkbox-group
        id="checkbox-group-1"
        v-model="selected"
        :options="options"
        :aria-describedby="ariaDescribedby"
        name="flavour-1"
      ></b-form-checkbox-group>
    </b-form-group>
        

        <b-button type="submit" variant="primary">Guardar</b-button>
        <b-button type="reset" variant="danger">Cancelar</b-button>
      </b-form>
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
import axios from 'axios';
import SidebarMenuAkahon from "@/components/SideBar.vue"

  export default {
    data() {
      return {
        options: [
          { text: 'Lunes', value: 'Lunes' },
          { text: 'Martes', value: 'Martes' },
          { text: 'Miercoles', value: 'Miercoles' },
          { text: 'Jueves', value: 'Jueves' },
          { text: 'Viernes', value: 'Viernes' },
          { text: 'Sabado', value: 'Sabado' },
          { text: 'Domingo', value: 'Domingo' },
          { text: 'AM', value: 'AM' },
          { text: 'PM', value: 'PM' }

        ],
        form: {
          telefono: '',
          municipio: '',
          localidad: null,
          barrio: '',
          direccion: '',
          limitacion: null,
          localidadrest: null,
          notif: [],

        },
        localidad: [{ text: 'Selecione una', value: null }, 'Usaquén', 'Chapinero', 'Santa Fe', 'San Cristóbal', 'Usme', 'Tunjuelito', 'Bosa', 'Kennedy', 'Fontibón', 'Engativá', 'Suba', 'Barrios Unidos', 'Teusaquillo', '	Los Mártires', 'Antonio Nariño', 'Puente Aranda', 'La Candelaria', 'Rafael Uribe Uribe', 'Ciudad Bolívar', 'Sumapaz'],
        experiencia: [{ text: 'Selecione una', value: null }, 'Monitoria en la javeriana', 'Trabajo social o voluntariado', 'No'],
        limitacion: [{ text: 'Selecione una', value: null }, 'Social', 'Psicológica', 'Física', 'No'],
        transporte: [{ text: 'Selecione una', value: null }, 'Carro', 'Moto', 'Otro', 'No'],
        //notif: [{ text: 'Selecione una', value: null }, '1', '2', '3', '4'],
        show: true
        
      }
    },
    components: {
    SidebarMenuAkahon,
    },
    methods: {
      onSubmit() {
        axios.post("http://localhost:8080/datosEs",{
          telefono: this.form.telefono,
          municipio: this.form.municipio,
          localidad: this.form.localidad,
          barrio: this.form.barrio,
          direccion: this.form.direccion,
          limitacion: this.form.limitacion,
          localidadrest: this.form.localidadrest,
          notif: this.form.notif,

        });
        console.log(notif)

      },
      onReset(event) {
        event.preventDefault()
        // Reset our form values
        this.form.telefono = ''
        this.form.municipio = ''
        this.form.localidad = null
        this.form.barrio = ''
        this.form.direccion = ''
        this.form.limitacion = null
        this.form.localidadrest = null
        this.form.notif = null
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


