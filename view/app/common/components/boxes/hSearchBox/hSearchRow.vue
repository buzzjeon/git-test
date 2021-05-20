<template>
    <div class="h-search-row">
        <slot></slot>
    </div>
</template>

<script>
    export default {
        name: "hSearchRow",
        data() {return {
            col : 0,
            labelSize: null
        }},
        beforeMount() {
            this.col = this.$parent.col;
            this.labelSize = this.$parent.labelSize;
        }
    }
</script>
