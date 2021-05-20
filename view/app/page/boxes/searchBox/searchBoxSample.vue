<template>
    <h-page>
        <h-area top="170px">
            <h-search-box :col=3 @search="searchPage" label-size="140px">
                <h-search-row>
                    <h-search-item label="Field 1">
                        <input v-model="searchParam.field1">
                    </h-search-item>
                    <h-search-item label="Field 2" align-support :span="2">
                        <input type="checkbox" v-model="searchParam.field2" value="apple">사과
                        <input type="checkbox" v-model="searchParam.field2" value="banana">바나나
                        <input type="checkbox" v-model="searchParam.field2" value="rabbit">토끼
                    </h-search-item>
                </h-search-row>
                <h-search-row>
                    <h-search-item :span=2>
                        <label slot="label">I have a label slot</label>
                        <input v-model="searchParam.labeled" class="labeled-input">
                    </h-search-item>
                    <h-search-item no-label>
                        Hello? I don't have any label.
                    </h-search-item>
                </h-search-row>
                <h-search-row>
                    <h-search-item label="Normal text" :span="3">
                        The Quick brown fox jumps over...
                    </h-search-item>
                </h-search-row>
            </h-search-box>
        </h-area>
        <h-area bottom="170px" bordered style="padding:10px;">
            <h3>설명</h3>
            <article>
                <ul class="info">
                    <li>"search-box"를 위해서는 tag 의 계층 구조가 필요합니다. 반드시 다음의 순서로 사용해주세요.<br>
                        <b>"BOX" > "ROW" > "ITEM"</b>, 자세한 사항은 이 페이지 소스를 참고하시기 바랍니다.</li>
                    <li>"search-box"는 <b>col</b> 옵션을 통해 세로로 분할됩니다. "Item 의 넓이는" col 옵션을 통해 결정됩니다. (100% / col)<br>
                        기본 값은 3 입니다.</li>
                    <li>우린 대게 "Search" 버튼을 제공합니다. "@search" 속성을 통해 이벤트를 캐치하십시오.<br>
                        매개변수는 없습니다. 값과의 바인딩은 페이지 개발시 직접 수행하세요.</li>
                </ul>
            </article>

            <h3>검색 이벤트</h3>
            <div class="action-feedback" :class="{'empty-feedback':!someText}">
                {{someText || 'Plz click "Search" button above.'}}<br>
            </div>
            <hr>
            <div class="action-feedback">
                {{searchParam}}
            </div>
        </h-area>


    </h-page>
</template>

<script>
    export default {
        name: "search-box-sample",
        data() {return {
            someText: '',
            searchCnt: 0,
            searchParam: {
                field1: "",
                field2: [],
                labeled: "The Quick brown fox..."
            }
        }},
        methods: {
            searchPage() {
                this.searchCnt++;
                this.someText = "SEARCH ("+this.searchCnt+" times) :: last click - " + new Date();
            }
        }
    }
</script>

<style>
    /* Article.Information */
    .info {padding-left:20px;}
    .info li {list-style: circle;}


    /* Action.Feedback */
    .action-feedback {border:1px solid #aaa;min-height:30px;font-size:20px;padding:10px;}
    .action-feedback.empty-feedback {color:#aaa;}

    /* Input box */
    .labeled-input {width:100%;}
</style>