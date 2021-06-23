package com.example.meituan.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author Irvin
 * @description
 * @date 2021/6/23 11:08
 */
@Data
public class QueryHotelRoomTypeVo {

    @JSONField(name = "utm_medium")
    private String utmMedium = "touch";

    @JSONField(name = "version_name")
    private Double versionName = 999.9;

    @JSONField(name = "platformid")
    private Integer platformId = 1;

    private String start;

    private String end;

    private Integer type = 1;

    private Integer gpsCityId;

    private Integer cityId;

    private String poi;

    private String uuid;

    @JSONField(name = "iuuid")
    private String iuUid;

    private String userid;

    @JSONField(name = "_token")
    private String token;

}
