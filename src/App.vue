<template>
  <div id="app">
   <router-view></router-view>
  </div>
</template>

<style>
  .el-header {
    background-color: #FFFFFF;
    color: #FFFFFF;
    line-height: 60px;
  }
  
  .el-aside {
    color: #ffffff;
  }
</style>

<script>
  export default {
    data() {
      const item = {
  
      };
      return {
        tableData: Array(20).fill(item)
      }
    }
  };
</script>