package org.aw.play.userserver;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class UserServerApplicationTests {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource(name = "redisTemplateDev")
    private RedisTemplate<String, String> redisTemplateDev;

    @Test
    void contextLoads() {
        String s = redisTemplate.opsForValue().get("SUITE_TICKET");
        System.out.println("default===prod===" + s);

        String s2 = redisTemplateDev.opsForValue().get("SUITE_TICKET");
        System.out.println("config===dev===" + s2);
    }

    @Test
    void T2() {
        redisTemplateDev.opsForValue().set("awaw", "awaw", 1, TimeUnit.MINUTES);
        String s = redisTemplate.opsForValue().get("awaw");
        System.out.println("default===prod===" + s);
        System.out.println(StringUtils.isNoneBlank(s));

        String s2 = redisTemplateDev.opsForValue().get("awaw");
        System.out.println("config===dev===" + s2);
        System.out.println(StringUtils.isNoneBlank(s2));
    }

}
