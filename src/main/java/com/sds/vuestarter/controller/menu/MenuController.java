package com.sds.vuestarter.controller.menu;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sds.vuestarter.entity.menu.MenuTreeVO;
import com.sds.vuestarter.service.menu.MenuService;

@Controller
@RequestMapping("/rest/menu")
public class MenuController {
    final Logger L = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MenuService service;

    @RequestMapping(value="/tree",method= RequestMethod.GET)
    public ResponseEntity<List<MenuTreeVO>> getSample(){
        L.debug("[GET] /rest/sample : find something");
        return ResponseEntity.ok(service.getMenuTree());
    }
}
