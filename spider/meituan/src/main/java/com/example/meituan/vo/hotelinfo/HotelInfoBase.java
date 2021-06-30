package com.example.meituan.vo.hotelinfo;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 14:55
 **/
@Data
public class HotelInfoBase {

    private Integer count;

    private List<HotelInfo> data;

    private String serverResponseTime;
}
