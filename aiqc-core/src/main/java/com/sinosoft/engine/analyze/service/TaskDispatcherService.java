package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.analyze.model.Task;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


@Service
public class TaskDispatcherService
        implements Runnable {
    private static Logger logger = Logger.getLogger(TaskDispatcherService.class);
    private static BlockingQueue<Task> queue = new LinkedBlockingQueue();

    @Autowired
    private ThreadPoolTaskExecutor cachedThreadPool;
    @Autowired
    private CacheService cacheService;

    public static void addTask(Task task) {
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            logger.error("添加任务异常:" + JSONObject.fromObject(task).toString(), e);
        }
    }

    public void run() {
        logger.info("启动任务分发器");
        while (true) {
            try {
                while (true) {
                    Task task = (Task) queue.take();
                    TaskHandleService handle = new TaskHandleService(this.cacheService, task);
                    this.cachedThreadPool.submit(handle);
                }
            } catch (Exception e) {
                logger.error("任务分发器异常", e);
                break;
            }
        }
    }


    public ThreadPoolTaskExecutor getCachedThreadPool() {
        return this.cachedThreadPool;
    }


    public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) {
        this.cachedThreadPool = cachedThreadPool;
    }
}


