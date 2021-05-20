import dirct from "./vFocus.js";
export default {
    install(Vue) {
        Vue.directive(dirct.name, dirct);
    }
};