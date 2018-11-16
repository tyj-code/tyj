/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.service.demo.deviceGpsInfos.service;

import cn.vansky.framework.core.service.GenericService;
import com.tyj.dao.demo.deviceGpsInfos.bo.DeviceGpsInfosCount;

import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_gps_infos_count`
 *
 * @mbggenerated 2015-12-30 16:45:19
 */
public interface DeviceGpsInfosCountService extends GenericService<DeviceGpsInfosCount, Integer> {

    void delByDeviceIdAndTime(Map<String, Object> params);

    List<DeviceGpsInfosCount> findParams(Map<String, Object> params);

    List<DeviceGpsInfosCount> findTotalAlarm(Map<String, Object> params);
}