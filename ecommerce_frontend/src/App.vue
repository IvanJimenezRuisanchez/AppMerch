<template>
  <Sidebar></Sidebar>
  <router-view></router-view>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.min.css'
import Sidebar from './components/Page/Sidebar.vue';
export default {
    name: "App",
    components: { Sidebar}
}

</script>

<style>
  
#app {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: black;
  overflow: hidden;
}
</style>
