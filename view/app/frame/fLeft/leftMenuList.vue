<template>
    <div id="left-menu-list">
        <template v-for="m in menuList">
            <div v-if="m.subTitle" class="left-menu-sub-title">
                <span>{{m.subTitle}}</span>
            </div>
            <hr v-else-if="m.divider" class="left-menu-divider"/>
            <div :class="menuClass(m)" @click="clickMenu(m)" v-else>
                <i class="fas fa-angle-right"></i>
                <span>{{m.name}}</span>
            </div>
        </template>
    </div>
</template>


<script>
import menuService from '~/service/common/menuService';

export default {
    data() {return{
        currUrl: "",
        menuList: []
    }},
    methods:{
        menuClass(m) {
            let rtn = [];
            rtn.push('left-menu');
            if( m.url === this.currUrl) {rtn.push('left-menu--active')} ;
            return rtn.join(' ');
        },
        updateMenu(url) {
            // 1. set current URL
            this.currUrl = url;
            // 2. update Left menu
            let rootUrl = menuService.getRootMenu(url);
            this.menuList = menuService.getList(rootUrl.url);
        },
        clickMenu(m) {
            this.currUrl = m.url;
            this.$router.push(m.url);
        }
    }
}
</script>
