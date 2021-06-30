package com.example.meituan;

import com.example.meituan.util.MtTokenUtils;
import com.example.meituan.vo.PreCreateOrderVo;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/6/30 17:18
 */
public class T2 {

    public static void main(String[] args) {
        PreCreateOrderVo preCreateOrderVo = new PreCreateOrderVo();
        preCreateOrderVo.setPoiId("998015510");
        preCreateOrderVo.setGoodsId("616512747");
        preCreateOrderVo.setBizType(1);
        preCreateOrderVo.setCheckInTime("2021-06-30T00:00:00");
        preCreateOrderVo.setCheckOutTime("2021-07-03T00:00:00");
        preCreateOrderVo.setNumberOfRooms(1);
        preCreateOrderVo.setPreviewPrice(11400);
        preCreateOrderVo.setUserId("3332885018");

        MtTokenUtils<PreCreateOrderVo> mtTokenUtils = new MtTokenUtils<>();
        String mtTokenV2 = mtTokenUtils.getMtTokenV2(preCreateOrderVo);
        System.out.println(mtTokenV2);
        preCreateOrderVo.setToken(mtTokenV2);


    }

}
