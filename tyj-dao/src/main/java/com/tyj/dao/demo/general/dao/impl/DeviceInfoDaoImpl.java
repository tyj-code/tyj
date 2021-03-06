/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.demo.general.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.tyj.dao.demo.general.bo.DeviceInfo;
import com.tyj.dao.demo.general.dao.DeviceInfoDao;
import com.tyj.dao.demo.general.dao.DeviceInfoMapper;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_info`
 *
 * @mbggenerated 2015-12-09 08:31:58
 */
@Repository("deviceInfoDao")
public class DeviceInfoDaoImpl extends ConfigurableBaseSqlMapDao<DeviceInfo, Integer> implements DeviceInfoDao {
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    @Override
    public DaoMapper<DeviceInfo, Integer> getDaoMapper() {
        return deviceInfoMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoMapper.findPageDeviceInfo(map);
    }

    @Override
    public List<DeviceInfo> findPageTeamMember(Map<String, Object> map) {
        return deviceInfoMapper.findPageTeamMember(map);
    }

    @Override
    public List<DeviceInfo> findPageCars(Map<String, Object> map) {
        return deviceInfoMapper.findPageCars(map);
    }

    @Override
    public List<DeviceInfo> findAllCars(Map<String, Object> map) {
        return deviceInfoMapper.findAllCars(map);
    }

    @Override
    public void truncate() {
        deviceInfoMapper.truncate();
    }
}