package com.aw.play.testwebmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/8 18:18
 */
public class MyPageProcessor  implements PageProcessor {

    //爬虫配置信息设置
    private Site site = new Site()
            .setCharset("utf-8")    //设置编码
            .setSleepTime(1)        //设置抓取间隔
            .setTimeOut(5000)         //设置超时时间
            .setRetrySleepTime(30)      //设置重试时间
            .setRetryTimes(3);       //设置重试次数



    @Override
    public void process(Page page) {

        //对抓取到的页面进行处理
        String s = page.getHtml().xpath("//*[@id=\"swaggerBootstrapHrefTitle\"]").toString();
        System.out.println("定位的元素为" + s);
        System.out.println("b");
    }

    @Override
    public Site getSite() {
        return this.site;
    }

}
