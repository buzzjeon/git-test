<template>
    <h-page class="--dev">
        <!-- [AREA] Top area -->
        <h-area top="200px">
            <h2>[AREA] Top : 200px</h2>
            <article class="code">{{text.t1}}</article>
        </h-area>
        <!-- [AREA] Top area -->
        <h-area bottom="200px" left="300px">
            <h2>[AREA] Bottom-left</h2>
            <article class="code">{{text.t2}}</article>
        </h-area>
        <!-- [AREA] Right area -->
        <h-area bottom="200px" right>
            <h2>[AREA] Bottom-right</h2>
            <article class="code">{{text.t3}}</article>
            <article>right 옵션은 별도의 값을 가지지 않습니다.<br>
                왼쪽에 그려진 영역에 대해서 남은 부분 만큼 자동으로 채우게 됩니다.<br>
                (만약 남은 부분이 부족하다면 표시되지 않을 수도 있습니다.)</article>
        </h-area>
    </h-page>
</template>

<script>
    export default {
        name: "top-lr-layout",
        data() {return{
            text:{
                t1 : '<h-area top="200px">',
                t2 : '<h-area bottom="200px" left="300px">',
                t3 : '<h-area bottom="200px" right>'
            }
        }}
    }
</script>
