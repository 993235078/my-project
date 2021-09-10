package org.aw.play.orderserver.controller;

import base.DataResult;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/9/9 14:38
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping
    public DataResult<Boolean> synRedis(@RequestParam("val") String val, @RequestParam("time") Long time){
        Object suiteTicket = redisTemplate.opsForValue().get("SUITE_TICKET");
        if (null != suiteTicket) {
            String st = (String) suiteTicket;
            if (st.equals(val)) {
                return new DataResult<>(0, 200, true, "一样，没必要更新");
            }
        }
        redisTemplate.opsForValue().set("SUITE_TICKET", val, time, TimeUnit.SECONDS);
        return new DataResult<>(0, 200, true, "更新完成");
    }
}
