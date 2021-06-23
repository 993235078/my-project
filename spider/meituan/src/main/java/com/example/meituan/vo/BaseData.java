package com.example.meituan.vo;

import java.util.List;
import lombok.Data;
@Data
public  class BaseData{
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