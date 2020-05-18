<template>
<div>
    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        fixed
        prop="id"
        label="id"
        width="150">
      </el-table-column>
      <el-table-column
        prop="busroutes"
        label="busroutes"
        width="200">
      </el-table-column>
      <el-table-column
        prop="deaprture"
        label="deaprture"
        width="250">
      </el-table-column>
      <el-table-column
        prop="back"
        label="return"
        width="250">
      </el-table-column>
      <el-table-column
        fixed="right"
        label="操作"
        width="100">
        <template slot-scope="scope">
          <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
          <el-button @click="deletebus(scope.row)" type="text" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next"
      page-size="2"
      :total="50"
      @current-change="page"
      >
    </el-pagination>
</div>
  
</template>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
  export default {
    methods: {
      deletebus(row){
          const _this=this
            axios.delete('http://localhost:8888/bus/deleteById/'+row.id).then(function(resp){
                _this.$alert('路线删除成功', 'success', {
                       confirmButtonText: '确定',
                       callback: action => {
                         window.location.reload()
                       }
                     })
            })
        },
      edit(row) {
        this.$router.push({
            path:'/update',
            query:{
              id:row.id
            }
        })
      },
      page(currentchange){
          alert(currentchange);
      }
    },
        created() {
            const _this=this
            axios.get('http://localhost:8888/bus/findAll/1/20')
            .then(function(resp){
                _this.tableData=resp.data.content
            })
        },
    data() {
      return {
        
        tableData:null
      }
    }
  }
</script>