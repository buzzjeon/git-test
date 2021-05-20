<template>
    <h-page class="--dev">
        <h-area :top="topHeight">
            <h2>[AREA] Top: {{topHeight}}</h2>
            <article class="code">
                {{text.top}}
            </article>
            <article>상-하로 영역을 구분합니다. 영역의 높이는 top 속성을 통하여 지정합니다.<br>
                지정된 높이는 px과 % 둘 다 가능합니다.(200px => 30%)</article>
        </h-area>
        <h-area :bottom="topHeight">
            <h2>[AREA] Bottom: {{topHeight}}</h2>
            <article class="code">
                {{text.bottom}}
            </article>
            <article>상-하로 구분한 영역중 아래 위치할 부분입니다.<br>
                bottom 속성에 들어갈 값은 위에서 띄울 margin 값 입니다.<br>
                화면 전체를 채우지 않고, content 크기만큼 늘어나게 하려면 별도로 지정하지 않아도 됩니다.<br>
                ※ height = calc(100% - text.bottom);</article>
        </h-area>
    </h-page>
</template>

<script>
    export default {
        name: "fixed-tb-layout",
        data() {return {
            text: {
                top: '<h-area top="200px">',
                bottom: '<h-area bottom="200px">'
            },
            topHeight:'200px'
        }}
    }
</script>

<style scoped>

</style>