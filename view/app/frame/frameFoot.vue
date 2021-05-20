<template>
    <div class="foot-frame">
        <div class="foot-copylight">
            Copyright {{thisYear}} SAMSUNG SDS. All rights reserved.
        </div>
    </div>
</template>


<script>
export default {
    computed: {
        thisYear: () => new Date().getFullYear()
    }
}
</script>