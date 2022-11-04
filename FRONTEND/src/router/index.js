import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/login2',
    name: 'Login2',
    component: () => import('../views/LoginGab.vue')
  },
  {
    path: '/user/recuperaPswrd',
    name: 'recuperarPassword',
    component: () => import('../views/recuperaPswrd.vue')
  },
  {
    path: '/ayuda',
    name: 'ayuda',
    component: () => import('../views/ayuda.vue')
  },
  {
    path: '/foro',
    name: 'foro',
    component: () => import('../views/foro.vue')
  },
  {
    path: '/noticias',
    name: 'noticias',
    component: () => import('../views/noticias.vue')
  },
  {
    path: '/tejido',
    name: 'tejido',
    component: () => import('../views/tejido.vue')
  },
  {
    path: '/tejido2',
    name: 'tejido2',
    component: () => import('../views/tejido copy.vue')
  },  //ORGANIZACION SOCIAL
  {
    path: '/orgSocHome',
    name: 'orgSocHome',
    component: () => import('../views/orgSocial/HomeOrgSocial.vue')
  },
  //ESTUDIANTE
  {
    path: '/studentHome',
    name: 'studentHome',
    component: () => import('../views/estudiante/HomeEstudiante.vue')
  },
  {
    path: '/preinscHome',
    name: 'preinscHome',
    component: () => import('../views/estudiante/HomePreinscrito.vue')
  },
  {
    path: '/datosPre',
    name: 'datosPre',
    component: () => import('../views/estudiante/ActualizarDatosPre.vue')
  },
  {
    path: '/datosEs',
    name: 'datosEs',
    component: () => import('../views/estudiante/ActualizarDatosEst.vue')
  },
  {
    path: '/reqEs',
    name: 'reqEs',
    component: () => import('../views/estudiante/Requisitos.vue')
  },
  {
    path: '/noticiaEs',
    name: 'noticiaEs',
    component: () => import('../views/estudiante/SubirNoticia.vue')
  },
  {
    path: '/encuesta',
    name: 'encuesta',
    component: () => import('../views/estudiante/Encuesta.vue')
  },

  //COORDINADOR
  {
    path: "/CoordHome",
    name: "CoordHome",
    component: () => import('../views/coordinador/Homecoordinador.vue')
  },
  {
    path: "/agregarStd",
    name: "agregarStd",
    component: () => import('../views/coordinador/addEstudiante.vue')
  },
  {
    path: "/agregarOrgSoc",
    name: "agregarOrgSoc",
    component: () => import('../views/coordinador/addOrgSoc.vue')
  },
  {
    path: "/subirPre",
    name: "subirPre",
    component: () => import('../views/coordinador/UploadFiles.vue')
  },
  {
    path: '/estudiantes',
    name: 'estudiantesCord',
    component: () => import('../views/coordinador/EstudiantesCord.vue')
  },
  {
    path: '/estudiantes2',
    name: 'estudiantesCord2',
    component: () => import('../views/coordinador/getEstudiantes.vue')
  },
  {
    path: '/subirFile',
    name: 'subirFile',
    component: () => import('../views/coordinador/subirCsv.vue')
  },
  {
    path: '/subirFileOrgSoc',
    name: 'subirFileOrgSoc',
    component: () => import('../views/coordinador/subirCsv.vue')
  },
  {
    path: '/orgSociales',
    name: 'orgSociales',
    component: () => import('../views/coordinador/organizaciones.vue')
  },
  {
    path: '/emprendimientos',
    name: 'emprendimientos',
    component: () => import('../views/coordinador/emprendimientos.vue')
  },
  {
    path: '/addemprendimientos',
    name: 'addemprendimientos',
    component: () => import('../views/coordinador/addEmpren.vue')
  },
  {
    path: '/docentes',
    name: 'docentes',
    component: () => import('../views/coordinador/docentes.vue')
  },
  {
    path: '/addDocentes',
    name: 'addDocentes',
    component: () => import('../views/coordinador/addDocente.vue')
  },
  {
    path: '/gruposClase',
    name: 'gruposClase',
    component: () => import('../views/coordinador/gruposClass.vue')
  },
  {
    path: '/addGrupoClass',
    name: 'addGrupoClass',
    component: () => import('../views/coordinador/addGrupoClass.vue')
  },
  {
    path: '/asignacion',
    name: 'asignacion',
    component: () => import('../views/coordinador/asignacionAct.vue')
  },
  {
    path: '/asignacionNueva',
    name: 'asignacionNueva',
    component: () => import('../views/coordinador/asignacionNew.vue')
  },
  //ADMIN
  {
    path: '/adminHome',
    name: 'adminHome',
    component: () => import('../views/admin/HomeAdmin.vue')
  },
  {
    path: '/gesNoticias',
    name: 'gesNoticias',
    component: () => import('../views/admin/GNoticias.vue')
  },
  {
    path: '/gesIndicadores',
    name: 'gesIndicadores',
    component: () => import('../views/admin/GIndicadores.vue')
  },
  {
    path: '/gesCoordinador',
    name: 'gesCoordinador',
    component: () => import('../views/admin/GCoordinador.vue')
  },
  {
    path: '/addCoord',
    name: 'addCoord',
    component: () => import('../views/admin/addCoordinador.vue')
  },
  {
    path: '/gesForo',
    name: 'gesForo',
    component: () => import('../views/admin/GForo.vue')
  },
  {
    path: '/foroEdit',
    name: 'foroEdit',
    component: () => import('../views/admin/foroEdit.vue')
  },
  {
    path: '/notiEdit',
    name: 'notiEdit',
    component: () => import('../views/admin/noticiasEdit.vue')
  },
  {
    path: '/stuEdit',
    name: 'stuEdit',
    component: () => import('../views/admin/estudianteEdit.vue')
  },
  {
    path: '/preEdit',
    name: 'preEdit',
    component: () => import('../views/admin/preEstudianteEdit.vue')
  },
  {
    path: '/gesStu',
    name: 'gesStu',
    component: () => import('../views/admin/estudianteAdmin.vue')
  },
  {
    path: '/orgAdmin',
    name: 'orgAdmin',
    component: () => import('../views/admin/organizacionAdmin.vue')
  },
  {
    path: '/orgEdit',
    name: 'orgEdit',
    component: () => import('../views/admin/organizacionEdit.vue')
  },
  {
    path: '/docEdit',
    name: 'docEdit',
    component: () => import('../views/admin/docenteEdit.vue')
  },
  {
    path: '/docAdmin',
    name: 'docAdmin',
    component: () => import('../views/admin/docenteAdmin.vue')
  },


  //EMPRENDIMIENTO
  {
    path: '/HomeEmp',
    name: 'HomeEmp',
    component: () => import('../views/emprendimiento/HomeEmp.vue')
  },
  {
    path: '/asesoria',
    name: 'asesoria',
    component: () => import('../views/emprendimiento/asesoria.vue')
  },
  {
    path: '/datosEmp',
    name: 'datosEmp',
    component: () => import('../views/emprendimiento/ActualizarDatosEmp.vue')
  },
   //DOCENTE
   {
    path: '/HomeDoc',
    name: 'HomeDoc',
    component: () => import('../views/docente/HomeDoc.vue')
  },




]

const router = new VueRouter({
  routes
})

export default router
