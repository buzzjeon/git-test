package com.sds.vuestarter.controller.sample;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sds.vuestarter.entity.sample.SampleVO;
import com.sds.vuestarter.service.sample.SampleService;

@RestController
@RequestMapping("/rest/sample")
public class SampleController {
    final Logger L = LoggerFactory.getLogger(this.getClass());
    
    @Autowired SampleService service;
    
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<SampleVO>> getSample(@RequestParam(required=false) String name){
        L.debug("[GET] /rest/sample : find something : {}",name);
        return ResponseEntity.ok(service.getSample(name));
    }
}
