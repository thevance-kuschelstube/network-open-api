package dev.pascxl.open.api.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface RedisClient {

    Jedis jedis();

    JedisPool redisPool();

}
