<template>
    <el-form style="width: 50%;" :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="公交路线" prop="id">
        <el-input v-model="ruleForm.id" readonly=""></el-input>
      </el-form-item>
      <el-form-item label="公交路线" prop="busroutes">
        <el-input v-model="ruleForm.busroutes"></el-input>
      </el-form-item>
      <el-form-item label="公交去程" prop="deaprture">
        <el-input v-model="ruleForm.deaprture"></el-input>
      </el-form-item>
      <el-form-item label="公交返程" prop="back">
        <el-input v-model="ruleForm.back"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
</template>


<script src="https://unpkg.com/axios/dist/axios.min.js"></script>  //引入axio依赖
<script>
      export default {
        data() {
          return {
            ruleForm: {
              id:'',
              busroutes: '',
              deaprture: '',
              back: ''      
            },
            rules: {
              id: [
                { required: true, message: '请输入活动名称', trigger: 'blur' },
              ],
              busroutes: [
                { required: true, message: '请输入活动名称', trigger: 'blur' },
              ],
              deaprture: [
                { required: true, message: '请输入活动名称', trigger: 'blur' },
              ],
              back: [
                { required: true, message: '请输入活动名称', trigger: 'blur' },
              ],
            }
          };
        },
        methods: {
          submitForm(formName) {
              const _this=this
            this.$refs[formName].validate((valid) => {
              if (valid) {
               axios.put('http://localhost:8888/bus/update',_this.ruleForm)  //这里的axios请求方法改成post
               .then(function(resp){
                if(resp.data='success'){
                   _this.$alert('路线修改成功', '完成', {
                          confirmButtonText: '确定',
                          callback: action => {
                            _this.$router.push('/bus')
                          }
                        });
                }  
               })
              } else {
                
                return false;
              }
            });
          },
          resetForm(formName){
            this.$refs[formName].resetFields();
          }
        },
        created() {
            const _this=this
            axios.get('http://localhost:8888/bus/findById/'+this.$route.query.id).then(function(resp){
                _this.ruleForm=resp.data
            })
        }
     }
    </script>