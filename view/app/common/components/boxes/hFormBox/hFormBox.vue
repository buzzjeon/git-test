<template>
    <div class="h-form-box">
        <slot></slot>
    </div>
</template>

<script>
    export default {
        name: "hFormBox",
        data() {return {
            childItems: []
        }},
        props: {
            col : {type:Number, default:1},
            labelSize : String,
            toggle: Boolean
        },
        watch: {
            toggle() {
                this.childItems.forEach(i => {
                    i.toggleMode = this.toggle;
                })
            }
        },
        methods: {
            addToggleWatch(obj){
                this.childItems.push(obj);
            }
        }
    }
</script>
