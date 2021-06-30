package com.example.meituan.vo.review;

import lombok.Data;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 15:22
 */
@Data
public class ReviewResult<T> {

    private String message;

    private Integer status;

    private T data;
}
