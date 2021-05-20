<template>
    <div>
        <h1>Hello world</h1>
        <info>
            User name : {{userInfo.name}} <br>
            Age : {{userInfo.age}} <br>
        </info>
        
        <info>
            Remain : {{computedRemain}} / {{remainTo20()}}
        </info>
        
        <info>
            <input :value="message"> <br>
            <input v-model="userInfo.name"> <br>
            {{message}}, {{userInfo.name}}!!
        </info>
        
        <info>
            <div>myAge : {{userInfo.age}}</div>
            <button @click="addAge(-5)">-5</button>
            <button @click="addAge(-1)">-1</button>
            <button @click="addAge( 1)">+1</button>
            <button @click="addAge( 5)">+5</button>
        </info>
        
        <info>
            <button @click="eventDirect">See console.log</button>
        </info>
    </div>
</template>



<script>
export default {
    name : 'my-first-page',
    components : {info: {template:"<div class='info-div'><slot/></div>"}},
    data : function() { return {
        message : "hello",
        myNumber : 3,
        userInfo : {
            name : "Ferdy.H",
            age : 13,
            gender : "M"
        }
    }},
    methods : {
        remainTo20() {
            return 20 - this.myNumber;
        },
        addAge(num) {
            this.userInfo.age += num;
        },
        eventDirect(event) {
            console.log("[EVENT] Event bind directly",event);
        }
    },
    created : function() {
        console.log("[CREATED] Component를 만들자 마자 초기화도 하기 전에 호출합니다.");
    },
    mounted : function() {
        console.log("[MOUNTED] Component를 화면에 다 그리고 나서 호출합니다.");
    },
    computed : {
        computedRemain() {
            return 20 - this.myNumber;
        }
    }
}
</script>

<style scoped lang="scss">
    $col : red;
    h1 {color:$col;}
    /* info div */
    .info-div {border:1px solid #AAA;font-size:16px;padding:10px;margin-top:20px;}
    .info-div > div {margin-bottom:10px;}
    .info-div button {padding:3px 10px;font-size:14px;}
    .info-div br + input {margin:5px 0;}
</style>