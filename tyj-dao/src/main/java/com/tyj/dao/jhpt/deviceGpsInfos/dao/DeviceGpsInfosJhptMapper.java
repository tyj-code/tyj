/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.jhpt.deviceGpsInfos.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.dao.jhpt.deviceGpsInfos.bo.DeviceGpsInfos;

import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_gps_infos`
 *
 * @mbggenerated 2015-12-10 09:17:05
 */
@SqlMapper
public interface DeviceGpsInfosJhptMapper extends DaoMapper<DeviceGpsInfos, Integer> {

    List<DeviceGpsInfos> findByDeviceIdAndTime(Map<String, Object> params);
}