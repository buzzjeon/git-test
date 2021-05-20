package com.sds.vuestarter.entity.menu;

public class MenuVO {
    String id;
    String parentId;
    String url;
    String name;
    String subTitle;
    Integer seq;

    public MenuVO cloneTo() {
        return this.cloneTo(new MenuVO());
    }

    public <T extends MenuVO> T cloneTo(T target) {
        target.setId      (this.id);
        target.setParentId(this.parentId);
        target.setUrl     (this.url);
        target.setName    (this.name);
        target.setSubTitle(this.subTitle);
        target.setSeq     (this.seq);
        return target;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "MenuVO{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", seq=" + seq +
                '}';
    }
}
