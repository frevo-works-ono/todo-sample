<template>
  <div class="hello">
    <meta name="_csrf" th:content="${_csrf.token}"/>
    <meta name="_csrf_header" th:content="${_csrf.headerName}"/>
    <form v-on:submit.prevent="onSubmit" class="col s12">
      <div class="row">
        <div class="input-field col s6">
          <input type="text" v-model="content" id="content" class="validate">
          <label for="content">タスク内容</label>
        </div>
        
      </div>
      <button class="btn waves-effect waves-light" type="submit" name="action">登録
        <i class="material-icons right">send</i>
      </button>
    </form>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'TodoRegist',
  created: function () {
    
  },
  methods: {
    onSubmit: function () {
      axios.post('/api/todo', {
        content: this.content
      })
      .then(function (res) {
        console.log('登録完了')
        this.$router.go(-1)
      })
      .catch(function (error) {
        console.log(error)
      })
    }
  },
  data () {
    return {
      content: ''
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
