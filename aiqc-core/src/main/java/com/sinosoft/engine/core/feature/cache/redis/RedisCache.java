package com.sinosoft.engine.core.feature.cache.redis;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;


@Component("redisCache")
public class RedisCache {
    private int port = 6379;
    private String host = "127.0.0.1";
    private Jedis jedis = new Jedis(this.host, this.port);

    public String cache(String key, String value, int seconds) {
        String result = this.jedis.set(key, value);
        this.jedis.expire(key, seconds);
        return result;
    }


    public String get(String key) {
        return this.jedis.get(key);
    }
}


