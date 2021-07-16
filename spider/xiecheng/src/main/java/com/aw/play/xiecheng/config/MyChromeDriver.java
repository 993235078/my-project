package com.aw.play.xiecheng.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/9 14:01
 */
@Component
@Slf4j
@Data
public class MyChromeDriver {

    private ChromeDriver browser;

    @PostConstruct
    private void init() {
        System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("disable-infobars");

        browser = new ChromeDriver(options);
        browser.get("https://www.ctrip.com/");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(2);
            log.info("初始化成功，首页是:{}", browser.getTitle());
        } catch (InterruptedException e) {
            log.error("初始化ChromeDriver的过程中线程等待异常");
            browser = null;
        }

    }

}
