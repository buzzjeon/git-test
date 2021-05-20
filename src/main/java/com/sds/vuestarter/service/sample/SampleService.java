package com.sds.vuestarter.service.sample;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.vuestarter.entity.sample.SampleVO;
import com.sds.vuestarter.mapper.sample.SampleMapper;

@Service
public class SampleService {
    final Logger L = LoggerFactory.getLogger(this.getClass());
    
    @Autowired SampleMapper mapper;
    
    public List<SampleVO> getSample() {
        return this.getSample(null); 
    }

    public List<SampleVO> getSample(String name) {
        return mapper.getList(name);
    }
}
