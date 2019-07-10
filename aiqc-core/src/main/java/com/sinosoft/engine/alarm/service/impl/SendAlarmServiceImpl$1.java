package com.sinosoft.engine.alarm.service.impl;


import com.sinosoft.engine.analyze.model.AlarmLog;

import java.util.Comparator;

class SendAlarmServiceImpl$1 extends Object implements Comparator<AlarmLog> {

    public int compare(AlarmLog o1, AlarmLog o2) {
        return o1.getRecordFile().compareTo(o2.getRecordFile());
    }

}


