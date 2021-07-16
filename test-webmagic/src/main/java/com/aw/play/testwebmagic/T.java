package com.aw.play.testwebmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/8 18:17
 */
public class T implements PageProcessor {


    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    @Override
    public void process(Page page) {
        // 部分二：定义如何抽取页面信息，并保存下来
        /*String s = page.getHtml().xpath("//*[@id=\"304393069\"]/div/div[2]/div/div[1]/div/div[6]/div[1]/div[1]/div").toString();
        System.out.println(s);
        page.putField("name", s);
        if (page.getResultItems().get("name") == null) {
            //skip this page
            page.setSkip(true);
        }
        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));*/

        // 部分三：从页面发现后续的url地址来抓取
        //page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new T()).addUrl("https://hotels.ctrip.com/hotels/71056597.html").thread(1).run();
        System.out.println("a");
    }


}
