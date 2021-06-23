package com.example.meituan.forest;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.callback.OnError;
import com.dtflys.forest.callback.OnSuccess;
import com.example.meituan.vo.BaseData;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.ResponseBase;
import com.example.meituan.vo.RoomType;

/**
 * @author Irvin
 * @description
 * @date 2021/6/23 11:00
 */
@BaseRequest(
        baseURL = "https://ihotel.meituan.com/group/v1",     // 默认域名
        headers = {
                "Accept:application/json",                // 默认请求头
                "Cookie:uuid=c26d86a0e2b9430bb230.1624427616.1.0.0; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; _lxsdk_cuid=17a376e655ac8-05ef91f27b3217-4373266-1fa400-17a376e655ac8; mtcdn=K; IJSESSIONID=node01gokn4a82y61njkr8eo0870i416091377; iuuid=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E; latlng=30.492384%2C114.4026%2C1624428843080; ci=57; cityname=%E6%AD%A6%E6%B1%89; _lxsdk=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E; backurl=https://i.meituan.com/awp/h5/hotel/poi/deal.html?poiId=165507099&cityId=57&startTime=1624406400000&endTime=1624492800000&ct_poi=222711304092285550174151485540579268684_c0_e8626614608275057396_anull_o1_dhotelpoitagb_k1002&type=1&zlFlag=true; token=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; mt_c_token=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; oops=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; userId=3332885018; u=3332885018; isid=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; i_extend=E060462007998658031719182109088412662593_c2_e16058623709898073739_anull_o1_dhotelpoitagb_k1002_v5630369827850636977; _lxsdk_s=17a379dfce4-5-368-946%7C%7C17"
        }
)
public interface HotelService {

    @Get(
            url = "/yf/list/${0}?"
            //async = true
            //dataType = "json"
    )
    String hotelRoomTypeList(String poi, @Query QueryHotelRoomTypeVo queryHotelRoomTypeVo
            , OnSuccess<String> onSuccess, OnError onError);

}
