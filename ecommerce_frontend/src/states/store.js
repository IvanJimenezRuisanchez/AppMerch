import ClientService from '@/service/ClientService'
import Vuex from 'vuex'
import createPersistedState from 'vuex-persistedstate'

export default new Vuex.Store({
    plugins: [createPersistedState({
      storage: window.sessionStorage,
    })],
    state:{
      cart: [],
      panierItems : 0,
      products: '',
      productId: 0
    },
    mutations:{
      addToCart(state, payload){
        if(state.cart.indexOf(payload) == -1){
          state.cart.push(payload)
        }
        state.panierItems+=1
      },
      delete(state, payload){
        for (var i = 0; i < state.cart.length; i++) {
          if (state.cart[i].id == payload) {
              var spliced = state.cart.splice(i, 1);
          }
          if(state.panierItems != 0)
            state.panierItems-=1
          else
            state.panierItems=0
      }
      },
      addProducts(state, payload){
          state.products.push(payload)
      },
      addProductId(state, payload){
        state.productId = payload
    },
    loadProducts(state){
      state.products = ''
      ClientService.getProducts().then(response => (state.products = (response.data)));
    }

  },
    actions:{
      addToCart(state, payload){
        state.commit('addToCart',payload)
      },
      deleteInCar(state, payload){
        state.commit('delete',payload)
      },
      addProducts(state, payload){
        state.commit('addProducts',payload)
      },
      addProductId(state, payload){
        state.commit('addProductId',payload)
      },
      loadProducts(state){
        state.commit('loadProducts')
      }
    },
    getters:{
      getCart(state){
        return state.cart
      },
      getPanierItems(state){
        return state.panierItems
      },
      getProductById(state){
        for (var i = 0; i < state.products.length; i++) {
          if (state.products[i].id == state.productId) {
              return state.products[i]
          }
        }
      },
    }
  })