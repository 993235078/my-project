package com.example.meituan.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 17:15
 */
@Data
public class PreCreateOrderVo {

    private String fingerprint;

    @JSONField(name = "poi_id")
    private String poiId;

    @JSONField(name = "goods_id")
    private String goodsId;

    @JSONField(name = "biz_type")
    private Integer bizType;

    @JSONField(name = "check_in_time")
    private String checkInTime;

    @JSONField(name = "check_out_time")
    private String checkOutTime;

    @JSONField(name = "number_of_rooms")
    private Integer numberOfRooms;

    @JSONField(name = "preview_price")
    private Integer previewPrice;

    private String userId;

    @JSONField(name = "_token")
    private String token;


    @Override
    public String toString() {
        return "fingerprint=" + this.getFingerprint() + "&poi_id=" + this.getPoiId() + "&goods_id=" + this.getGoodsId() + "&biz_type=" + this.getBizType() + "&check_in_time=" + this.getCheckInTime() + "&check_out_time=" + this.getCheckOutTime() + "&number_of_rooms=" + this.getNumberOfRooms() + "&preview_price=" + this.getPreviewPrice() + "&userId=" + this.getUserId() + ")";
    }
}
