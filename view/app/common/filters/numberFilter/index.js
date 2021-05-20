
import {comma, round} from './fDigitFilter'

export default {
    install(Vue) {
        // 1. digit filter
        Vue.filter(comma.name, comma);
        Vue.filter(round.name, round);
    }
}