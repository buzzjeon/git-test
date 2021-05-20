import box from "./hFormBox.vue";
import item from "./hFormItem.vue"

export default {
    install(Vue) {
        Vue.component(box.name , box);
        Vue.component(item.name, item);
    }
};