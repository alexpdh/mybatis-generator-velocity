package com.generator.dao;

import com.generator.model.TfFEmployee;
import com.generator.model.TfFEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfFEmployeeMapper {
    long countByExample(TfFEmployeeExample example);

    int deleteByExample(TfFEmployeeExample example);

    int deleteByPrimaryKey(Long empId);

    int insert(TfFEmployee record);

    int insertSelective(TfFEmployee record);

    List<TfFEmployee> selectByExample(TfFEmployeeExample example);

    TfFEmployee selectByPrimaryKey(Long empId);

    int updateByExampleSelective(@Param("record") TfFEmployee record, @Param("example") TfFEmployeeExample example);

    int updateByExample(@Param("record") TfFEmployee record, @Param("example") TfFEmployeeExample example);

    int updateByPrimaryKeySelective(TfFEmployee record);

    int updateByPrimaryKey(TfFEmployee record);
}