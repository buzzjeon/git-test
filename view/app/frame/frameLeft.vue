<template>
    <div class="left-frame">
        <left-profile/>
        <left-menu-list ref="menuList"/>
        {{menuUrl}}
    </div>
</template>


<script>
import leftProfile from './fLeft/leftProfile';
import leftMenuList from './fLeft/leftMenuList';

export default {
    name:'main-left',
    components:{leftProfile,leftMenuList},
    data(){return{
        menuList:[],
        menuUrl:''
    }},
    methods:{
        updateMenu(url){
            this.$refs.menuList.updateMenu(url);
        },
    }
}
</script>