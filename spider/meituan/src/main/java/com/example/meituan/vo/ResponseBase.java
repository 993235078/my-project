package com.example.meituan.vo;

import java.util.List;
import lombok.Data;

@Data
public class ResponseBase{
	private String statusMsg;
	private BaseData data;
	private int statusCode;
}