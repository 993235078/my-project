package com.example.meituan.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 14:35
 **/
@Data
public class QueryHotelInfoVo {

    @JSONField(name = "utm_medium")
    private String utmMedium = "touch";

    @JSONField(name = "version_name")
    private Double versionName = 999.9;

    @JSONField(name = "platformid")
    private Integer platformId = 1;

    private String start;

    private String end;

    //@JSONField(name = "mypos")
    //private String myPos;

    //private String lat;

    //private String lng;

    //private Integer gpsCityId;

    //private Integer cityId;

    private Integer subtype = 0;

    private Integer type = 1;

    //private Integer isRecommend = 0;

    //private Integer recType = 0;

    //private Integer isLocal = 1;

    private Integer entryType = 2;

    private String fields = "phone,scoreSource,markNumbers,cityId,addr,lng,hasGroup,subwayStationId,cates,frontImg,chooseSitting,wifi,avgPrice,style,featureMenus,avgScore,name,parkingInfo,lat,cateId,introduction,showType,areaId,districtId,preferent,lowestPrice,cateName,areaName,zlSourceType,campaignTag,mallName,mallId,brandId,brandName,brandLogo,brandStory,smPromotion,ktv,geo,historyCouponCount,recommendation,iUrl,isQueuing,newPayInfo,payInfo,sourceType,abstracts,groupInfo,isSuperVoucher,discount,isWaimai,collectionDeals,nearPoi,sparkle,topicList,cityIds,showChannel,showStatus";

    @JSONField(name = "_token")
    private String token;

    @Override
    public String toString() {
        return "utm_medium=" + this.getUtmMedium() + ", version_name=" + this.getVersionName() + ", platformid=" + this.getPlatformId() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ", subtype=" + this.getSubtype() + ", type=" + this.getType() + ", entryType=" + this.getEntryType() + ", fields=" + this.getFields() + ")";
    }
}
