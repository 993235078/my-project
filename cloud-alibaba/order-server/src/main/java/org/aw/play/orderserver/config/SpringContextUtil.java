package org.aw.play.orderserver.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Irvin
 * @version 1.0.0
 * @className bean.SpringContextUtil
 * @date 2019/3/6 14:16
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) throws BeansException {
        if (applicationContext == null){
            throw new RuntimeException("Spring Context Uninitialized, Unable to Complete Bean search");
        }
        return applicationContext.getBean(requiredType);
    }

    public static Object getBean(String beanBane) throws BeansException {
        if (applicationContext == null){
            throw new RuntimeException("Spring Context Uninitialized, Unable to Complete Bean search");
        }
        return applicationContext.getBean(beanBane);
    }
}
