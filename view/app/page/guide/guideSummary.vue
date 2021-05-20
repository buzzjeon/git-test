<template>
    <h-page>
        <h-area>
            <link-box>
                <h1>Layouts</h1>
                <link-item>
                    <link-title>Simple Layout</link-title>
                    <img src="@image/devGuide/SimpleLayout.png"
                        @click="go('/page/layout/simple')"/>
                </link-item>
                <link-item>
                    <link-title>Top/Bottom Layout</link-title>
                    <img src="@image/devGuide/FixedTopBotLayout.png"
                        @click="go('/page/layout/fixedtb')"/>
                </link-item>
                <link-item>
                    <link-title>Vertical Layout</link-title>
                    <img src="@image/devGuide/VerticalLayout.png"
                        @click="go('/page/layout/vertical')"/>
                </link-item>
                <link-item>
                    <link-title>Top-L/R Layout</link-title>
                    <img src="@image/devGuide/TopLRLayout.png"
                        @click="go('/page/layout/toplr')"/>
                </link-item>
            </link-box>
            
            <link-box>
                <h1>Boxes</h1>
                <link-item>
                    <link-title>Search Box</link-title>
                    <img src="@image/devGuide/SearchBox.png"
                        @click="go('/page/boxes/searchbox')"/>
                </link-item>
                <link-item>
                    <link-title>Form Box</link-title>
                    <img src="@image/devGuide/FormBox.png"
                        @click="go('/page/boxes/formbox')"/>
                </link-item>
            </link-box>
        </h-area>
    </h-page>
</template>

<script>
export default {
    name:"guide-summary",
    components: {
        'linkBox' :{template:'<div class="link-box"><slot/></div>'},
        'linkItem':{template:'<div class="link-item"><slot/></div>'},
        'linkTitle':{template:'<div class="link-item__title"><slot/></div>'}
    },
    methods : {
        go(url) {
            console.log("Plaese let me go to '"+url+"'")
            this.$router.push(url);
        }
    }
}
</script>



<style scoped lang="scss">
    .link-box {
        & {font-size:0px;}
        h1 {font-size:24px;font-weight:bold;}
    }
    
    .link-item {
        & {display:inline-block;width:50%;padding:20px;}
        .link-item__title {font-size: 20px;font-weight:bold;margin-bottom:10px;}
        
        >img {max-width:600px;width:100%;border:1px solid #AAA;
            cursor:pointer;box-shadow:2px 2px 4px rgba(0,0,0,0.2);}
        >img:hover {box-shadow:10px 10px 10px rgba(0,0,0,0.2);
            transform:translate(-1px, -1px);}
    }
</style>