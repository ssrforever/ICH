<template>
  <div class="container">
    <h1>非遗文化列表</h1>
    <div v-if="loading">加载中...</div>
    <div v-else class="card-grid">
      <div v-for="item in heritages" :key="item.id" class="card">
        <h3>{{ item.name }}</h3>
        <span class="tag">{{ item.category }}</span>
        <p><strong>地区：</strong>{{ item.province }}</p>
        <p>{{ item.description }}</p>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      heritages: [],
      loading: true
    }
  },
  mounted() {
    // 调用后端新接口
    axios.get('http://localhost:8080/api/heritages')
      .then(res => {
        this.heritages = res.data;
        this.loading = false;
      })
      .catch(err => {
        console.error("获取数据失败", err);
      });
  }
}
</script>

<style>
.card-grid { display: grid; grid-template-columns: repeat(3, 1sfr); gap: 20px; }
.card { border: 1px solid #ddd; padding: 15px; border-radius: 8px; box-shadow: 2px 2px 5px #eee; }
.tag { background: #e67e22; color: white; padding: 2px 8px; border-radius: 4px; font-size: 12px; }
</style>