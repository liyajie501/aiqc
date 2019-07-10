
package com.sinosoft.engine.alarm.service;


import com.sinosoft.engine.analyze.dao.AlarmMapper;
import com.sinosoft.engine.analyze.model.Alarm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Service
public class AlarmConfigService {
    private static final Logger logger = Logger.getLogger(AlarmConfigService.class);

    public static final List<Alarm> alarmConfig = new ArrayList();


    @Autowired
    private AlarmMapper alarmMapper;


    @PostConstruct
    private void startUpadteConfig() {

        Runnable updateConfig = new Runnable() {

            public void run() {

                int minute = 1;

                logger.info("启动定时刷新告警配置功能(每" + minute + "分钟)");

                int num = 0;

                while (true) {

                    try {

                        List<Alarm> list = AlarmConfigService.this.alarmMapper.selectAllUse();

                        synchronized (AlarmConfigService.alarmConfig) {

                            AlarmConfigService.alarmConfig.clear();

                            AlarmConfigService.alarmConfig.addAll(list);

                            num = AlarmConfigService.alarmConfig.size();

                        }

                    } catch (Exception e) {

                        logger.error("同步告警配置异常", e);

                    }

                    try {

                        Thread.sleep((60000 * minute));

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    logger.info("同步告警配置记录条数=" + num);

                    num = 0;

                }

            }

        };

        (new Thread(updateConfig)).start();

    }

}

