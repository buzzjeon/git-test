import moment from 'moment';
function formattedDate(value, _fmt) {
    if (!value) { return ""; }
    let fmt = _fmt || 'YYYY-MM-DD hh:mm:ss.S';
    return moment(value).format(fmt);
}
export default formattedDate;