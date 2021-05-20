import fCapitalize from "./fCapitalize.js";
import fFormattedDate from "./fFormattedDate";

export default {
    install(Vue) {
        Vue.filter(fCapitalize.name   , fCapitalize);
        Vue.filter(fFormattedDate.name, fFormattedDate);
    }
};