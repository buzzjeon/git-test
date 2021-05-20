package com.sds.vuestarter.entity.menu;

import java.util.List;

public class MenuTreeVO extends MenuVO {
    List<MenuTreeVO> children;

    public List<MenuTreeVO> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTreeVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuTreeVO{" +
                "children=" + children +
                ", id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", seq=" + seq +
                '}';
    }
}
