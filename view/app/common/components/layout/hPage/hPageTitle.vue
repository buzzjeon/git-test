<template>
    <div class="h-title-area">
        <h1>{{title}}</h1>
    </div>
</template>

<script>
import menuService from "~/service/common/menuService"
export default {
    name: "h-page-title",
    data: function() {return {
            title : ''
    }},
    mounted() {
        // 1. Current URL/MENU
        let currUrl  = this.$route.path;
        let currMenu = menuService.getMenu(currUrl);
        this.title = currMenu.name;
        // 2. Menu list => Breadcrumb? // TBD
        //let menuList = menuService.getRootMenu(currUrl,0,true);
        //menuList.forEach(m => {console.log("menu : ",m.name)})
    }
}
</script>