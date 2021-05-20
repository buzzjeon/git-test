<template>
    <div class="head-frame">
        <div class="head-frame__logo">
            <label>{{title}}</label>
        </div>
        <ul class="head-frame__menus">
            <li v-for="m in topMenus" @click="clickMenu(m)" class="head-frame__menu"
                :class="{'head-frame__menu--selected':chkMenu(m)}">
                {{m.name}}
            </li>
        </ul>
        <div class="head-frame__action">
            Ferdy.Gome
            <!-- <v-icon>home</v-icon>
            <v-icon>info</v-icon> -->
        </div>
    </div>
</template>

<script>
import CONST from '@/util/const.js';
import menuService from '~/service/common/menuService';

const EVENT_MOVE_URL = "move-url";

export default {
    name:'main-head',
    data:function(){return{
        title    : CONST.SYSTEM.TITLE,
        currUrl  : '',
        topMenus : []
    }},
    created() {
        // 1. Top menu - get system 1Lv. menu
        this.topMenus = menuService.getList();
    },
    methods:{
        updateUrl(url) {
            let rootUrl = menuService.getRootMenu(url);
            this.currUrl = rootUrl.url;
        },
        clickMenu:function(m) {
            const url = m.url;
            if(!url) return;
            this.currUrl = url;
            this.$emit(EVENT_MOVE_URL,url);
        },
        chkMenu:function(m) {
            return m.url == this.currUrl;
        }
    }
}
</script>