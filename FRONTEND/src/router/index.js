import store from '@/store'
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
    component: () => import('../views/ayuda.vue'),
    meta: {requiresAuth: true}
  },
  {
    path: '/foro',
    name: 'foro',
    component: () => import('../views/foro.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/noticias',
    name: 'noticias',
    component: () => import('../views/noticias.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/tejido',
    name: 'tejido',
    component: () => import('../views/tejido.vue')
    ,meta: {requiresAuth: true}
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
    ,meta: {requiresAuth: true}
  },
  //ESTUDIANTE
  {
    path: '/studentHome',
    name: 'studentHome',
    component: () => import('../views/estudiante/HomeEstudiante.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/preinscHome',
    name: 'preinscHome',
    component: () => import('../views/estudiante/HomePreinscrito.vue')
    ,meta: {requiresAuth: true}
  },
  //COORDINADOR
  {
    path: "/CoordHome",
    name: "CoordHome",
    component: () => import('../views/coordinador/Homecoordinador.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: "/agregarStd",
    name: "agregarStd",
    component: () => import('../views/coordinador/addEstudiante.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: "/agregarOrgSoc",
    name: "agregarOrgSoc",
    component: () => import('../views/coordinador/addOrgSoc.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: "/subirPre",
    name: "subirPre",
    component: () => import('../views/coordinador/UploadFiles.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/estudiantes',
    name: 'estudiantesCord',
    component: () => import('../views/coordinador/EstudiantesCord.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/estudiantes2',
    name: 'estudiantesCord2',
    component: () => import('../views/coordinador/getEstudiantes.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/subirFile',
    name: 'subirFile',
    component: () => import('../views/coordinador/subirCsv.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/subirFileOrgSoc',
    name: 'subirFileOrgSoc',
    component: () => import('../views/coordinador/subirCsv.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/orgSociales',
    name: 'orgSociales',
    component: () => import('../views/coordinador/organizaciones.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/emprendimientos',
    name: 'emprendimientos',
    component: () => import('../views/coordinador/emprendimientos.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/addemprendimientos',
    name: 'addemprendimientos',
    component: () => import('../views/coordinador/addEmpren.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/docentes',
    name: 'docentes',
    component: () => import('../views/coordinador/docentes.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/addDocentes',
    name: 'addDocentes',
    component: () => import('../views/coordinador/addDocente.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/gruposClase',
    name: 'gruposClase',
    component: () => import('../views/coordinador/gruposClass.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/addGrupoClass',
    name: 'addGrupoClass',
    component: () => import('../views/coordinador/addGrupoClass.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/asignacion',
    name: 'asignacion',
    component: () => import('../views/coordinador/asignacionAct.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/asignacionNueva',
    name: 'asignacionNueva',
    component: () => import('../views/coordinador/asignacionNew.vue')
    ,meta: {requiresAuth: true}
  },
  //ADMIN
  {
    path: '/adminHome',
    name: 'adminHome',
    component: () => import('../views/admin/HomeAdmin.vue')
    //,meta: {requiresAuth: true}
    ,meta:{requiresRoleAdm: true}
  },
  {
    path: '/gesNoticias',
    name: 'gesNoticias',
    component: () => import('../views/admin/GNoticias.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/gesIndicadores',
    name: 'gesIndicadores',
    component: () => import('../views/admin/GIndicadores.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/gesCoordinador',
    name: 'gesCoordinador',
    component: () => import('../views/admin/GCoordinador.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/addCoord',
    name: 'addCoord',
    component: () => import('../views/admin/addCoordinador.vue')
    ,meta: {requiresAuth: true}
  },
  {
    path: '/gesForo',
    name: 'gesForo',
    component: () => import('../views/admin/GForo.vue')
    ,meta: {requiresAuth: true}
  },
  //EMPRENDIMIENTO
  {
    path: '/HomeEmp',
    name: 'HomeEmp',
    component: () => import('../views/emprendimiento/HomeEmp.vue')
    ,meta: {requiresAuth: true}
  },
   //DOCENTE
   {
    path: '/HomeDoc',
    name: 'HomeDoc',
    component: () => import('../views/docente/HomeDoc.vue')
    ,meta: {requiresAuth: true}
  },
    //EMPRENDIMIENTO
    {
      path: '/asesoria',
      name: 'asesoria',
      component: () => import('../views/emprendimiento/asesoria.vue')
      ,meta: {requiresAuth: true}
    },
    //ACTDATOSPre
    {
      path: '/datosPre',
      name: 'datosPre',
      component: () => import('../views/estudiante/ActualizarDatosPre.vue')
      ,meta: {requiresAuth: true}
    },
    //ACTDATOSEst
    {
      path: '/datosEs',
      name: 'datosEs',
      component: () => import('../views/estudiante/ActualizarDatosEst.vue')
      ,meta: {requiresAuth: true}
    },
    //requistosEst
    {
      path: '/reqEs',
      name: 'reqEs',
      component: () => import('../views/estudiante/Requisitos.vue')
      ,meta: {requiresAuth: true}
    },
    //SubirNoticia
    {
      path: '/noticiaEs',
      name: 'noticiaEs',
      component: () => import('../views/estudiante/SubirNoticia.vue')
      ,meta: {requiresAuth: true}
    },
    {
      path: '/benchmarking',
      name: 'Benchmarking',
      component: () => import("@/views/PreguntaBenchmarking.vue")
    }
]

const router = new VueRouter({
  routes
})

router.beforeEach((to,from,next) => {

if(to.meta.requiresAuth){
  if(!store.state.auth.user){
    next({
      path:"/login2"
    })
  }else{
    next();
  }
}else{
  next();
}
})
//////////////////////////////////////////ROle based///////////////////////////////////
router.beforeEach((to,from,next) => {

  if(to.meta.requiresRoleAdm){
    if(store.state.auth.user.role != "ROLE_ADMIN"){
      next({
        path:"/login2"
      })
    }else{
      next();
    }
  }else{
    next();
  }
  })
  router.beforeEach((to,from,next) => {

    if(to.meta.requiresRoleAdm){
      if(store.state.auth.user.role != "ROLE_STUDIANTE"){
        next({
          path:"/login2"
        })
      }else{
        next();
      }
    }else{
      next();
    }
    })
    router.beforeEach((to,from,next) => {

      if(to.meta.requiresRoleAdm){
        if(store.state.auth.user.role != "ROLE_ORGANIZACION"){
          next({
            path:"/login2"
          })
        }else{
          next();
        }
      }else{
        next();
      }
      })
      router.beforeEach((to,from,next) => {

        if(to.meta.requiresRoleAdm){
          if(store.state.auth.user.role != "ROLE_EMP"){
            next({
              path:"/login2"
            })
          }else{
            next();
          }
        }else{
          next();
        }
        })
        router.beforeEach((to,from,next) => {

          if(to.meta.requiresRoleAdm){
            if(store.state.auth.user.role != "ROLE_COORDINADOR"){
              next({
                path:"/login2"
              })
            }else{
              next();
            }
          }else{
            next();
          }
          })
          router.beforeEach((to,from,next) => {

            if(to.meta.requiresRoleAdm){
              if(store.state.auth.user.role != "ROLE_DOCENTE"){
                next({
                  path:"/login2"
                })
              }else{
                next();
              }
            }else{
              next();
            }
            })
            router.beforeEach((to,from,next) => {

              if(to.meta.requiresRoleAdm){
                if(store.state.auth.user.role != "ROLE_PREINSCRITO"){
                  next({
                    path:"/login2"
                  })
                }else{
                  next();
                }
              }else{
                next();
              }
              })


////////////////////////////////////////////////////////////////////////////////////////
export default router
