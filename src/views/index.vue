<template>
    <el-container style="height: 500px; border: 1px solid #FFFFFF">
      <el-aside width="200px" style="background-color:#FFFFFF">
        <el-menu >
          <el-submenu index="1">
            <template slot="title"><i class="el-icon-position"></i>公交路线</template>
              <el-menu-item index="1-1">1路</el-menu-item>
              <el-menu-item index="1-2">2路</el-menu-item>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"><i class="el-icon-discover"></i>公交换乘</template>
              <el-menu-item index="1-1">现在位置</el-menu-item>
              <el-menu-item index="1-2">目的地</el-menu-item>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"><i class="el-icon-location-outline"></i>站点查询</template>
              <el-menu-item index="1-1">查询站点</el-menu-item>
          </el-submenu>
          <el-submenu index="4">
            <template slot="title"><i class="el-icon-message"></i>邮件信息</template>
              <el-menu-item index="1-1">已发送</el-menu-item>
              <el-menu-item index="1-2">草稿箱</el-menu-item>
          </el-submenu>
          <el-submenu index="5">
            <template slot="title"><i class="el-icon-circle-plus-outline"></i>添加站点</template>
              
              
          </el-submenu>
          <el-submenu index="6">
            <template slot="title"><i class="el-icon-setting"></i>个人设置</template>
              <el-menu-item index="1-1">个人信息</el-menu-item>
              <el-menu-item index="1-2">退出登录</el-menu-item>
          </el-submenu>
          <el-submenu index="7">
            <template slot="title"><i class="el-icon-user"></i>联系我们</template>
              <el-menu-item index="1-1">开发者邮箱</el-menu-item>
              
          </el-submenu>
        </el-menu>
        
      </el-aside>
      
      <el-container>
        
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
</template>

<script>
</script>

<style>
</style>
