<template>

    <div class="h-form-item" :class="itemClass" :style="{flex:itemFlex}">
        <div class="h-form-item__label" :style="labelStyle">
            <slot name="label">{{label}}</slot>
        </div>
        <div class="h-form-item__compo" v-if="!toggleMode" >
            <slot></slot>
        </div>
        <div class="h-form-item__compo" v-else>
            <slot name="toggle">
                <slot></slot>
            </slot>
        </div>
    </div>
</template>

<script>
    export default {
        name: "hFormItem",
        data() {return {
            col       : 1,
            labelSize : null,
            toggleMode: false
        }},
        props: {
            "label"   : String,
            "required": Boolean,
            "noLabel" : Boolean,
            "span"  : {
                type: Number,
                default : 1
            },
        },
        computed:{
            itemFlex() {
                const itemWidth = 100 / this.col * this.span;
                return "0 0 "+itemWidth+"%";
            },
            itemClass() {
                let clazz = [];
                if( this.noLabel  ) clazz.push("h-form-item--no-label")
                if( this.required ) clazz.push("h-form-item--required")
                return clazz.join(' ');
                return
            },
            labelStyle() {
                let style = {};
                if(this.labelSize) { style["flex"] = "0 0 "+this.labelSize;}
                return style;
            }
        },
        beforeMount() {
            this.col = this.$parent.col;
            this.labelSize = this.$parent.labelSize;
            this.$parent.addToggleWatch(this);
        }
    }
</script>
