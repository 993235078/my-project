package com.example.meituan.vo.roomtype;

import lombok.Data;

import java.util.List;
@Data
public class RoomTypeBaseData {
	private List<RoomType> result;
	private String traceId;
	private boolean highRateStarHotel;
	private int yufuListStatus;
	private List<Object> tonightSpecialGoodsList;
	private int kuaidingShowSize;
	private int showType;
	private String stid;
	private boolean kuaidingIsFirst;
	private boolean showImg;
}