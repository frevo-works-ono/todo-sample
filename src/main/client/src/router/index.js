import Vue from 'vue'
import Router from 'vue-router'
import TodoList from '@/components/TodoList'
import TodoRegist from '@/components/TodoRegist'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'TodoList',
      component: TodoList
    },
    {
      path: '/regist',
      name: 'TodoRegist',
      component: TodoRegist
    }
  ]
})
