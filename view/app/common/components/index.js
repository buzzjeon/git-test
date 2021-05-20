/* [Layout] */
import hPage from "./layout/hPage"
import hArea from "./layout/hArea"
/* [Boxes] */
import hSearchBox from "./boxes/hSearchBox";
import hFormBox from "./boxes/hFormBox";
/* [Components] */
// EMPTY!! NOT YET¡!!!

export default {
    install(Vue) {
        // 1. import Layout
        Vue.use(hPage);
        Vue.use(hArea);
        // 2. import Layout
        Vue.use(hSearchBox);
        Vue.use(hFormBox);
    }
};