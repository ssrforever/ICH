<template>
  <div id="app">
    <h1>非遗文化推广平台</h1>
    <p>后端状态：{{ message }}</p>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return { message: '正在连接后端...' }
  },
  mounted() {
    axios.get('http://localhost:8080/api/hello')
      .then(res => { this.message = res.data })
      .catch(err => { this.message = '连接失败：' + err })
  }
}
</script>