package com.example.meituan.vo.review;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:28
 */
@Data
public class ReviewInfo {

    /**
     * AbstractList : null
     * ActionNote : 打分
     * Anonymous : false
     * BottomInfo : 2021-06入住 , 2021-06-20发表
     * CommentCount : null
     * Comments : [{"CommentTime":"6月21日","Content":"非常感谢您选择我们并对优程半岛给予支持与厚爱。您对酒店设施及服务满意是酒店全体员工工作的动力，让每位宾客都能感受到宾至如归的感觉是我们服务的最终目标，酒店客房温馨的布置，并配有免费投影电视是您外出旅行的最佳选择，为您服务是我们的荣幸，优程半岛全体员工期待您的下次光临，祝您心想事成、好运连绵","FromUser":{"Avatar":null,"LUserId":null,"Pendants":null,"ProfileUrl":null,"Source":null,"UserIconType":null,"UserId":null,"UserLevel":null,"UserName":"商家回应","UserTags":null,"pendantList":null},"NoteId":null,"NoteType":0,"ToUser":null,"commentPicList":null}]
     * Content : 刚进房间的第一感觉就是，这次来这里真的是来对了，房间干净整洁，书桌和椅子的位置也很棒，最棒的是房间里还有一个投影，晚上投影效果真的很棒，老板人也很好，不吹不黑，这真的是我住过的性价比最高的酒店了。很值得大家过来尝试一下。#干净卫生##服务热情##性价比高#
     * DetailUrl : imeituan://www.meituan.com/feed/detail?id=2291443908&type=1&reviewtype=101
     * ExtraId : null
     * FeedExtraTag : null
     * FeedType : 1
     * FeedUser : {"Avatar":"http://p0.meituan.net/mmc/89bec9d64cde38d441cf976f751c482e3788.png%40120w_120h_0e_1l%7Cwatermark%3D0","LUserId":1949827140,"Pendants":null,"ProfileUrl":"imeituan://www.meituan.com/userreview/?uid=1949827140","Source":null,"UserIconType":null,"UserId":null,"UserLevel":null,"UserName":"EJo870661261","UserTags":["http://www.dpfile.com/gp/cms/1464933800333.png"],"pendantList":null}
     * Honour : http://www.dpfile.com/ugc/reviewhonour/highQualityReview.png
     * IsLike : false
     * Label0 : 特惠大床房[房型随机&月租1500起]
     * Label1 : null
     * LikeCount : 0
     * LikeUsers : null
     * MainId : 2291443908
     * ModifyTime : 1624198404746
     * Pictures : [{"BigUrl":"http://p0.meituan.net/shaitu/dd8a6cc6c91b5f3c8a7a24e0f73a64cc2213052.jpg%40700w_700h_0e_1l%7Cwatermark%3D0","MainId":null,"PicReportUrl":null,"SmallUrl":"http://p0.meituan.net/shaitu/dd8a6cc6c91b5f3c8a7a24e0f73a64cc2213052.jpg%40249w_249h_0e_1l%7Cwatermark%3D0","Title":null,"Type":1,"UploadTime":"2021-06-20"},{"BigUrl":"http://p0.meituan.net/shaitu/9c6c325cbb57ffdb198d00c2f5a249bf2709092.jpg%40700w_700h_0e_1l%7Cwatermark%3D0","MainId":null,"PicReportUrl":null,"SmallUrl":"http://p0.meituan.net/shaitu/9c6c325cbb57ffdb198d00c2f5a249bf2709092.jpg%40249w_249h_0e_1l%7Cwatermark%3D0","Title":null,"Type":1,"UploadTime":"2021-06-20"},{"BigUrl":"http://p0.meituan.net/shaitu/2e6944fd8fd45eefd7836847fb52c8aa1403828.jpg%40700w_700h_0e_1l%7Cwatermark%3D0","MainId":null,"PicReportUrl":null,"SmallUrl":"http://p0.meituan.net/shaitu/2e6944fd8fd45eefd7836847fb52c8aa1403828.jpg%40249w_249h_0e_1l%7Cwatermark%3D0","Title":null,"Type":1,"UploadTime":"2021-06-20"},{"BigUrl":"http://p0.meituan.net/shaitu/24ebf7ddf8dab988a4b64fd13e6c0f791482650.jpg%40700w_700h_0e_1l%7Cwatermark%3D0","MainId":null,"PicReportUrl":null,"SmallUrl":"http://p0.meituan.net/shaitu/24ebf7ddf8dab988a4b64fd13e6c0f791482650.jpg%40249w_249h_0e_1l%7Cwatermark%3D0","Title":null,"Type":1,"UploadTime":"2021-06-20"}]
     * Price : null
     * RecommendText : null
     * RecommendTextV2 : null
     * Recommends : null
     * ReportUrl : imeituan://www.meituan.com/reviewreport?extra_id=2291443908
     * ReviewCount : 0
     * ReviewType : 101
     * ScoreText : null
     * SourceIntro : null
     * SourceLogo : null
     * Star : 50
     * Time : 2021-06-20
     * TranslateContent : null
     * ViewCount : 7517
     * contentTitle : null
     * editUrl : null
     * feedPoi : null
     * platformType : 2
     * realRoomId : null
     * recommendInfoList : null
     * recommendSource : null
     * recommendTag : null
     * referType : 103
     * reviewAfterConsume : null
     * reviewId : 3193313934
     * roomTypeName : 特惠大床房[房型随机&月租1500起]
     * roomTypeUrl : null
     * share : null
     * shareTips : null
     * shareUrl : null
     * showLikeIcon : false
     * sourceName : null
     * sourceUrl : null
     * toReportUrl : null
     */

    private Object AbstractList;
    private String ActionNote;
    private boolean Anonymous;
    private String BottomInfo;
    private Object CommentCount;
    private String Content;
    private String DetailUrl;
    private Object ExtraId;
    private Object FeedExtraTag;
    private int FeedType;
    private FromUserBean FeedUser;
    private String Honour;
    private boolean IsLike;
    private String Label0;
    private String Label1;
    private int LikeCount;
    private Object LikeUsers;
    private String MainId;
    private long ModifyTime;
    private Object Price;
    private Object RecommendText;
    private Object RecommendTextV2;
    private Object Recommends;
    private String ReportUrl;
    private int ReviewCount;
    private int ReviewType;
    private Object ScoreText;
    private Object SourceIntro;
    private Object SourceLogo;
    private int Star;
    private String Time;
    private Object TranslateContent;
    private int ViewCount;
    private Object contentTitle;
    private Object editUrl;
    private Object feedPoi;
    private int platformType;
    private Object realRoomId;
    private Object recommendInfoList;
    private Object recommendSource;
    private Object recommendTag;
    private int referType;
    private Object reviewAfterConsume;
    private long reviewId;
    private String roomTypeName;
    private Object roomTypeUrl;
    private Object share;
    private Object shareTips;
    private Object shareUrl;
    private boolean showLikeIcon;
    private Object sourceName;
    private Object sourceUrl;
    private Object toReportUrl;
    private List<CommentsBean> Comments;
    private List<PicturesBean> Pictures;

}
