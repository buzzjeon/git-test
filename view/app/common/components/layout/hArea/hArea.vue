<template>
    <div class="h-area" :class="areaClass" :style="areaStyle">
        <slot></slot>
    </div>
</template>

<script>
    export default {
        name: "h-area",
        props:{
            'top'     : [String, Boolean],
            'bottom'  : [String, Boolean],
            'left'    : [String, Boolean],
            'right'   : Boolean,
            'fullPage': Boolean,
            'bordered': Boolean
        },
        computed: {
            areaClass() {
                let clazz = [];

                // 1. Layout setting
                // 1.1 Append vertical flag
                if( this.top )         {clazz.push('h-area--top')}
                else if( this.middle ) {clazz.push('h-area--middle')}
                else if( this.bottom ) {clazz.push('h-area--bottom')}
                // 1.2 Append horizontal flag
                if( this.left )       {clazz.push('h-area--left')}
                else if( this.right ) {clazz.push('h-area--right')}
                // 1.3 has no class
                if( this.fullPage ) {clazz.push('h-area--full-page')}

                // 2. We need border
                if( this.bordered ) {
                    clazz.push('h-area--bordered');
                }

                return clazz.join(' ');
            },
            areaStyle() {
                let style = {};
                // 1. [TOP/BOTTOM] height
                if( this.top && typeof this.top === 'string') {
                    style['height'] = this.top;
                }
                else if (this.bottom && typeof this.bottom === 'string') {
                    style['height'] = 'calc(100% - '+this.bottom+')';
                }

                // 2. [LEFT/RIGHT] width? display?
                if (this.left && typeof this.left === 'string') {
                    style['flex'] = '0 0 '+this.left;
                }
                else if (this.right === true) {
                    style['flex'] = '1 1 0px';
                }
                else {
                    style['flex'] = '1 1 100%';
                }

                return style
            }
        }
    }
</script>
