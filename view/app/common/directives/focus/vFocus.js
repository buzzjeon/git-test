export default {
    name : 'focuss',
    inserted(el,binding, vnode, oldVnode) {
        console.log("[v-focus]", {el, binding, vnode, oldVnode})
        el.focus();
    }
}