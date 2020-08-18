package com.sunday.dianshang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Sunday
 * @date 2020/6/18
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        //测试修改
        //新建dev
        return new RedisTemplate<>();
    }
}
