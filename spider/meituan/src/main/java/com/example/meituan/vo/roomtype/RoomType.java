package com.example.meituan.vo.roomtype;

import lombok.Data;

import java.util.List;
@Data
public class RoomType{
	private String buyInfo;
	private int originalPrice;

	private int goodsId;
	private int cancelType;
	private int avgPrice;
	private boolean notDisplayCancelRule;



	private String cancelRule;
	private int regularPrice;
	private int fixedRemain;
	private int goodsSource;

	private String bookableTips;
	private String tmcTag;


	private String accessCode;
	private int tagType;
	private String useTime;
	private String campaignTag;

	private int invRemain;

	private String goodsName;
	private int confirmType;

	private boolean originPriceExposed;

	private int serialCheckinMinDays;
	private int noPersistent;

	private int tmcSpecialPrice;

	private int goodsStatusDesc;
	private String tagName;
	private int goodsType;

	private int goodsStatus;
	private int checkinDuration;
	private List<GoodsRoomModelsItem> goodsRoomModels;
	private int latestBookingDays;
	private int averagePrice;
	private String breakfast;

}