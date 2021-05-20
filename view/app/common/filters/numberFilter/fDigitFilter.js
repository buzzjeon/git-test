function comma(x) {
    let parts = x.toString().split(".");
    parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    return parts.join(".");
}

function round(x, digit) {
    if(isNaN(x)) return "NaN";
    return x.toFixed(digit||0);
}
export {comma, round};
