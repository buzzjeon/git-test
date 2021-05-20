import compo from "./hArea.vue";
export default {
    install(Vue) {
        Vue.component(compo.name, compo);
    }
};