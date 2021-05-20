<template>
    <div class="list-box">
        <div v-if="!sampleList.length" class="list-empty">
            No data for display.
        </div>
        <template v-else>
            <sample-item v-for="(sample, idx) in sampleList" :sample="sample" :idx="idx" :key="sample.name"/>
        </template>
    </div>
</template>

<script>
import sampleItem from "./myThirdPage_sampleItem";

export default {
    name : 'my-third-page__list-box',
    components : {sampleItem},
    data : function() { return {
        sampleList : []
    }},
    methods : {
        findSampleList() {
            this.$http.get('/rest/sample')
            .then((res) => {
                this.sampleList = res.data;
            })
        }
    },
}
</script>


<style scoped>
    .list-box {border:1px solid #CCC;padding:10px;margin-top:10px;min-height:100px;}
    .list-empty {font-size:24px; color:#AAA;height:100px;line-height:100px;text-align:center;}
</style>