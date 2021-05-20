<template>
    <h-page id="my-third-page">
        <h-area top="50px" class="search-area">
            <button class="search-button" @click="searchData">Search</button>
        </h-area>
        <h-area bottom="50px">
            <list-box ref="list-box-component"/>
        </h-area>
    </h-page>
</template>

<script>
import listBox from "./myThirdPage_listBox";

export default {
    name : 'my-thrid-page',
    components : {listBox},
    methods : {
        searchData() {
            // list-box의 findSampleList 함수를 호출
            this.$refs["list-box-component"].findSampleList();
        }
    }
}
</script>

<style scoped>
    .search-area {border:1px solid #CCC;height:50px;line-height:48px;padding-left:10px;}
    .search-button {padding:0px 16px;height:30px;line-height:30px;}
    input {height:30px;padding:0px 5px;}
</style>
