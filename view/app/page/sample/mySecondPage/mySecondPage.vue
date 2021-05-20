<template>
    <div>
        <h1>My second page</h1>
        <div class="area search-area">
            <button class="search-button" @click="searchData">Search</button>
        </div>
        <div class="area data-area">
            <div v-if="!sampleList.length" class="sample-empty">
                No data for display.
            </div>
            <div v-for="(sample, idx) in sampleList" class="sample-item" :style="getAgedBack(sample.age)">
                <label class="sample-item__name">
                    {{idx+1}}
                    <i class="fas" :class="sample.gender==='M'?'fa-male':'fa-female'"></i>
                    <label>{{sample.name}}</label>
                    <small>({{sample.age}}, {{sample.gender==='M'?'male':'female'}})</small>
                </label>
                <label class="sample-item__info">
                    {{sample.phone}}, {{sample.email}}
                </label>
            </div>
        </div>
    </div>
</template>
 
<script>
export default {
    name : 'my-second-page',
    data : function() { return {
        sampleList : []
    }},
    methods : {
        searchData() {
            this.$http.get('/rest/sample')
            .then((res) => {
                this.sampleList = res.data;
            })
        },
        getAgedBack(age) {
            let ratio = age/60*100;
            let valueStr = 'linear-gradient(to right, #ABEBC6 , #ABEBC6 '
                +ratio+'%, #FFF '+ratio+'%, #FFF )';
            return {background : valueStr};
        }
    }
}
</script>

<style scoped lang="scss">
    .area {border:1px solid #CCC;padding:10px;margin-top:10px;}
    .search-area button {font-size:14px;padding:3px 10px;}
    .data-area {min-height:100px;}
    
    /* [ITEM] Sample item */
    .sample-item {border:1px solid #CCC;margin-top:10px;padding:10px;}
    .sample-item:first-child {margin-top:0px;}
     
    /* [ITEM] Sample item :: name section */
    .sample-item__name {font-size:20px;display:inline-block;width:300px;font-weight:bold}
    /* [ITEM] Sample item :: name section :: name */
    .sample-item__name label {display:inline-block;}
    .sample-item__name label::first-letter {font-size:24px;text-transform: uppercase;}
    /* [ITEM] Sample item :: name section :: additional info */
    .sample-item__name small {font-size:14px;font-weight:normal}
    /* [ITEM] Sample item :: name section :: icon */
    .sample-item__name .fas {width:20px;text-align:center;font-size:30px;}
    .sample-item__name .fas.fa-male {color:#2E86C1;}
    .sample-item__name .fas.fa-female {color:#E74C3C;}
     
    /* [ITEM] Sample item :: info section */
    .sample-item__info {font-size:16px;}
    
    /* [ITEM] List box :: emtpy */
    .sample-empty {font-size:24px; color:#AAA;height:100px;line-height:100px;text-align:center;}
</style>