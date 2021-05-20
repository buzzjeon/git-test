<template>
    <div class="h-page">
        <page-title></page-title>
        <div class="h-page__contents">
            <slot></slot>
        </div>
    </div>
</template>

<script>
import pageTitle from "./hPageTitle"

export default {
    name: "h-page",
    components: {pageTitle}
}
</script>
