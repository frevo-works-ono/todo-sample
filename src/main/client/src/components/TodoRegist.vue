<template>
  <div class="hello">
    <form v-on:submit.prevent="onSubmit" class="col s12">
      <div class="row">
        <div class="input-field col s6">
          <input type="text" v-model="todo.content" id="content" class="validate">
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
export default {
  name: 'TodoRegist',
  methods: {
    onSubmit: function () {
      $.ajax({
        url: '/api/todo',
        type: 'POST',
        contentType: 'application/json',
        headers: {
          'X-TOKEN': 'aaaa'
        },
        dataType: 'json',
        data: JSON.stringify(this.todo)
      }).done(function () {
        this.$route.go(-1)
      }).fail(function () {

      })
    }
  },
  data () {
    return {
      todo: {
        content: '',
        status: ''
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
