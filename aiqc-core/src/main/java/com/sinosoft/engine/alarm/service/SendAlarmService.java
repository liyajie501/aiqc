package com.sinosoft.engine.alarm.service;

import com.sinosoft.engine.analyze.model.AlarmLog;

public interface SendAlarmService {
    boolean send(AlarmLog paramAlarmLog);
}

