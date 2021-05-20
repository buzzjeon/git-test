<template>
    <div class="sample-item" :style="sampleStyle">
        <span class="sample-item__name">
            {{idxLabel}}. <gender-icon :gender="sample.gender"/>
            <label>{{sample.name}}</label>
            <small>({{sample.age}}, {{genderText}})</small>
        </span>
        <span class="sample-item__info">
            {{sample.phone}}, {{sample.email}}
        </span>
    </div>
</template>

<script>
let genderIcon = {
    props : ["gender"],
    computed : {genderClass() {return this.gender==="M"?"fa-male":"fa-female";}},
    template : "<i class='fas' :class='genderClass'/>"
};

export default {
    name : "my-third-page_sample-item",
    props : ["sample","idx"],
    components : {genderIcon},
    computed : {
        sampleStyle() {
            let ratio = this.sample.age / 50 * 100;
            let valueStr = 'linear-gradient(to right, #D5F5E3 , #ABEBC6 '
                +ratio+'%, #FFF '+ratio+'%, #FFF )';
            return {background : valueStr};
        },
        idxLabel () { return this.idx+1; },
        genderText () { return this.sample.gender==='M'?'male':'female'; }
    }
}



</script>

<style scoped lang="scss">
    @import "@style/color.scss";

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
</style>