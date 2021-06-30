package com.example.meituan.vo.review;

import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:29
 */
@Data
public class PicturesBean {


    /**
     * BigUrl : http://p0.meituan.net/shaitu/dd8a6cc6c91b5f3c8a7a24e0f73a64cc2213052.jpg%40700w_700h_0e_1l%7Cwatermark%3D0
     * MainId : null
     * PicReportUrl : null
     * SmallUrl : http://p0.meituan.net/shaitu/dd8a6cc6c91b5f3c8a7a24e0f73a64cc2213052.jpg%40249w_249h_0e_1l%7Cwatermark%3D0
     * Title : null
     * Type : 1
     * UploadTime : 2021-06-20
     */

    private String BigUrl;
    private Object MainId;
    private Object PicReportUrl;
    private String SmallUrl;
    private Object Title;
    private int Type;
    private String UploadTime;


}
