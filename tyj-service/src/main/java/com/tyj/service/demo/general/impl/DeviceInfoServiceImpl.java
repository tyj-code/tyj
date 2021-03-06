/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.service.demo.general.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.tyj.dao.demo.general.bo.DeviceInfo;
import com.tyj.dao.demo.general.dao.DeviceInfoDao;
import com.tyj.service.demo.general.DeviceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_info`
 *
 * @mbggenerated 2015-12-09 08:31:58
 */
@Service("deviceInfoService")
public class DeviceInfoServiceImpl extends GenericSqlMapServiceImpl<DeviceInfo, Integer> implements DeviceInfoService {
    @Resource(name = "deviceInfoDao")
    private DeviceInfoDao deviceInfoDao;

    @Override
    public SqlMapDao<DeviceInfo, Integer> getDao() {
        return deviceInfoDao;
    }

    @Override
    public List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map) {
        return deviceInfoDao.findPageDeviceInfo(map);
    }

    @Override
    public List<DeviceInfo> findPageTeamMember(Map<String, Object> map) {
        return deviceInfoDao.findPageTeamMember(map);
    }

    @Override
    public List<DeviceInfo> findPageCars(Map<String, Object> map) {
        return deviceInfoDao.findPageCars(map);
    }

    @Override
    public List<DeviceInfo> findAllCars(Map<String, Object> map) {
        return deviceInfoDao.findAllCars(map);
    }

    @Override
    public void truncate() {
        deviceInfoDao.truncate();
    }
}