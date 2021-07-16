package com.example.meituan.util;

import java.io.UnsupportedEncodingException;

public class URLUtils {

    private final static String ENCODE = "UTF-8";
    /**
     * URL 解码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:09:51
     */
    public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLDecoder.decode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * URL 转码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:10:28
     */
    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * @return void
     * @author lifq
     * @date 2015-3-17 下午04:09:16
     */
    public static void main(String[] args) {
        //String str = "eJxVVWmrpEoS%2FS8Xpr%2FYtPvW0AzulktplbuP4eK%2BW2q5P%2Ba%2Fj7d578GInIwTGRlEZGRk%2Fvkx3dKPnzB0fdj3jzWbPn5%2BwD%2BgH8TH94%2F5fc0QCIbDBEygEE19%2F0j%2BXwfT9PePeHL5j59%2FwDhGfIdx6D9fmuel%2BAOmEeg7DFGX6m8Zu2QEu%2F4vq9tl9FHO8%2FD%2BCYLVjy6r5iXqfySvDoy2ASxxsHzNWQsOrwpMs6j9Uc5d%2B%2B%2BL3dJfGElgCIx9S6r5uChOfnvP0TTbVZf9%2BooPoxHqKynoW9an%2F2hx8grjtzaZPy9HvxAYxUgIgWEURfArxisvCkMwArrsMAqjSJT8ws8E%2FsxokkTQC%2FDLN01gMIyQn9G%2FEDwjLojTC6LsH5p80fiL0hdQ%2BAU08kW%2FpPhrGU3%2BTX%2FPUl92GfU1C30B%2BRmjEHRF%2B%2FmCP9PfG3EFPEdF%2FNlc5UK%2BzcdwJfXtbMU2Kn7N05JdJfu49rWzr329xuavMfprnP%2Fm%2BlXjy%2FZdFf0lZcouuu%2FOGsnCAsM0gvVQ6Kgm8JvHTDEPJKxvDnIjyCDk9pPjHixbZrRGoenq0edDaZM7r5yKHqo%2B1DQMSdLSsoPM0wXerrJqZaDWJ5mNwSoyIODc9BVcdekRStYEjob6vvxJcvF6Bn3BNXUvzrP0uOsdSx1KM9gn%2B3T3eatfnezAxT5gJxaZ7PCs1GmoD6sqeAatuZHQTr1brLtQMMlQpsYiz1ghoF5YALJgA%2BWDMQLpNg9VcFNHxQL1DPIZVxSUTn6pwX1EJoS4qZZG4AOebFyLtVqsHMedJ8cSVBJFkISH3QkKp6AB0dmOdMe43lUajg74h0xQq7CsIjhP2%2F0dVwogoPZTddOHdR4v4LACrspMcNermJOE1AX6mWYQcKp4DQrQxsECoRyC%2B7NKyRKPn7X%2B4gJgt71ShfrDZeA1ygpdKB%2BeQ8CZs8qbRCe6wmGaV%2BZO6xUpoZW9P9EkNAHVqarDcdQle%2Bsy2C95x6xm22cYb7QNillvoYrKUM1xSvAMWcURDW5GilBgwzZ53ku24YS1j1LVEW0e5wsR6AD4cNeEtpFRbTmKdLPQA9UQ9mx6IJvCiG6NOhHYYU%2B0vXQaGG4qXXlbjjWqRtUVTj9Of996sPKO1XyGfO1UICbrMsFL4404RoeLKyHMQRCEG2ef76y%2FwVQO5j3y1s5uUFnRnFIMZY%2B3ECuwZ%2BxzoqWGcwKy3QqK1zyGrV1aD0K0VDdYDunAxbx8Jnp890p%2BIg5yYnV5iEtU2gKhSjxn3t%2BGE4yBvCD4mb49EjL4DRmu64%2BQRukGu%2FNkXxEVGJubzMuc5YlITJ%2FcIXCNOGzMHj6t4Wn8yDJ%2FD0RiDDSSmOJqQ3eYfIkiaMAq85i3hrTJOnn75rNB63ZSxhjM1VFmAUJCWV9rubakAd%2FkN4ZKr%2BYwErAg5BPZm9S3wOCQ3E3MxVN8znen0fl6NdyeAIP6qRqMvm4Cx7amnc9IBjV8Aa1RMCn3xdqDVRLn63qpEsho4f6NLXcJS2%2F1GCLtTA7ce%2BPIgJZ7FbvHhF6QUTGNMQ23CeOd1IK0xL6LODq4YYgtJ%2ByscIO%2BjXJW%2BALfF31eT28ke7f3TCtFEUd6ReFquzPU7lKu0WOXhu%2F7KTM33j31vT%2BoLJ1JO24Xf7%2Fx%2FYtA5tHFamubF%2FSEkWcc2DWu3vt%2B0TBsufrXGwP6cNLZlrMhcM9zB4DWYsN%2BEDEbPuA0vtVQtuMMiA72kAwss0yryAvojiOsbdjT4gYxjJ83Mna1HELSugHk3ZBbwUe9waYWI63fpAAPuGyhmrEUHBWD92SoUq91RACpztc8ZODkMW2COJmcc6hclCcIvSINr0xzzJal8JPymZIJiWXe0ijR1eD8mm1FCZNM5majKG72M%2BIJ41BNra0mO7NiBBl8HffwdzoZIq0s9FoOd6E7y4flezQ0ursY05RQgqOFU7EudCm5pa8sj%2FVYp4FtpK0X%2BWxIfNjbcVSq%2BqbuoqPFPd1QZ8aMjtk7rsTnQL%2FlPmfHpjpHmbtFe6xQ7V1cPOv0V%2FM6Chb34JsF6dfAM23rpCDYJeXDbOmzRpXn1AU6TjMG6CetEsnd20sSAHmAcpPk3hVEi9trThO9QeAHcRXy6mOUE19lmCL5qi%2FAQqlSPnmTxszQ0BVL6GC9lBBmg4IhmxJ7b6jAlGWZq%2B%2F3fSM13waiLnm6iiENiwDAnHq%2F8aKoLCtHvAbCMVNnOwI8Ex3SfAMwz6wVQejpKy8G1DJf3owxdESoIDfWxBPQmGDOEhvJTQDe8jOETgzadoCPzVxAjNN2dKvP4qyzB1SuwWev7shVkwlY9Ap7zE1PzxCxFf5cO851NmtrL7xm1grvRpqqgUVXIu%2FJ3tFHv58igBIAa%2FHAwYfBUbz1FXib2fCi2yrOjnwowzYek%2FBshWEl2MjD43EC3AYlZ9ro14la6yzKWAjdIG2jxyGj2JcPSI9oyu2qgqtuSOV1FM2TqB244fc8eq7rzR%2BAPvWqxSBe04NLAIkhbbjwUuTNSG0CpiLydK4XfCPvh6Zz3ZaOZ2Rgln7edFEJG%2FRqOyUBpTIlxSaxezGW11dLY9dLLUbFM2epNlYW0t9p4GqcHloLYOuxp9Rp5MrRd6ztwYWj9cFGwQdNKTTI3DsJ4OiP%2F%2F4P76FKBw%3D%3D";
        //String str = "phone%2CscoreSource%2CmarkNumbers%2CcityId%2Caddr%2Clng%2ChasGroup%2CsubwayStationId%2Ccates%2CfrontImg%2CchooseSitting%2Cwifi%2CavgPrice%2Cstyle%2CfeatureMenus%2CavgScore%2Cname%2CparkingInfo%2Clat%2CcateId%2Cintroduction%2CshowType%2CareaId%2CdistrictId%2Cpreferent%2ClowestPrice%2CcateName%2CareaName%2CzlSourceType%2CcampaignTag%2CmallName%2CmallId%2CbrandId%2CbrandName%2CbrandLogo%2CbrandStory%2CsmPromotion%2Cktv%2Cgeo%2ChistoryCouponCount%2Crecommendation%2CiUrl%2CisQueuing%2CnewPayInfo%2CpayInfo%2CsourceType%2Cabstracts%2CgroupInfo%2CisSuperVoucher%2Cdiscount%2CisWaimai%2CcollectionDeals%2CnearPoi%2Csparkle%2CtopicList%2CcityIds%2CshowChannel%2CshowStatus";
        String str = "https://ihotel.meituan.com/productapi/v3/prepayList?openId=oJVP50BVFOsvCJnNxKrI63rqfGPY&antiRepPlatform=Android&programName=mt&utm_medium=WEIXINPROGRAM&openIdCipher=AwQAAABJAgAAAAEAAAAyAAAAPLgC95WH3MyqngAoyM%2Fhf1hEoKrGdo0pJ5DI44e1wGF9AT3PH7Wes03actC2n%2FGVnwfURonD78PewMUppAAAADhIoYKtW%2FMi1gkaVUrDXnRACW2ahT8%2BS7tIkYkJzUa46x%2BrzImN97j0ms0fcn4aFfBu614aoWJMHA%3D%3D&utm_campaign=entry%253DMTLive_scene%253D1089&token=BZxlPDimpT0h5C9ueFO_CGxjKZoAAAAADA4AALgRXxCM759qIZMi-eMjb40saTvsRdYIIrSlfM5mxlH38gz-Mu1ECbXgZlvSTKLP5w&usertoken=BZxlPDimpT0h5C9ueFO_CGxjKZoAAAAADA4AALgRXxCM759qIZMi-eMjb40saTvsRdYIIrSlfM5mxlH38gz-Mu1ECbXgZlvSTKLP5w&userId=714621274&userid=714621274&uuid=17a843d164014-20726b37ee73c-0-0-17a843d164112&start=1625702400000&end=1625788800000&poiId=150011362&flagshipFilter=1&type=1&antiRepCityId=57&antiRepLocateCityId=206&lat=30.906572&lng=118.707568&wechatVersion=8.0.3&SDKVersion=2.17.0&version_name=11.2.200";
        System.out.println(getURLEncoderString(str));
        System.out.println(getURLDecoderString(str));

    }

}
