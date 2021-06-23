package com.example.meituan.forest;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.callback.OnError;
import com.dtflys.forest.callback.OnSuccess;
import com.example.meituan.vo.QueryHotelRoomTypeVo;

/**
 * @author Irvin
 * @description
 * @date 2021/6/23 11:00
 */
@BaseRequest(
        baseURL = "https://ihotel.meituan.com/group/v1",     // 默认域名
        headers = {
                "Accept:application/json",                // 默认请求头
                "Cookie:_lxsdk_cuid=179cc0b3b6ac8-012235f9b21a67-37607201-1fa400-179cc0b3b6ac8; ci=57; rvct=57; uuid=57b0f31f937f454ca1dc.1623930666.1.0.0; iuuid=B228B62271DEE8B3D8F833818942A80CFC59853953D99A0920352FF2F921997F; cityname=%E6%AD%A6%E6%B1%89; _lxsdk=B228B62271DEE8B3D8F833818942A80CFC59853953D99A0920352FF2F921997F; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; IJSESSIONID=node0sfjg8a9m01713h15cxqrq6km11096400; mtcdn=K; lt=70sGmzbWju9iBussX7KP53iWNj0AAAAAyQ0AACRoJ_CgY584s6azmriJfBk5mnHkPaNQL9hS9iwuAC2w8923wROwDWsyhCl7Y0jSJg; u=714621274; n=%E8%89%BE%E6%96%87%E5%A5%BD%E9%A5%BF; token2=70sGmzbWju9iBussX7KP53iWNj0AAAAAyQ0AACRoJ_CgY584s6azmriJfBk5mnHkPaNQL9hS9iwuAC2w8923wROwDWsyhCl7Y0jSJg; isid=70sGmzbWju9iBussX7KP53iWNj0AAAAAyQ0AACRoJ_CgY584s6azmriJfBk5mnHkPaNQL9hS9iwuAC2w8923wROwDWsyhCl7Y0jSJg; oops=70sGmzbWju9iBussX7KP53iWNj0AAAAAyQ0AACRoJ_CgY584s6azmriJfBk5mnHkPaNQL9hS9iwuAC2w8923wROwDWsyhCl7Y0jSJg; mt_c_token=70sGmzbWju9iBussX7KP53iWNj0AAAAAyQ0AACRoJ_CgY584s6azmriJfBk5mnHkPaNQL9hS9iwuAC2w8923wROwDWsyhCl7Y0jSJg; logintype=normal; unc=%E8%89%BE%E6%96%87%E5%A5%BD%E9%A5%BF; firstTime=1624268094755; i_extend=E336323381796252832799927227251119238993_c0_e6128103971842252638_a%e6%bd%ae%e6%bc%ab%e9%85%92%e5%ba%97null_b300200_o1_dhotelpoitagb_k1002; _lxsdk_s=17a2deb8039-b75-d35-421%7C%7C36"
        }
)
public interface HotelService {

    @Get(
            url = "/yf/list/${0}?",
            async = true
    )
    void hotelRoomTypeList(String poi, @Query QueryHotelRoomTypeVo queryHotelRoomTypeVo, OnSuccess<String> onSuccess, OnError onError);

}
