package com.aw.play.xiecheng.controller;

import com.aw.play.xiecheng.config.MyChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/9 14:06
 */
@RestController
@RequestMapping("/test")
public class TC {

    @Resource
    private MyChromeDriver myChromeDriver;


    @GetMapping("/{hotelId}")
    public String t1(@PathVariable("hotelId") String hotelId) {
        ChromeDriver browser = myChromeDriver.getBrowser();
        if (null == browser) {
            return "初始化失败";
        }
        //71056597
        browser.get("https://hotels.ctrip.com/hotels/" + hotelId + ".html");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(browser.getTitle());

        List<WebElement> elementsByClassName = browser.findElementsByClassName("roomlist-baseroom-card");
        System.out.println(elementsByClassName.size());
        elementsByClassName.remove(0);

        elementsByClassName.forEach(el -> {
            WebElement roomName = el.findElement(By.className("roomname"));
            System.out.println(roomName.getText());
            WebElement priceElement = el.findElement(By.className("price"));
            String price = priceElement.getText();
            System.out.println(price);
            System.out.println(price.substring(price.lastIndexOf("￥") + 1));
        });
        return "wow";
    }
}
