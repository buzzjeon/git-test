<template>
    <div id="honeybee">
        <frame-head ref="frmHead" @move-url="moveUrl"></frame-head>
        <frame-left ref="frmLeft"></frame-left>
        <router-view class="body-frame"></router-view>
        <frame-foot></frame-foot>
    </div>
</template>

<script>
import '@/style/common.scss';

import frameHead from '~/frame/frameHead'
import frameLeft from '~/frame/frameLeft'
import frameFoot from '~/frame/frameFoot'

export default {
    name:'app',
    components: {frameHead,frameLeft,frameFoot},
    mounted() {
        let currUrl = this.$route.path;
        // 1. update Head
        this.$refs.frmHead.updateUrl(currUrl);
        // 2. update left
        this.$refs.frmLeft.updateMenu(currUrl);
    },
    methods: {
        moveUrl(url) {
            this.$router.push(url);
            this.$refs.frmLeft.updateMenu(url);
        }
    }
};
</script>