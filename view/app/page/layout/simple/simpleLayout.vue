<template>
    <h-page class="--dev">
        <h-area full-page>
            <h2>[AREA] Full-page</h2>
            <article class="code">{{text.t1}}</article>
            <article>화면 전체를 Area 로 지정합니다.</article>
        </h-area>
    </h-page>
</template>

<script>
    export default {
        name: "simple-layout",
        data() { return {
            text : {t1 : '<h-area full-page> ... </h-area>'}
        }},
    }
</script>
