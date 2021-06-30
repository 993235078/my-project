package com.example.meituan;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.meituan.forest.HotelService;
import com.example.meituan.util.MtTokenUtils;
import com.example.meituan.vo.QueryHotelInfoVo;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.QueryReviewListVo;
import com.example.meituan.vo.hotelinfo.HotelInfoBase;
import com.example.meituan.vo.review.ReviewBase;
import com.example.meituan.vo.review.ReviewResult;
import com.example.meituan.vo.roomtype.RoomTypeResponseBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class MeituanApplicationTests {

    @Resource
    private HotelService hotelService;

    @Test
    void contextLoads() {
        /*List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(RandomStringUtils.getString(10, RandomStringUtils.DIGITAL));
        }

        List<String> collect = list.stream().map(poi -> {
            AtomicReference<String> re = new AtomicReference<>();
            QueryHotelRoomTypeVo queryHotelRoomTypeVo = getQueryHotelRoomTypeVo(poi);
            hotelService.hotelRoomTypeList(poi, queryHotelRoomTypeVo, (result, request, response) -> {
                System.out.println("请求结果为：");
                System.out.println(result);
                re.set(result);
            }, (error, request, response) -> {
                System.out.println("请求失败：");
                System.out.println(error.toString());
                re.set(error.getMessage());
            });
            return re.get();
        }).collect(Collectors.toList());
        System.out.println("最终转换后的结果");
        System.out.println(collect.size());*/


            String poi = "998015510";//1562474580
            QueryHotelRoomTypeVo queryHotelRoomTypeVo = getQueryHotelRoomTypeVo(poi);
            String baseDataResponseBase = hotelService.hotelRoomTypeList(poi, queryHotelRoomTypeVo, (result, request, response) -> {
                System.out.println("请求结果为：");
                System.out.println(result);
            }, (error, request, response) -> {
                System.out.println("请求失败：");
                System.out.println(error.toString());
            });
            System.out.println("返回解析的结果为：");
            RoomTypeResponseBase roomTypeResponseBase = JSON.parseObject(baseDataResponseBase, new TypeReference<RoomTypeResponseBase>() {
            });
            System.out.println(roomTypeResponseBase);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    @Test
    void testHotelInfo() {

        String poi = "998015510";//1562474580
        QueryHotelInfoVo queryHotelInfoVo = new QueryHotelInfoVo();
        queryHotelInfoVo.setStart("1625155200000");
        queryHotelInfoVo.setEnd("1625241600000");
        MtTokenUtils<QueryHotelInfoVo> mtTokenUtils = new MtTokenUtils<>();
        String token = mtTokenUtils.getMtTokenV2(queryHotelInfoVo);
        queryHotelInfoVo.setToken(token);

        String baseDataResponseBase = hotelService.hotelInfo(poi, queryHotelInfoVo, (result, request, response) -> {
            System.out.println("请求结果为：");
            System.out.println(result);
        }, (error, request, response) -> {
            System.out.println("请求失败：");
            System.out.println(error.toString());
        });
        System.out.println("返回解析的结果为：");
        HotelInfoBase hotelInfoBase = JSON.parseObject(baseDataResponseBase, new TypeReference<HotelInfoBase>() {
        });
        System.out.println(hotelInfoBase);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Test
    void testHotelReviewList() {

        String poi = "998015510";//1562474580
        QueryReviewListVo queryReviewListVo = new QueryReviewListVo();
        queryReviewListVo.setReferId(poi);

        String baseDataResponseBase = hotelService.reviewList(queryReviewListVo, (result, request, response) -> {
            System.out.println("请求结果为：");
            System.out.println(result);
        }, (error, request, response) -> {
            System.out.println("请求失败：");
            System.out.println(error.toString());
        });
        System.out.println("返回解析的结果为：");
        //todo 这里的解析还有点问题
        ReviewResult<ReviewBase> reviewResult = JSON.parseObject(baseDataResponseBase, new TypeReference<ReviewResult<ReviewBase>>() {
        });
        System.out.println(reviewResult);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    private QueryHotelRoomTypeVo getQueryHotelRoomTypeVo(String poi) {
        QueryHotelRoomTypeVo queryHotelRoomTypeVo = new QueryHotelRoomTypeVo();
        queryHotelRoomTypeVo.setStart("1625155200000");
        queryHotelRoomTypeVo.setEnd("1625241600000");
        queryHotelRoomTypeVo.setPoi(poi);
        //queryHotelRoomTypeVo.setUuid("c26d86a0e2b9430bb230.1624427616.1.0.0");//c26d86a0e2b9430bb230.1624427616.1.0.0
        //queryHotelRoomTypeVo.setIuUid("AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E");//AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E
        //queryHotelRoomTypeVo.setUserid("3332885018");//3332885018
        MtTokenUtils<QueryHotelRoomTypeVo> mtTokenUtils = new MtTokenUtils<>();
        String token = mtTokenUtils.getMtTokenV2(queryHotelRoomTypeVo);
        queryHotelRoomTypeVo.setToken(token);
        return queryHotelRoomTypeVo;
    }

}
