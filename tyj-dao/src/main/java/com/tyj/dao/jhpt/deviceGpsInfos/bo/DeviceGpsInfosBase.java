/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.dao.jhpt.deviceGpsInfos.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `device_gps_infos`
 *
 * @mbggenerated 2015-12-10 09:17:05
 */
public abstract class DeviceGpsInfosBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.device_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_DEVICEID = "deviceId";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.device_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_DEVICEID = "设备ID";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.device_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEVICEID)
    private Integer deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_MSGID = "msgId";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_MSGID = "终端带的消息ID";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGID)
    private Integer msgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.event_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_EVENTTIME = "eventTime";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.event_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_EVENTTIME = "数据采集时间";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.event_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EVENTTIME)
    private Date eventTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.longitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_LONGITUDE = "longitude";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.longitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_LONGITUDE = "经度";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.longitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LONGITUDE)
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.latitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_LATITUDE = "latitude";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.latitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_LATITUDE = "纬度";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.latitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LATITUDE)
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.speed
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_SPEED = "speed";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.speed
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_SPEED = "车速";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.speed
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPEED)
    private Integer speed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_type
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_MSGTYPE = "msgType";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_type
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_MSGTYPE = "告警类型";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.msg_type
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MSGTYPE)
    private Byte msgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.flash_state
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_FLASHSTATE = "flashState";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.flash_state
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_FLASHSTATE = "设备flash状态" +
            "（正常为00，当FLASH存储空间饱和为FF）" +
            "设备flash状态" +
            "（正常为00，当FLASH存储空间饱和为FF）" +
            "设备flash状态" +
            "（正常为00，当FLASH存储空间饱和为FF）" +
            "设备flash状态";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.flash_state
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FLASHSTATE)
    private Byte flashState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.upload_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_UPLOADTIME = "uploadTime";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.upload_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_UPLOADTIME = "上传时间";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.upload_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPLOADTIME)
    private Date uploadTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.acceleration
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_ACCELERATION = "acceleration";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.acceleration
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    private static final String PROPERTY_REMARK_ACCELERATION = "";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column `device_gps_infos`.acceleration
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ACCELERATION)
    private Float acceleration;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.id
     *
     * @return the value of `device_gps_infos`.id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.id
     *
     * @param id the value for `device_gps_infos`.id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.device_id
     *
     * @return the value of `device_gps_infos`.device_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.device_id
     *
     * @param deviceId the value for `device_gps_infos`.device_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.msg_id
     *
     * @return the value of `device_gps_infos`.msg_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.msg_id
     *
     * @param msgId the value for `device_gps_infos`.msg_id
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.event_time
     *
     * @return the value of `device_gps_infos`.event_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.event_time
     *
     * @param eventTime the value for `device_gps_infos`.event_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.longitude
     *
     * @return the value of `device_gps_infos`.longitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.longitude
     *
     * @param longitude the value for `device_gps_infos`.longitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.latitude
     *
     * @return the value of `device_gps_infos`.latitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.latitude
     *
     * @param latitude the value for `device_gps_infos`.latitude
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.speed
     *
     * @return the value of `device_gps_infos`.speed
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.speed
     *
     * @param speed the value for `device_gps_infos`.speed
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.msg_type
     *
     * @return the value of `device_gps_infos`.msg_type
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Byte getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.msg_type
     *
     * @param msgType the value for `device_gps_infos`.msg_type
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.flash_state
     *
     * @return the value of `device_gps_infos`.flash_state
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Byte getFlashState() {
        return flashState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.flash_state
     *
     * @param flashState the value for `device_gps_infos`.flash_state
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setFlashState(Byte flashState) {
        this.flashState = flashState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.upload_time
     *
     * @return the value of `device_gps_infos`.upload_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.upload_time
     *
     * @param uploadTime the value for `device_gps_infos`.upload_time
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column `device_gps_infos`.acceleration
     *
     * @return the value of `device_gps_infos`.acceleration
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public Float getAcceleration() {
        return acceleration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column `device_gps_infos`.acceleration
     *
     * @param acceleration the value for `device_gps_infos`.acceleration
     *
     * @mbggenerated 2015-12-10 09:17:05
     */
    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }
}