<template>
  <div class="hello">
    <router-link tag="span" to="/regist"><a>新規登録</a></router-link>
    <table>
      <thead>
        <tr>
          <th>タスク</th>
          <th>ステータス</th>
          <th>期限</th>
          <th>優先度</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="todo in todoList">
          <td>{{ todo.content }}</td>
          <td>{{ todo.status }}</td>
          <td>{{ todo.limitDate }}</td>
          <td>{{ todo.priority }}</td>
          <td></td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'TodoList',
  created: function () {
    // var that = this;
    axios.get('/api/todo')
      .then(res => {
        console.log(res.status, res.statusText, res.data)
        // that.todoList.push({
        //   content: res.data.
        // });
        // => 200, "OK", { message: "You just sent the data!" }
      })
      .catch(error => {
        throw error
      })
  },
  methods: {
  },
  data () {
    return {
      todoList: []
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
