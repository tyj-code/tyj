/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.jhpt.deviceInfo.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.tyj.dao.jhpt.deviceInfo.bo.DeviceInfo;
import com.tyj.dao.jhpt.deviceInfo.dao.DeviceInfoJhptDao;
import com.tyj.dao.jhpt.deviceInfo.dao.DeviceInfoJhptMapper;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_info`
 *
 * @mbggenerated 2015-12-10 09:17:05
 */
@Repository("deviceInfoDaoJhpt")
public class DeviceInfoJhptDaoImpl extends ConfigurableBaseSqlMapDao<DeviceInfo, Integer> implements DeviceInfoJhptDao {
    @Autowired
    private DeviceInfoJhptMapper deviceInfoMapper;

    @Override
    public DaoMapper<DeviceInfo, Integer> getDaoMapper() {
        return deviceInfoMapper;
    }

    @Resource(name = "sqlSessionFactoryJhpt")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}