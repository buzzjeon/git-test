import axios from "axios";

/* [UTIL] 메뉴 List */
let menuList = [];
/* [UTIL] 메뉴 Map */
let menuMap = null;


function menuBuilder(list){
    let rtn = new Map();
    pushMenu(rtn, list);
    return rtn;
    /* [UTIL][PRIVATE] Menu builder */
    function pushMenu(map, l, purl) {
        if( !l || !l.length ) {return;}
        l.forEach((item) => {
            item.purl = purl;
            map.set(item.url, item);
            if( item.children ) {
                pushMenu(map, item.children,item.url);
            }
        });
    }
}




export default {
    /* [METHOD] 메뉴를 가져옵니다. */
    getList : function(url) {
        if(!url) {
            return menuList;
        } else {
            let menu = this.getMenu(url);
            if(!menu||!menu.children) return [];
            return menu.children;
        }
    },
    getMenu : function(url) {
        return menuMap.get(url);
    },
    getRootMenu : function(url, depth, pathFlag) {
        // 1. get menu by URL
        let myMenu = this.getMenu(url);
        // 2. check? return
        // 2. if, not found?
        if( !myMenu ) {return pathFlag ? [] : null;}
        // 2. if, root?
        if( !myMenu.purl ) {return pathFlag ? [myMenu] : myMenu;}
        // 3. build menu array
        let pUrl = myMenu.url, pMenu = null;
        let menuArr = [];
        while(pUrl) {
            pMenu = menuMap.get(pUrl);
            if(!pMenu) {break;} /*illegal menu tree*/
            menuArr.push(pMenu);
            pUrl = pMenu.purl;
        }
        let lastIdx = menuArr.length - (depth||1);
        return pathFlag ? menuArr : menuArr[lastIdx];
    },
    init : async function() {
        // 1. get menu list from server
        let data = await this.callMenuRest();
        // 2. set data to local
        menuList = data;
        menuMap = menuBuilder(data);

        // TODO 캐시처리 가능할까요? 서버 안갔으면 좋겠는데....
        // TODO async/await 처음 써봄, 맞는 사용법일까요? Promise 를 return 해야하나 말아야 하나
        // @SEE app.js
    },
    callMenuRest : function() {
        return axios.get('rest/menu/tree')
            .then(res => {
                return res.data;
            })
            .catch(err => {
                // TODO doSomething
            });
    }
}