package com.sds.vuestarter.mapper.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sds.vuestarter.entity.sample.SampleVO;

@Repository /* [OPTIONAL][TRICK] for IntelliJ, autowired fail, can delete */
@Mapper
public interface SampleMapper {
    List<SampleVO> getList(@Param("name") String name);
}
