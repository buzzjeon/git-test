import vue from 'vue';
import Router from 'vue-router';


/* [SAMPLE] Page sample */
import guideSample        from '~/page/guide';
/* [SAMPLE] Page sample :: Layout */
import simpleLayout       from "~/page/layout/simple";
import verticalLayout     from "~/page/layout/vertical";
import fixedTBLayout      from "~/page/layout/fixedtb";
import topLRLayout        from "~/page/layout/toplr";
/* [SAMPLE] Page sample :: Boxes */
import searchBoxSample    from "~/page/boxes/searchBox";
import formBoxSample      from "~/page/boxes/formBox";

/* [COMP] Component preview */
import componentPage from '~/page/components';

/* [COMP] Page samples */
import samplePage   from '~/page/sample';
import myFirstPage  from '~/page/sample/myFirstPage';
import mySecondPage from '~/page/sample/mySecondPage';
import myThirdPage  from '~/page/sample/myThirdPage';


vue.use(Router);

const router =  new Router({
    routes : [
        { path: '/'                     , redirect:'/page'},
        
        { path: '/page'                 , component: guideSample},
        
        { path: '/page/layout/simple'   , component: simpleLayout},
        { path: '/page/layout/vertical' , component: verticalLayout},
        { path: '/page/layout/fixedtb'  , component: fixedTBLayout},
        { path: '/page/layout/toplr'    , component: topLRLayout},
        
        { path: '/page/boxes/searchbox' , component: searchBoxSample},
        { path: '/page/boxes/formbox'   , component: formBoxSample},
        
        { path: '/comp', component: componentPage},
        
        { path: '/sample'      , component: samplePage},
        { path: '/myfirstpage' , component: myFirstPage},
        { path: '/mysecondpage', component: mySecondPage},
        { path: '/mythirdpage' , component: myThirdPage}
    ]
});


/* [interceptor] */
router.beforeEach(function(to, from, next) {
    next();
})


export default router;