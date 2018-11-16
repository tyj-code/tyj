/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.tyj.service.demo.taskStatus.service;

import cn.vansky.framework.core.service.GenericService;
import com.tyj.dao.demo.taskStatus.bo.TaskStatus;

import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table `tb_task_status`
 *
 * @mbggenerated 2015-12-22 10:50:37
 */
public interface TaskStatusService extends GenericService<TaskStatus, Integer> {

    TaskStatus findTaskStatus(Map<String, Object> params);
}