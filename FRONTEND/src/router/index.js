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
    path: '/recuperarPassword',
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
    path: '/docentes',
    name: 'docentes',
    component: () => import('../views/coordinador/docentes.vue')
  },
  {
    path: '/gruposClase',
    name: 'gruposClase',
    component: () => import('../views/coordinador/gruposClass.vue')
  },
  {
    path: '/asignacion',
    name: 'asignacion',
    component: () => import('../views/coordinador/asignacion.vue')
  },
  //ADMIN
  {
    path: '/adminHome',
    name: 'adminHome',
    component: () => import('../views/admin/HomeAdmin.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
