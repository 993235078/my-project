package org.aw.play.userserver.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/9/9 14:36
 */
@Component
@Async
@Slf4j
public class SynRedis {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource(name = "redisTemplateDev")
    private RedisTemplate<String, String> redisTemplateDev;


    /**
     * 定时同步生产环境的企业微信token到测试环境
     *
     * @author Irvin
     * @date 2020/8/7
     */
    @Scheduled(cron = "0/30 * * * * ?")
    public void timingCancelOrder() {
        //定义要同步的key
        String p = "SUITE_TICKET_KEY";
        //查询生产环境的值
        Set<String> keys = scan(p);
        assert keys != null;
        //log.info("keys的数量{}", keys);
        for (String key : keys) {
            key = key.substring(key.indexOf("#") + 1);
            String suiteTicketPro = redisTemplate.opsForValue().get(key);
            if (StringUtils.isNotBlank(suiteTicketPro)) {
                Long time = redisTemplate.getExpire(key, TimeUnit.SECONDS);
                log.info("定时同步key{} 查询到结果{}, 过期时间{}", key, suiteTicketPro, time);
                //查询测试环境的值是否存在，是否和生产一样，如果一样就不同步
                String suiteTicketDev = redisTemplateDev.opsForValue().get(key);
                if (StringUtils.isNotBlank(suiteTicketDev) && suiteTicketDev.equals(suiteTicketPro)) {
                    log.info("两个db结果一样，无需更改");
                    continue;
                }
                //根据生产的值的过期时间来处理测试环境的值的过期时间
                if (null != time) {
                    redisTemplateDev.opsForValue().set(key, suiteTicketPro, time, TimeUnit.SECONDS);
                }else {
                    redisTemplateDev.opsForValue().set(key, suiteTicketPro, 20, TimeUnit.MINUTES);
                }
            }else {
                log.info("定时同步key{} 未查询到结果", key);
            }
        }
    }




    public Set<String> scan(String matchKey) {
        return redisTemplate.execute((RedisCallback<Set<String>>) connection -> {
            Set<String> keysTmp = new HashSet<>();
            Cursor<byte[]> cursor = connection.scan(new ScanOptions.ScanOptionsBuilder().match("*" + matchKey + "*").count(1000).build());
            while (cursor.hasNext()) {
                keysTmp.add(new String(cursor.next()));
            }
            return keysTmp;
        });
    }
}
