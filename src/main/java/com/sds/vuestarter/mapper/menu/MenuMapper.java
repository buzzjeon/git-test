package com.sds.vuestarter.mapper.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sds.vuestarter.entity.menu.MenuVO;

@Repository
@Mapper
public interface MenuMapper {
    List<MenuVO> getList();
}
