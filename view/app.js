/* import :: Vue & libs */
import Vue     from 'vue';
import axios   from 'axios';

/* import :: Project apps */
import app        from '~/app';
import components from "~/common/components";
import directives from "~/common/directives";
import filters    from "~/common/filters";
import router     from '@/config/router';
/* import :: for init something */
import menuService from '~/service/common/menuService';


/* Register plugin */
Vue.use(components);
Vue.use(directives);
Vue.use(filters);


/* Modify vue prototype */
Vue.prototype.$http = axios;

// create Vue
(async function() {
    // 1. Init. system
    // 1.1 prepare menu info.
    await menuService.init();

    // x. [FINALLY] Launch vue
    new Vue({
        el: '#app',
        template: '<app/>',
        components: {app},
        router,
    });
})();


