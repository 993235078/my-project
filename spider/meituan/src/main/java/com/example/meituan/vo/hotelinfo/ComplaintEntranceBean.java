package com.example.meituan.vo.hotelinfo;

import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:02
 **/
@Data
public class ComplaintEntranceBean {


    /**
     * imgUrl : https://p1.meituan.net/travelcube/f5ec8681f1436dbf3bf7d23dc2ff802f768.png
     * text : 工商投诉信息
     * showEntrance : false
     * entranceUrl :
     */

    private String imgUrl;
    private String text;
    private boolean showEntrance;
    private String entranceUrl;

}
