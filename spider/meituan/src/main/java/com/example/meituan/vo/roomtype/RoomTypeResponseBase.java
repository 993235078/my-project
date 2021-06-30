package com.example.meituan.vo.roomtype;

import lombok.Data;

@Data
public class RoomTypeResponseBase {
	private String statusMsg;
	private RoomTypeBaseData data;
	private int statusCode;
}