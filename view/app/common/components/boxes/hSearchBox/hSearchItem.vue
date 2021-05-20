<template>
    <div class="h-search-item" :class="itemClass" :style="{flex:itemFlex}">
        <div class="h-search-item__label" :style="labelStyle">
            <slot name="label">{{label}}</slot>
        </div>
        <div class="h-search-item__compo">
            <slot></slot>
        </div>
    </div>
</template>

<script>
    export default {
        name: "hSearchItem",
        data() {return {
            col      : 0,
            labelSize: null
        }},
        props: {
            "label" : String,
            "span"  : {
                type: Number,
                default : 1
            },
            "noLabel": Boolean,
            "alignSupport": Boolean,
        },
        computed:{
            itemFlex() {
                const itemWidth = 100 / this.col * this.span;
                return "0 0 "+itemWidth+"%";
            },
            itemClass() {
                let clazz = [];
                if( this.noLabel ) clazz.push("h-search-item--no-label")
                return clazz.join(' ');
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
        }
    }
</script>
