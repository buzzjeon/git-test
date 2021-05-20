<template>
    <h-page>
        <h-area left="30%" bordered class="info-area">
            <div>
                <label>다음 중 하나를 선택해주세요.(Toggle form)</label>
                <div class="clickable-item" v-for="i in sampleData" @click="selectData = i"
                     :class="{selected:i.hello===selectData.hello}">
                    {{i.hello}}, {{i.world}}
                </div>
            </div>
            <article>

            </article>
        </h-area>
        <h-area right class="detail-area">
            <h3>Normal form</h3>
            <h-form-box>
                <h-form-item label="Hello">안녕하세요.</h-form-item>
                <h-form-item label="World" required>세상</h-form-item>
                <h-form-item>
                    <label slot="label" style="display:flex;align-items: center">
                        <input type="checkbox">사용자 정의 라벨
                    </label>

                    <input value="slot='lable' 하고 써주면 됩니다." style="width:100%;">
                </h-form-item>
            </h-form-box>

            <hr>
            <h3>Toggle form</h3>
            <h-form-box :toggle="formToggleFlag" label-size="200px">
                <h-form-item label="Hello">
                    {{selectData.hello}}
                    <label v-if="!selectData.hello" class="disabled">No-data</label>

                    <input slot="toggle" v-model="selectData.hello"/>
                </h-form-item>
                <h-form-item label="World" required>
                    {{selectData.world}}
                    <label v-if="!selectData.hello" class="disabled">No-data</label>

                    <input slot="toggle" v-model="selectData.world"/>
                </h-form-item>
                <h-form-item label="My name">
                    {{selectData.myName}}
                    <label v-if="!selectData.hello" class="disabled">No-data</label>

                    <input slot="toggle" v-model="selectData.myName"/>
                </h-form-item>
                <h-form-item no-label >
                    <label v-if="selectData.hello">{{selectData}}</label>
                    <label v-else>선택된 항목이 없네요. 왼쪽에서 하나 찍어보아요.</label>
                </h-form-item>
            </h-form-box>
            <div class="action-box">
                <button @click="formToggleFlag=!formToggleFlag">Toggle form</button>
            </div>

            <hr>
            <h3>Multi column form</h3>
            <h-form-box :col="2" label-width="120px">
                <h-form-item label="Hello">안녕하세요?</h-form-item>
                <h-form-item label="World" required>세상</h-form-item>
                <h-form-item no-label :span="2">안녕합니다.</h-form-item>
                <h-form-item label="Real Hello">진짜 안녕하세요?</h-form-item>
                <h-form-item label="Real World" required>진짜 세상</h-form-item>
                <h-form-item label="진짜?" :span="2">
                    <input style="width:100%;">
                </h-form-item>
            </h-form-box>

            <hr>
            <h3>Colored form</h3>
            <h-form-box class="colored-form">
                <h-form-item label="Hello" required>안녕하세요.</h-form-item>
                <h-form-item label="World"><input value="세상"/></h-form-item>
            </h-form-box>
            <div>※ h-form-item__label 클래스를 사용해서 배경색이나 font를 사용할 수 있습니다.</div>

        </h-area>


    </h-page>
</template>

<script>
    export default {
        name: "search-box-sample",
        data() {return {
            formToggleFlag: false,
            sampleData : [
                {hello:'안녕하세요', world:'세상', myName : '내 이름'},
                {hello:'こんにちは', world:'世界', myName : '私の名前'},
                {hello:'salve'     , world:'orbis terrarum', myName : 'nomen meum'},
            ],
            selectData : {}
        }},
        methods: {

        }
    }
</script>

<style scoped lang="scss">
    @import '@style/color.scss';

    /* Information.box*/
    .info-area {padding:10px;}
    .detail-area {padding-left:10px;}

    .detail-area h3 {margin-bottom:10px;}
    .detail-area hr {margin: 10px 0;}

    .action-box {margin-top:10px;text-align:right;}
    .action-box button {padding:6px 0px;width:120px;}

    .clickable-item {border:1px solid #aaa;box-shadow:2px 2px 4px rgba(0,0,0,0.2);padding:10px 5px;cursor:pointer;margin:10px 0;}
    .clickable-item.selected {background:$col-prim-l4;font-weight:bold;}

    .disabled {color:$col-gray;}
</style>


<style>
    .colored-form .h-form-item__label{background:#82E0AA;}
</style>

