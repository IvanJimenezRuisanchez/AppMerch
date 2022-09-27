import Vuex from 'vuex'

export default new Vuex.Store({
    state:{
      cart: [],
    },
    mutations:{
      addToCart(state, payload){
        if(state.cart.indexOf(payload) == -1){
          state.cart.push(payload)
        }
      },
      delete(state, payload){
        for (var i = 0; i < state.cart.length; i++) {
          if (state.cart[i].id == payload) {
              var spliced = state.cart.splice(i, 1);
          }
      }
    } },
    actions:{
      addToCart(state, payload){
        state.commit('addToCart',payload)
      },
      deleteInCar(state, payload){
        state.commit('delete',payload)
      }
    },
    getters:{
      getCart(state){
        return state.cart
      }
    },
    });