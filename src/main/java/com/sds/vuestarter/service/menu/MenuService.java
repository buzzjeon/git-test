package com.sds.vuestarter.service.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.vuestarter.entity.menu.MenuTreeVO;
import com.sds.vuestarter.entity.menu.MenuVO;
import com.sds.vuestarter.mapper.menu.MenuMapper;
import com.sds.vuestarter.util.string.StringUtil;

@Service
public class MenuService {
    @Autowired MenuMapper mapper;

    public List<MenuTreeVO> getMenuTree() {
        // 1. get raw data
        List<MenuVO> rawData = mapper.getList();
        // 2. build MenuMap
        Map<String, MenuTreeVO> menuMap = new HashMap<>();
        for(MenuVO m : rawData) {
            menuMap.put(m.getId(), m.cloneTo(new MenuTreeVO()));
        }
        // 3. build menuTree List
        List<MenuTreeVO> treeList = new ArrayList<>();
        for(MenuVO m : rawData) {
            // 3.0 prepare...
            String key = m.getId();
            MenuTreeVO mTree = menuMap.get(key);

            if(StringUtil.isEmpty(m.getParentId())) {
                // 3.1 root element -> append to treeList(rtn)
                treeList.add(mTree);
            } else {
                // 3.2 others...
                // 3.2.1 check exist parent.
                if(!menuMap.containsKey(key)) {
                    // throws exception
                }
                // 3.2.2 get parent
                MenuTreeVO pTreeItem = menuMap.get(m.getParentId());
                // 3.2.3 check/init children list
                if(pTreeItem.getChildren()==null) {
                    pTreeItem.setChildren(new ArrayList<>());
                }
                // 3.2.4 append item
                pTreeItem.getChildren().add(mTree);
            }
        }


        return treeList;
    }
}
