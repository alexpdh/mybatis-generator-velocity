package com.generator.service.impl;

import com.generator.common.annotation.BaseService;
import com.generator.common.base.BaseServiceImpl;
import com.generator.dao.TfFEmployeeMapper;
import com.generator.model.TfFEmployee;
import com.generator.model.TfFEmployeeExample;
import com.generator.service.TfFEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TfFEmployeeService实现
* Created by pengdh on 2017/8/3.
*/
@Service
@Transactional
@BaseService
public class TfFEmployeeServiceImpl extends BaseServiceImpl<TfFEmployeeMapper, TfFEmployee, TfFEmployeeExample> implements TfFEmployeeService {

    private static Logger _log = LoggerFactory.getLogger(TfFEmployeeServiceImpl.class);

    @Autowired
    TfFEmployeeMapper tfFEmployeeMapper;

}