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
        <b-form-group id="input-group-1" label="Nombres y apellidos:" label-for="input-1">     
          <b-form-input
            id="input-1"
            v-model="form.name"
            placeholder="Nombres y apellidos"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          id="input-group-2"
          label="Correo institucional:"
          label-for="input-2"
        >
          <b-form-input
            id="input-2"
            v-model="form.email"
            type="email"
            placeholder="Correo institucional"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-3" label="ID estudiantil:" label-for="input-3">     
          <b-form-input
            id="input-3"
            v-model="form.idEst"
            placeholder="ID estudiantil"
            required
          ></b-form-input>
        </b-form-group>
        
        <b-form-group id="input-group-4" label="Cédula:" label-for="input-4">     
          <b-form-input
            id="input-4"
            v-model="form.cedula"
            placeholder="Cédula"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-5" label="Asignatura a inscribir:" label-for="input-5">     
          <b-form-select
          id="input-5"
          v-model="form.asignatura"
          :options="asignatura"
          required
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-5" label="Genero:" label-for="input-6">     
          <b-form-select
          id="input-6"
          v-model="form.genero"
          :options="genero"
          required
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-6" label="Fecha en que asistió a charla sentido de mi práctica:" label-for="input-7">     
          <b-form-input
            id="input-7"
            v-model="form.fechaTaller"
            placeholder="dd/mm/aaaa"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-7" label="Teléfono:" label-for="input-8">     
          <b-form-input
            id="input-8"
            v-model="form.telefono"
            placeholder="Teléfono"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-5" label="Municipio:" label-for="input-9">     
          <b-form-select
          id="input-9"
          v-model="form.municipio"
          :options="municipio"
          required
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-5" label="Localidad:" label-for="input-10">     
          <b-form-select
          id="input-10"
          v-model="form.localidad"
          :options="localidad"
          required
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="Barrio:" label-for="input-11">     
          <b-form-input
            id="input-11"
            v-model="form.Barrio"
            placeholder="Barrio"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-4" label="Dirección:" label-for="input-12">     
          <b-form-input
            id="input-12"
            v-model="form.direccion"
            placeholder="Direción"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Realiza actualmente alguna actividad extracurricular? (trabajo, entrenamiento, etc.)
:" label-for="input-13">     
          <b-form-select
            id="input-13"
            v-model="form.actividad"
            :options="actividad"
            required
          ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Cuáles?:" label-for="input-14">     
          <b-form-input
            id="input-14"
            v-model="form.cualesactiv"
            placeholder="¿Cuáles?"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Cuenta con experiencia de más de un año en las siguientes actividades?" label-for="input-15">     
          <b-form-select
            id="input-15"
            v-model="form.experiencia"
            :options="experiencia"
            required
          ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Tiene usted algún tipo de limitaciones a nivel social, psicológico o física?" label-for="input-16">     
          <b-form-select
            id="input-16"
            v-model="form.limitacion"
            :options="limitacion"
            required
          ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-5" label="¿Tiene alguna limitación para realizar su práctica social en alguna localidad de Bogotá?" label-for="input-17">     
          <b-form-select
          id="input-17"
          v-model="form.localidadrest"
          :options="localidad"
          required
        ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="¿Cuenta con algún tipo de transporte?" label-for="input-18">     
          <b-form-select
            id="input-18"
            v-model="form.treansporte"
            :options="transporte"
            required
          ></b-form-select>
        </b-form-group>

        <b-form-group id="input-group-4" label="Ingrese el nombre del docente de su preferencia" label-for="input-19">     
          <b-form-select
            id="input-19"
            v-model="form.profe"
            :options="profe"
            required
          ></b-form-select>
        </b-form-group>
        

        <b-button type="submit" variant="primary">Guardar</b-button>
        <b-button type="reset" variant="danger">Cancelar</b-button>
      </b-form>
      <br>
      <router-link to="/preinscHome">
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
        asignatura: [{ text: 'Selecione una', value: null }, 'PSU', 'CDIO'],
        genero: [{ text: 'Selecione una', value: null }, 'Masculino', 'Femenino', 'Otro'],
        municipio: [{ text: 'Selecione una', value: null }, 'Bogota D.C.', 'Otro'],
        localidad: [{ text: 'Selecione una', value: null }, 'Usaquén', 'Chapinero', 'Santa Fe', 'San Cristóbal', 'Usme', 'Tunjuelito', 'Bosa', 'Kennedy', 'Fontibón', 'Engativá', 'Suba', 'Barrios Unidos', 'Teusaquillo', '	Los Mártires', 'Antonio Nariño', 'Puente Aranda', 'La Candelaria', 'Rafael Uribe Uribe', 'Ciudad Bolívar', 'Sumapaz'],
        actividad: [{ text: 'Selecione una', value: null }, 'Si', 'No'],
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


