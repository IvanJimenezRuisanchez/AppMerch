<template>
  <Navbar></Navbar>
  <router-view></router-view>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.min.css'
import Navbar from './components/Page/Navbar.vue';
export default {
    name: "App",
    components: { Navbar }
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
