<template>
    <div class="h-search-box">
        <slot></slot>
        <slot name="button">
            <div class="h-search-box__button">
                <button @click="searchAction">Search</button>
            </div>
        </slot>
    </div>
</template>

<script>
    const DEFAULT_COL_VALUE = 4;

    export default {
        name: "hSearchBox",
        props: {
            "col": {
                type: Number,
                default : DEFAULT_COL_VALUE
            },
            "labelSize" : String
        },
        methods:{
            searchAction() {
                this.$emit('search');
            }
        }
    }
</script>
