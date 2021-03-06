/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.demo.deviceGpsInfos.bo;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_gps_infos`
 *
 * @mbggenerated 2015-12-09 08:31:58
 */
public class DeviceGpsInfos extends DeviceGpsInfosBase {
    private Byte flag;

    private String msgTypeName;

    private int icon;

    private String plateNo;

    private String deviceInfoName;

    private String eventTimeStr;

    private String uploadTimeStr;

    public Byte getFlag() {
        return this.flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getMsgTypeName() {
        return msgTypeName;
    }

    public void setMsgTypeName(String msgTypeName) {
        this.msgTypeName = msgTypeName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getDeviceInfoName() {
        return deviceInfoName;
    }

    public void setDeviceInfoName(String deviceInfoName) {
        this.deviceInfoName = deviceInfoName;
    }

    public String getEventTimeStr() {
        return eventTimeStr;
    }

    public void setEventTimeStr(String eventTimeStr) {
        this.eventTimeStr = eventTimeStr;
    }

    public String getUploadTimeStr() {
        return uploadTimeStr;
    }

    public void setUploadTimeStr(String uploadTimeStr) {
        this.uploadTimeStr = uploadTimeStr;
    }
}