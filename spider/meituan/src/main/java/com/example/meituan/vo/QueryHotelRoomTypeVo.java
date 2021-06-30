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


        /*String dataForSign = "\"cityId=57&" +
            "end=" + end + "&" +
            "gpsCityId=57&" +
            "iuuid=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E&" +
            "lat=30.492384&" +
            "lng=114.4026&" +
            "poi=" + poiId + "&" +
            "roomCount=&" +
            "start=" + start + "&" +
            "type=1&" +
            "userid=3332885018&" +
            "uuid=c26d86a0e2b9430bb230.1624427616.1.0.0\"";*/

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

    private String uuid = "c26d86a0e2b9430bb230.1624427616.1.0.0";

    @JSONField(name = "iuuid")
    private String iuUid = "AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E";

    private String userid = "3332885018";

    @JSONField(name = "_token")
    private String token;


    @Override
    public String toString() {
        return "utm_medium=" + this.getUtmMedium() + "&version_name=" + this.getVersionName() + "&platformid=" + this.getPlatformId() + "&start=" + this.getStart() + "&end=" + this.getEnd() + "&type=" + this.getType() + "&gpsCityId=" + this.getGpsCityId() + "&cityId=" + this.getCityId() + "&poi=" + this.getPoi() + "&uuid=" + this.getUuid() + "&iuuid=" + this.getIuUid() + "&userid=" + this.getUserid() + ")";
    }
}
