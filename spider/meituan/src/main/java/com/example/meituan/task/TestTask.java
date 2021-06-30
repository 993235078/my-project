package com.example.meituan.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.meituan.forest.HotelService;
import com.example.meituan.util.MtTokenUtils;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.roomtype.RoomTypeResponseBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
@Async
public class TestTask {


    @Resource
    private HotelService hotelService;


    @Scheduled(cron = "0 0/1 * * * ?")
    public void t1() {
        String poi = "4764214";
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
    }


    private QueryHotelRoomTypeVo getQueryHotelRoomTypeVo(String poi) {
        QueryHotelRoomTypeVo queryHotelRoomTypeVo = new QueryHotelRoomTypeVo();
        queryHotelRoomTypeVo.setStart("1624492800000");
        queryHotelRoomTypeVo.setEnd("1624579200000");
        queryHotelRoomTypeVo.setGpsCityId(57);
        queryHotelRoomTypeVo.setCityId(57);
        queryHotelRoomTypeVo.setPoi(poi);
        queryHotelRoomTypeVo.setUuid("c26d86a0e2b9430bb230.1624427616.1.0.0");
        queryHotelRoomTypeVo.setIuUid("AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E");
        queryHotelRoomTypeVo.setUserid("3332885018");
        queryHotelRoomTypeVo.setToken(MtTokenUtils.getMtToken(poi, "1624492800000", "1624579200000"));
        return queryHotelRoomTypeVo;
    }
}
