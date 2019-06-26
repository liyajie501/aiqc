package com.sinosoft.aiqc.zj.web;

import com.sinosoft.aiqc.core.util.ResponseUtil;
import com.sinosoft.aiqc.db.service.AiqcAdService;
import com.sinosoft.aiqc.zj.annotation.LoginUser;
import com.sinosoft.aiqc.zj.service.HomeCacheManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * 首页服务
 */
@RestController
@RequestMapping("/zj/home")
@Validated
public class WxHomeController {
        private final Log logger = LogFactory.getLog(WxHomeController.class);

    @Autowired
    private AiqcAdService adService;

    private final static ArrayBlockingQueue<Runnable> WORK_QUEUE = new ArrayBlockingQueue<>(9);

    private final static RejectedExecutionHandler HANDLER = new ThreadPoolExecutor.CallerRunsPolicy();

    private static ThreadPoolExecutor executorService = new ThreadPoolExecutor(9, 9, 1000, TimeUnit.MILLISECONDS, WORK_QUEUE, HANDLER);

    @GetMapping("/cache")
    public Object cache(@NotNull String key) {
        if (!key.equals("aiqc_cache")) {
            return ResponseUtil.fail();
        }

        // 清除缓存
        HomeCacheManager.clearAll();
        return ResponseUtil.ok("缓存已清除");
    }

    /**
     * 首页数据
     * @param userId 当用户已经登录时，非空。为登录状态为null
     * @return 首页数据
     */
    @GetMapping("/index")
    public Object index(@LoginUser Integer userId) {
        //优先从缓存中读取
        if (HomeCacheManager.hasData(HomeCacheManager.INDEX)) {
            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.INDEX));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Map<String, Object> data = new HashMap<>();

        Callable<List> bannerListCallable = () -> adService.queryIndex();


        FutureTask<List> bannerTask = new FutureTask<>(bannerListCallable);

        executorService.submit(bannerTask);


        try {
            data.put("banner", bannerTask.get());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //缓存数据
        HomeCacheManager.loadData(HomeCacheManager.INDEX, data);
        executorService.shutdown();
        return ResponseUtil.ok(data);
    }


}