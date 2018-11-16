/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.service.demo.old.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.dao.demo.old.bo.FactorWarning;
import com.tyj.dao.demo.old.dao.FactorWarningDao;
import com.tyj.service.demo.old.FactorWarningService;
import java.util.HashMap;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `factor_warning`
 *
 * @mbggenerated 2015-12-27 13:43:44
 */
@Service("factorWarningService")
public class FactorWarningServiceImpl extends GenericSqlMapServiceImpl<FactorWarning, HashMap> implements FactorWarningService {
    @Resource(name = "factorWarningDao")
    private FactorWarningDao factorWarningDao;

    @Override
    public SqlMapDao<FactorWarning, HashMap> getDao() {
        return factorWarningDao;
    }
}