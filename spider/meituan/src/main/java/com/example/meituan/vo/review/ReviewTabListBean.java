package com.example.meituan.vo.review;

import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:31
 */
@Data
public class ReviewTabListBean {


    /**
     {
     "Count": 2194,
     "FilterId": 800,
     "Title": "全部(2194)"
     },
     {
     "Count": 351,
     "FilterId": 1000,
     "Title": "晒图(351)"
     },
     {
     "Count": 152,
     "FilterId": 600,
     "Title": "低分(152)"
     },
     {
     "Count": 0,
     "FilterId": 300,
     "Title": "最新"
     }
     */

    private int Count;
    private int FilterId;
    private String Title;

}
