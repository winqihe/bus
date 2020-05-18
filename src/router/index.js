import Vue from 'vue'
import VueRouter from 'vue-router'
import bus from'../views/Bus.vue'
import index from'../views/index.vue'
import add from '../views/Add.vue'
import Update from '../views/Update.vue'
Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'index',
    component: index,
    show:true,
    children:[
        {
            path:'/bus',
            name:'bus',
            component:bus 
        },
        {
            path:'/add',
            name:'add',
            component:add
        }
      
    ]
  },
  {
      path:'/Update',
      component:Update,
      show:false
  }
]

const router = new VueRouter({
  routes
})

export default router
