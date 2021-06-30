package com.example.meituan.vo.review;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:34
 */
@Data
public class FromUserBean {

    /**
     * Avatar : null
     * LUserId : null
     * Pendants : null
     * ProfileUrl : null
     * Source : null
     * UserIconType : null
     * UserId : null
     * UserLevel : null
     * UserName : 商家回应
     * UserTags : null
     * pendantList : null
     * <p>
     * {
     * "Avatar": "http://p1.meituan.net/mmc/e663563d638f3f2c56274e28ac949a143761.png%40120w_120h_0e_1l%7Cwatermark%3D0",
     * "LUserId": 646917923,
     * "Pendants": null,
     * "ProfileUrl": "imeituan://www.meituan.com/userreview/?uid=646917923",
     * "Source": null,
     * "UserIconType": null,
     * "UserId": null,
     * "UserLevel": null,
     * "UserName": "law709215521",
     * "UserTags": [
     * "http://www.dpfile.com/gp/cms/1464933834962.png"
     * ],
     * "pendantList": null
     * }
     */

    private String Avatar;
    private String LUserId;
    private Object Pendants;
    private String ProfileUrl;
    private Object Source;
    private Object UserIconType;
    private String UserId;
    private Object UserLevel;
    private String UserName;
    private List<String> UserTags;
    private Object pendantList;


}
