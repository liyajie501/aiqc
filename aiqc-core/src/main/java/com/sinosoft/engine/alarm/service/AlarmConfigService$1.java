package com.sinosoft.engine.alarm.service;


import com.sinosoft.engine.analyze.model.Alarm;

import java.util.List;

class AlarmConfigService$1 implements Runnable {

    public void run() {
        int minute = 1;
        AlarmConfigService.access$000().info("启动定时刷新告警配置功能(每" + minute + "分钟)");
        int num = 0;
        while (true) {
            try {
                List<Alarm> list = AlarmConfigService.access$100(AlarmConfigService.this).selectAllUse();
                synchronized (AlarmConfigService.alarmConfig) {
                    AlarmConfigService.alarmConfig.clear();
                    AlarmConfigService.alarmConfig.addAll(list);
                    num = AlarmConfigService.alarmConfig.size();
                }
            } catch (Exception e) {
                AlarmConfigService.access$000().error("同步告警配置异常", e);
            }
            try {
                Thread.sleep((60000 * minute));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AlarmConfigService.access$000().info("同步告警配置记录条数=" + num);
            num = 0;
        }
    }
}


