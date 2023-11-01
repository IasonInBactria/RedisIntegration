package com.example.redisintegration;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class SpringRedisTemplateTest {
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void getTest(){
        ValueOperations<String, String> valueOps = stringRedisTemplate.opsForValue();
        String name = valueOps.get("name");
        System.out.println(name);
    }
}
