import hSearchBox from "./hSearchBox.vue";
import hSearchRow from './hSearchRow';
import hSearchItem from './hSearchItem';

export default {
    install(Vue) {
        Vue.component(hSearchBox.name , hSearchBox);
        Vue.component(hSearchRow.name , hSearchRow);
        Vue.component(hSearchItem.name, hSearchItem);
    }
};