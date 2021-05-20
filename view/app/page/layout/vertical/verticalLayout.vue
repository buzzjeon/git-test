<template>
    <h-page class="--dev">
        <h-area class="top-area">
            <h2>[AREA] Top(First) area</h2>
            <article class="code">
                .top-area {}
            </article>
            <article>
                세로로(가로 너비 100%) Area 를 배치합니다.<br>
                필요한 경우 위의 Simple layout + 별도의 사용자 정의 Box(component)를 사용하여 비슷한 효과를
                보일 수도 있습니다.
            </article>
        </h-area>
        <h-area class="second-area">
            <h2>[AREA] Second area</h2>
            <article class="code">
                .second-area {height:30%}
            </article>
            <article>
                별도로 높이를 지정하고 싶은 경우, 사용자 정의 Class 나, Inline style 을 활용하여 지정합니다.<br>
            </article>
        </h-area>
        <h-area class="third-area">
            <h2>[AREA] Third area</h2>
            <article class="code">
                .third-area {height:500px;}
            </article>
            <article>
                계속해서 영역을 추가합니다.
            </article>
        </h-area>
    </h-page>
</template>

<script>
    export default {
        name: "vertical-layout",
        data() {return {}}
    }
</script>

<style scoped>
    .top-area {}
    .second-area {height:30%}
    .third-area {height:500px;}
    .code {}
    small {color:#AAA;}
</style>