package com.example.meituan.forest;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.callback.OnError;
import com.dtflys.forest.callback.OnSuccess;
import com.example.meituan.vo.QueryHotelInfoVo;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.QueryReviewListVo;

/**
 * @author Irvin
 * @description
 * @date 2021/6/23 11:00
 */
@BaseRequest(
        baseURL = "https://ihotel.meituan.com",     // 默认域名
        headers = {
                "Accept:application/json",                // 默认请求头
                "Cookie:uuid=c26d86a0e2b9430bb230.1624427616.1.0.0; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; _lxsdk_cuid=17a376e655ac8-05ef91f27b3217-4373266-1fa400-17a376e655ac8; mtcdn=K; iuuid=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E; latlng=30.492384%2C114.4026%2C1624428843080; ci=57; cityname=%E6%AD%A6%E6%B1%89; _lxsdk=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E; token=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; mt_c_token=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; userId=3332885018; isid=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; oops=pXHxP16E13kpWRMM8xLFn6Tw6ioAAAAA6g0AAJFw6xeCAa5cf31QHWf4Y6_6dqxpYatMuLlw3615aRMpY363OZDSIutfN1MxSWUsaw; u=3332885018; IJSESSIONID=node0tpuvark4xm421v1ulp3m6uuog18070328; i_extend=E213470211332519245184246092048487378487_c1_e6377560521149554879_a%e6%bd%ae%e6%bc%ab%e9%85%92%e5%ba%97%e5%85%89%e8%b0%b7null_o1_dhotelpoitagb_k1002_v5631502537259832128_b300200; _lxsdk_s=17a3c9ec84b-8a8-b45-e69%7C%7C16"
        }
)
public interface HotelService {

    /**
     * 查询酒店房型信息的接口
     *
     * @param poi                  酒店id
     * @param queryHotelRoomTypeVo 查询的数据对象
     * @param onSuccess            成功回调
     * @param onError              失败回调
     * @return java.lang.String
     * @Author Irvin
     * @Date 2021/6/30 14:44
     */
    @Get(
            url = "/group/v1/yf/list/${0}?"
            //async = true
            //dataType = "json"
    )
    String hotelRoomTypeList(String poi, @Query QueryHotelRoomTypeVo queryHotelRoomTypeVo
            , OnSuccess<String> onSuccess, OnError onError);


    /**
     * 查询酒店详情的接口
     *
     * @param poi              酒店id
     * @param queryHotelInfoVo 查询的数据对象
     * @param onSuccess        成功回调
     * @param onError          失败回调
     * @return java.lang.String
     * @Author Irvin
     * @Date 2021/6/30 14:43
     */
    @Get(
            url = "/group/v1/poi/${0}?"
            //async = true
            //dataType = "json"
    )
    String hotelInfo(String poi, @Query QueryHotelInfoVo queryHotelInfoVo
            , OnSuccess<String> onSuccess, OnError onError);


    /**
     * 查询酒店评论的接口
     *
     * @param queryReviewListVo 查询的数据对象
     * @param onSuccess 成功回调
     * @param onError 失败回调
     * @return java.lang.String
     * @Author Irvin
     * @Date 2021/6/30 15:09
    */
    @Get(
            url = "/api/v2/comments/biz/reviewList?"
            //async = true
            //dataType = "json"
    )
    String reviewList(@Query QueryReviewListVo queryReviewListVo
            , OnSuccess<String> onSuccess, OnError onError);


}
