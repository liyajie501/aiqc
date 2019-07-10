package com.sinosoft.engine.alarm.service;

import com.sinosoft.engine.alarm.model.MsgScore;

public interface CheckAlarmService {
    boolean checkAndSendAlarm(MsgScore paramMsgScore);
}

