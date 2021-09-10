package org.aw.play.userserver.remote;

import base.DataResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/9/9 14:43
 */
@FeignClient("order-server/o/redis")
public interface RedisService {

    @GetMapping
    DataResult<Boolean> synRedis(@RequestParam("val") String val, @RequestParam("time") Long time);

}
