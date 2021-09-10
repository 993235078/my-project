package org.aw.play.userserver.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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
     * 定时取消待支付的套餐包订单 每1分自动执行一次
     *
     * @author Irvin
     * @date 2020/8/7
     */
    @Scheduled(cron = "0/30 * * * * ?")
    public void timingCancelOrder() {
        //定义要同步的key
        String key = "SUITE_TICKET";
        //查询生产环境的值
        String suiteTicketPro = redisTemplate.opsForValue().get(key);
        if (StringUtils.isNotBlank(suiteTicketPro)) {
            Long time = redisTemplate.getExpire(key, TimeUnit.SECONDS);
            log.info("定时同步SUITE_TICKET: 查询到结果{}, 过期时间{}", suiteTicketPro, time);
            //查询测试环境的值是否存在，是否和生产一样，如果一样就不同步
            String suiteTicketDev = redisTemplateDev.opsForValue().get(key);
            if (StringUtils.isNotBlank(suiteTicketDev) && suiteTicketDev.equals(suiteTicketPro)) {
                log.info("两个db结果一样，无需更改");
                return;
            }
            //根据生产的值的过期时间来处理测试环境的值的过期时间
            if (null != time) {
                redisTemplateDev.opsForValue().set(key, suiteTicketPro, time, TimeUnit.SECONDS);
            }else {
                redisTemplateDev.opsForValue().set(key, suiteTicketPro, 10, TimeUnit.MINUTES);
            }
        }else {
            log.info("定时同步SUITE_TICKET: 未查询到结果");
        }
    }

}
