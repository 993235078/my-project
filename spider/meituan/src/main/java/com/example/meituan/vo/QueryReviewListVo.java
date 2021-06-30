package com.example.meituan.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:10
 */
@Data
public class QueryReviewListVo {

    @JSONField(name = "utm_medium")
    private String utmMedium = "touch";

    @JSONField(name = "version_name")
    private Double versionName = 999.9;

    @JSONField(name = "querytype")
    private Integer queryType = 1;

    private Integer start = 0;

    private Integer limit = 20;

    @JSONField(name = "filterid")
    private Integer filterId = 800;

    @JSONField(name = "referid")
    private String referId;
}
