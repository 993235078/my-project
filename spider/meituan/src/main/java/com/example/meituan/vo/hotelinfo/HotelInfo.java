package com.example.meituan.vo.hotelinfo;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 14:57
 */
@Data
public class HotelInfo {


    /**
     * poiid : 998015510
     * shopuuid : null
     * appletInfo : {"appletId":"gh_870576f3c6f9","appletPoiUrl":"hotel/pages/poi/poi?poiId=998015510&propagateData=AwMAAAA5AgAAAAEAAAAgAAAALCnTSX2T66ywqEUMEJ0glI3lY7wTzBt/TfsedGEJ65CIPkptd0CyF0vSsdj+AAAAg1lYATKIvcPWPSgr0CksJdZdMkMFTQiP52xUH61hjUhMuOwBzEggeMpmRPmSEbTVJRzN9Kb8r7Lv2/fidT5yXrm7uIo/JOQJ2ILkX1aZruBjVXcO8kj5YatjLiVxSzvnVHDzpIhwsW+zaNM+mTyJM9fh9ZL0CE/xml3RmF/7WW4iPsUd"}
     * videoUrl :
     * cityId : 57
     * addr : 洪山区珞喻路630号华乐商务中心4楼（光谷银座斜对面，邮科院天桥旁）
     * lng : 114.392528
     * hasGroup : false
     * subwayStationId : 945
     * cates : 20,20606,20769,21019,79,20607
     * frontImg : http://p0.meituan.net/w.h/tdchotel/8ce8ebf708fe31e39c5180c4cd02ee603261792.jpg
     * wifi : true
     * areaId : 1006
     * discount :
     * groupInfo : 0
     * avgPrice : 0
     * lowestPrice : 0
     * style :
     * brandId : 0
     * brandName :
     * brandLogo :
     * brandStory :
     * name : 优程半岛酒店(光谷广场店)
     * parkingInfo :
     * lat : 30.509604
     * introduction : 本酒店位于武汉市洪山区光谷广场， 珞瑜路华乐山庄商务中心4楼（光谷广场-地铁站T出口鲁巷购物中心西边500米），交通十分方便，楼下就是公交车站，多路公交车从此经过，步行几分钟就是地铁2号线光谷广场站，旁边就是光谷步行街，国际广场，鲁巷广场，世界城，是购物消费、餐饮娱乐、旅游观光、休闲健身的好去处。房间配置独立卫生间，中央空调，新风系统，集中式热水，无线WIFI+有线网络，高清投影机。是您出差，旅游，情侣约会的理想选择！
     经过一座城，寻觅一间房，消去您满身的疲劳，我们将以热情的服务，舒适的房间，期待您的到来。
     * showType : hotel
     * areaName : 光谷/鲁巷
     * historyCouponCount : 0
     * highHotelStar : false
     * hotelStar : 经济型
     * starExplain : 经济型酒店，酒店可提供基础的设施及服务
     * hotelType : null
     * bizloginid : 1
     * yufuListShowType : 0
     * interceptType : 2
     * interceptHours : 24
     * poiThirdCallNumber : []
     * phone : 19947684485
     * phoneList : [{"name":"酒店电话","phone":"19947684485"}]
     * poiLastOrderTime : 40分钟前有人预订
     * shortOrderTime : 最新预订：40分钟前
     * useRuleIdentity : 请携带入住人身份证，凭姓名和预订手机号直接办理入住
     * useRuleTime : 入住时间: 14:00以后  离店时间: 12:00之前
     * complaintEntrance : {"imgUrl":"https://p1.meituan.net/travelcube/f5ec8681f1436dbf3bf7d23dc2ff802f768.png","text":"工商投诉信息","showEntrance":false,"entranceUrl":""}
     * imageCount : 257
     * iconVoList : null
     * markNumbers : 2195
     * avgScore : 4.6
     * scoreIntro : 4.6 好
     * scoreText : 高于53%同类酒店
     * sourceType : 3
     * zlSourceType : 1
     * hasPackage : false
     * isRoomListAggregated : false
     * isAggregateWithoutDeal : false
     * poiAttrTagList : ["近地铁","停车场"]
     * fodderInfo : []
     * praiseText : 各种住宿设施齐全
     * posdec : 光谷/鲁巷
     * recommendPoiFloatingTitle : {"status":1,"content":""}
     * sceneId : 0
     * extInfo : {"showImEntrance":true,"imTitle":"问酒店","imIcon":"https://p0.meituan.net/ingee/7dafc6cde1685979887c207ce716b7db3353.png","imEntranceUrl":""}
     * positionDescList : [{"iconUrl":"https://p1.meituan.net/travelcube/0e8bf65b542a5a4d21f7f78f69c6125d1095.png@36w_36h_80q","text":"距光谷广场地铁站-F口直线500米,步行700米,约9分钟","textWithSourceMsg":null}]
     * routeLink : imeituan://www.meituan.com/mapchannel/poi/detail?mapsource=hotel&overseas=0&poi_id=998015510&latitude=30.509604&longitude=114.392528&coordtype=0&start_name=光谷广场地铁站-F口&start_latitude=30.505759&start_longitude=114.395703&mode=walking&routeplanning=0
     * addrWithoutAdministrativeArea : 珞喻路630号华乐商务中心4楼(光谷银座斜对面,邮科院天桥旁)
     * poiStatusDetail : {"text":null,"nextIcon":null,"status":0}
     * fullAreaName : 武汉 珞喻路630号华乐商务中心4楼(光谷银座斜对面,邮科院天桥旁)
     * packageInfoList : null
     * superLuxuryIcon : null
     * roomDetailInfo : null
     */

    private String poiid;
    private Object shopuuid;
    private AppletInfoBean appletInfo;
    private String videoUrl;
    private int cityId;
    private String addr;
    private double lng;
    private boolean hasGroup;
    private String subwayStationId;
    private String cates;
    private String frontImg;
    private boolean wifi;
    private int areaId;
    private String discount;
    private int groupInfo;
    private int avgPrice;
    private int lowestPrice;
    private String style;
    private int brandId;
    private String brandName;
    private String brandLogo;
    private String brandStory;
    private String name;
    private String parkingInfo;
    private double lat;
    private String introduction;
    private String showType;
    private String areaName;
    private int historyCouponCount;
    private boolean highHotelStar;
    private String hotelStar;
    private String starExplain;
    private Object hotelType;
    private int bizloginid;
    private int yufuListShowType;
    private int interceptType;
    private int interceptHours;
    private String phone;
    private String poiLastOrderTime;
    private String shortOrderTime;
    private String useRuleIdentity;
    private String useRuleTime;
    private ComplaintEntranceBean complaintEntrance;
    private int imageCount;
    private Object iconVoList;
    private int markNumbers;
    private double avgScore;
    private String scoreIntro;
    private String scoreText;
    private int sourceType;
    private int zlSourceType;
    private boolean hasPackage;
    private boolean isRoomListAggregated;
    private boolean isAggregateWithoutDeal;
    private String praiseText;
    private String posdec;
    private RecommendPoiFloatingTitleBean recommendPoiFloatingTitle;
    private int sceneId;
    private ExtInfoBean extInfo;
    private String routeLink;
    private String addrWithoutAdministrativeArea;
    private PoiStatusDetailBean poiStatusDetail;
    private String fullAreaName;
    private Object packageInfoList;
    private Object superLuxuryIcon;
    private Object roomDetailInfo;
    private List<?> poiThirdCallNumber;
    private List<PhoneListBean> phoneList;
    private List<String> poiAttrTagList;
    private List<?> fodderInfo;
    private List<PositionDescListBean> positionDescList;

}
