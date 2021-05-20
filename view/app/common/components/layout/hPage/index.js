import compo from "./hPage.vue";
export default {
    install(Vue) {
        Vue.component(compo.name, compo);
    }
};