<template>
  <Authentication></Authentication>
</template>

<script>
import Authentication from './components/Authentication/Authentication.vue';
export default {
    name: "App",
    components: { Authentication }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
