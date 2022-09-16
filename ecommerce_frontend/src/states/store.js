import Vuex from 'vuex'

export default new Vuex.Store({
    state:{
      cart: []
    },
    mutations:{
      addToCart(state, payload){
        state.cart.push(payload)
      },
      delete(state, payload){
        state.cart.forEach(element => {
           if (payload == element.id){
                state.cart = state.cart.splice(element.id,1)
           }
        });
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