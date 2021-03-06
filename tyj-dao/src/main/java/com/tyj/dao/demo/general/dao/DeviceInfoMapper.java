/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.demo.general.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.dao.demo.general.bo.DeviceInfo;

import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_info`
 *
 * @mbggenerated 2015-12-09 08:31:58
 */
@SqlMapper
public interface DeviceInfoMapper extends DaoMapper<DeviceInfo, Integer> {

    List<DeviceInfo> findPageDeviceInfo(Map<String, Object> map);

    List<DeviceInfo> findPageTeamMember(Map<String, Object> map);

    List<DeviceInfo> findPageCars(Map<String, Object> map);

    List<DeviceInfo> findAllCars(Map<String, Object> map);

    void truncate();
}