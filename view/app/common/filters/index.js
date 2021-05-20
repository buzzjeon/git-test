import stringFilter from "./stringFilter"
import numberFilter from "./numberFilter"

export default {
    install(Vue) {
        Vue.use(stringFilter);
        Vue.use(numberFilter);
    }
};