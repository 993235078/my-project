package com.example.meituan.vo.review;

import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:28
 */
@Data
public class CommentsBean {


    /**
     * CommentTime : 6月21日
     * Content : 非常感谢您选择我们并对优程半岛给予支持与厚爱。您对酒店设施及服务满意是酒店全体员工工作的动力，让每位宾客都能感受到宾至如归的感觉是我们服务的最终目标，酒店客房温馨的布置，并配有免费投影电视是您外出旅行的最佳选择，为您服务是我们的荣幸，优程半岛全体员工期待您的下次光临，祝您心想事成、好运连绵
     * FromUser : {"Avatar":null,"LUserId":null,"Pendants":null,"ProfileUrl":null,"Source":null,"UserIconType":null,"UserId":null,"UserLevel":null,"UserName":"商家回应","UserTags":null,"pendantList":null}
     * NoteId : null
     * NoteType : 0
     * ToUser : null
     * commentPicList : null
     */

    private String CommentTime;
    private String Content;
    private FromUserBean FromUser;
    private Object NoteId;
    private int NoteType;
    private Object ToUser;
    private Object commentPicList;

}
