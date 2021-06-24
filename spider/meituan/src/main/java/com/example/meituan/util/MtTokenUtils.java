package com.example.meituan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public class MtTokenUtils {

    public static String getMtToken(String poiId, String start, String end) {
        String dataForSign = "\"cityId=57&" +
                "end=" + end + "&" +
                "gpsCityId=57&" +
                "iuuid=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E&" +
                "lat=30.492384&" +
                "lng=114.4026&" +
                "poi=" + poiId + "&" +
                "roomCount=&" +
                "start=" + start + "&" +
                "type=1&" +
                "userid=3332885018&" +
                "uuid=c26d86a0e2b9430bb230.1624427616.1.0.0\"";
        String sign = compressData(dataForSign);
        String data = "{\"rId\":100004,\"ver\":\"1.0.6\",\"brVD\":[1920,211],\"brR\":[[1920,1080],[1920,1040],24,24],\"bI\":[\"https://i.meituan.com/awp/h5/hotel\",\"\"],\"mT\":[],\"kT\":[],\"aT\":[],\"tT\":[],\"aM\":\"\"}";
        JSONObject jsonObject = JSON.parseObject(data);
        jsonObject.put("ts", System.currentTimeMillis());
        jsonObject.put("cts", System.currentTimeMillis() + 10000);
        jsonObject.put("sign", sign);
        return compressData(jsonObject.toJSONString());
    }

    /**
     * zlib压缩+base64
     */
    public static String compressData(String data) {
        ByteArrayOutputStream bos;
        DeflaterOutputStream zos;
        try {
            bos = new ByteArrayOutputStream();
            zos = new DeflaterOutputStream(bos);
            zos.write(data.getBytes());
            zos.close();
            return new String(Base64.encodeBase64(bos.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * zlib解压+base64
     */
    public static String decompressData(String encdata) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            InflaterOutputStream zos = new InflaterOutputStream(bos);
            byte[] bytes = Base64.decodeBase64(encdata.getBytes());
            zos.write(bytes);
            zos.close();
            return bos.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
