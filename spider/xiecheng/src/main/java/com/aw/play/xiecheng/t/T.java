package com.aw.play.xiecheng.t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/9 9:28
 */
public class T {



    public static void main(String[] args) throws Exception{
        ChromeDriver browser = null;
        try {
            System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
            //String oldCookie = "ibulanguage=CN; ibulocale=zh_cn; cookiePricesDisplayed=CNY; _RDG=28fd48d485801c21023cbcbc3728765f3d; _RSG=diKsq1LO889Q4Pan08N0pA; _RGUID=92086150-74d9-4b27-acc0-5c803191911a; MKT_CKID=1625644366212.rhkp3.kqcc; _ga=GA1.2.2063812273.1625644366; _gid=GA1.2.1626427713.1625644366; MKT_Pagesource=PC; _abtest_userid=b88a8aec-946d-49bf-80c4-b66dd1d968ec; _gcl_au=1.1.894396440.1625644376; login_uid=03E9810E2554E377BFCDC2DFE1369977; login_type=0; cticket=2E553F04E18B226BA9DDD6A21FF7ABE1FA695956369D90955BA6E6731364EA3B; AHeadUserInfo=VipGrade=0&VipGradeName=%C6%D5%CD%A8%BB%E1%D4%B1&UserName=&NoReadMessageCount=0; ticket_ctrip=bJ9RlCHVwlu1ZjyusRi+ypZ7X2r4+yojJo62jOwczWFFKWD2l1UH2J195pkEhVlk+9RfH91yWQedb6VRnCFLTR8G9yiFutr1/Y/hACwZpgBKG87VNtbdb6xGSp4vmUUj2Z8Y2PAha6g4CFS38v8MiyhgkJZH0C+l92sqZVkJWgJeA/4l1DFj4swUvoEamsRX69VpQ5QQed8WiDb5VoojDLHOS3DkEsCPbIRD2AOWs/FlbVcWyKkHUkkIb3mN1JOvR2kR4evMJKLhcY1Jvb4JX31NEDhFndOu7/UJCK018vA=; DUID=u=06073D2122DCB62FF280710D831E4A0F&v=0; IsNonUser=F; intl_ht1=h4=477_71056597,477_1944239,477_1252182; nfes_isSupportWebP=1; _uetvid=92070ad0df0111eba1fc79e7ec495c5e; Union=OUID=index&AllianceID=4897&SID=155952&SourceID=&createtime=1625727247&Expires=1626332047120; MKT_OrderClick=ASID=4897155952&AID=4897&CSID=155952&OUID=index&CT=1625727247122&CURL=https%3A%2F%2Fwww.ctrip.com%2F%3Fsid%3D155952%26allianceid%3D4897%26ouid%3Dindex&VAL={\"pc_vid\":\"1625644363331.2278e6\"}; HotelCityID=477split%E6%AD%A6%E6%B1%89splitWuhansplit2021-7-8split2021-07-09split0; appFloatCnt=16; manualclose=1; _RF1=183.95.63.82; MKT_CKID_LMT=1625739807873; librauuid=FLPs2lDdZpqF2MnZ; _bfi=p1%3D102003%26p2%3D102003%26v1%3D28%26v2%3D27; _gat=1; _jzqco=%7C%7C%7C%7C1625739807990%7C1.1519862966.1625644366211.1625793745408.1625796249497.1625793745408.1625796249497.0.0.0.27.27; __zpspc=9.7.1625796249.1625796249.1%232%7Cwww.baidu.com%7C%7C%7C%25E6%2590%25BA%25E7%25A8%258B%7C%23; _bfa=1.1625644363331.2278e6.1.1625793742061.1625796246143.7.29; _bfs=1.2";
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("disable-infobars");

            browser = new ChromeDriver(options);
            browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            browser.get("https://hotels.ctrip.com/hotels/71056597.html");



        /*String[] split = oldCookie.split("; ");
        for (String s : split) {
            String[] inner = s.split("=");
            Cookie cookie = new Cookie(inner[0], inner[1]);
            browser.manage().addCookie(cookie);
        }*/

            //browser.manage().window().maximize();
            TimeUnit.SECONDS.sleep(2);

            System.out.println(browser.getTitle());

            //WebElement elementByXPath = browser.findElementByXPath("//*[@id=\"304393099\"]/div/div[1]/div[2]");
            //System.out.println(elementByXPath.getText());


            List<WebElement> elementsByClassName = browser.findElementsByClassName("roomlist-baseroom-card");
            System.out.println(elementsByClassName.size());
            elementsByClassName.remove(0);
            elementsByClassName.remove(elementsByClassName.size() - 1);

            elementsByClassName.forEach(el -> {
                WebElement roomname = el.findElement(By.className("roomname"));
                System.out.println(roomname.getText());
                WebElement price = el.findElement(By.className("price"));
                System.out.println(price.getText());
                //#\33 04393099 > div > div.saleroomlist > div > div > div > div.salecard-price.hover > div.salecard-price-panel > div.price > div

            } );

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert browser != null;
            browser.close();
            browser.quit();
        }
    }

}
