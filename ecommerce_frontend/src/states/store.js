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
        console.log(state.cart)
        state.cart.forEach(element => {
           if (payload == element.id){
                state.cart = state.cart.splice(state.cart.indexOf(element),1)
                console.log(state.cart)
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