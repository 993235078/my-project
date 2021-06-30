package com.example.meituan;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.meituan.util.URLUtils;
import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public class T {

    public static void main(String[] args) {
        //mt1();
        /*String dataForSign = "\"cityId=57&end=1624579200000&gpsCityId=57&iuuid=AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E&lat=30.492384&lng=114.4026&poi=4764214&roomCount=&start=1624492800000&type=1&userid=3332885018&uuid=c26d86a0e2b9430bb230.1624427616.1.0.0\"";
        String sign = compressData(dataForSign);
        String data = "{\"rId\":100004,\"ver\":\"1.0.6\",\"brVD\":[1920,211],\"brR\":[[1920,1080],[1920,1040],24,24],\"bI\":[\"https://i.meituan.com/awp/h5/hotel\",\"\"],\"mT\":[],\"kT\":[],\"aT\":[],\"tT\":[],\"aM\":\"\"}";
        JSONObject jsonObject = JSON.parseObject(data);
        jsonObject.put("ts", System.currentTimeMillis());
        jsonObject.put("cts", System.currentTimeMillis() + 10000);
        jsonObject.put("sign", sign);
        String token = compressData(jsonObject.toJSONString());
        System.out.println(token);*/
        //System.out.println(getMtToken("4764214", "1624492800000", "1624579200000"));
        String token = "eJyNU1tvozoQ/i9IyUujYhuMoVJ0RK4lN0IupMlqFTlAgIRbwZCEo/Pfj9Nut1VfdpE1nvnmwsx45l8hN1zhCQL+yS2h8nLhSYCP4FERWgIruEZBGMiQQKQg0BKcbxjhTofc7glPPwgGLSgh8POOLDjwQyK4pSjkZ+uTQzI/dwuDGwgBY1nxJIrhY+yFrKTJo5PGIr1kYoDFIGVeJGa5l9GbGCaud30MWBz9k6Wh4bY1TQUQYwiaTshuHMCk6aepW3BWgbKEiaJqzUNYr26Z14ZNJ/Ccs5G0ee6ypiL5XjB4R82S3WGMZKi8w5T3gfrePA8d7gu4cTPL04z6lHk9ymi7QToNhAKa7c/ejXMNSU/KKGqgLheyu9s7eJcMwzbtkpVy5I8r4zCLj26tN6Te/XCjNxeWU8cz3N9OCiQyrwICnpaqQqQC5bftW5VLRllZfP9z7tFo+F3NKRlW5nEWm/6r30CdKkOwV1/ixc7avKJYhyOd6hf8bJcje3QAX/Ny0uQjq8+/+J+B8Y51rd51Gi/D3fPmdEJaABzrW3E8CPMStsppUmQ05+yXiKTHB+1v5iANRZeX96cZKBjN2SqMvW8v7SXuB/rloR2256HaiMiEIFnF6r3dSFU0hImqQUg0WZEBBKqsKFDZO2DvaQRpElAVRZNlohFFlsieNhD2MCfqG9HuosoJbyYn5EN7uCsOxw9Rc+4i3R8kABCA+xTu3bdieUqM+of9ma8larL3Aa6jQUT9NstLT+ALFK/4AvH7/Oumv272IU/5IvPWFqGfcM4bXe1TBCv/pK+DSp0MtGsxiqVoiWfeeXROJ8yUh+vLtLuMrELP2MTaJDeRkP5Ucs7J7DrPSF29PiyKflnUeBTS8ZbEAQ6v8Xw2TtOF9azrybRv5Xp/q0nrZDGei0Yp672OZtRJ0Ins5ZSiy8aKF7DuTQpryNJSlqVpEq1G9mpgpA92f/DionXeyYsgxfogRdfuds2GG2DPnZAu3Enc7SgAG+ugMxsBayV21jvzNjnpNXy+Zr60O56d4UpyTzZ46Zj92+F5cYocOx/elpNxoZbzgi7AZkDPO2u4sVQFTDbKrqPLt/lWDXu1r/Uvxwcw5RGs+XFtj8wjlEL9KqGQ1IvDujgV9mp8HTovfWI/SBSadDIOJPP40HXJ4HSonZGix1Lx6pmaBm/XclrtNpVyiRMk2h2tMmdVoQ1LqJfFWJzg7FbZtA/xOM1zSTxiNlvZG2u7cGkvnRhsezmWU2+N9XZb+O9/H7+vFg==";
        //token = URLUtils.getURLDecoderString(token);
        System.out.println("原本的token");
        System.out.println(token);
        String result = decompressData(token);
        System.out.println("解密后的结果：");
        System.out.println(result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        String sign = jsonObject.get("sign").toString();
        System.out.println("原本的sign：");
        System.out.println(sign);
        String params = decompressData(sign);
        System.out.println("解密后的sign：");
        System.out.println(params);
    }


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


    private static void mt1() {
        String token = "eJxVU2mvpMgR%2FC8teb7wNNzXSE8WR3M1NNDQNDxr9cR93zeW%2F7vp8e5KRhCVEZUUUZnFvy%2BDHF1%2BwdB5YR%2BXJR4uvy7wT%2Bgncfm4TOM5QyAYDiE0hp7PxyX8f43AyI9LMDj85de%2FYBqBPhAY%2FuOtPE7hfwoMUdAfH3%2FF2Bkj2Hm%2Fs%2BQz6ZJNUzf%2BAsH8Zx3n0%2Bw3P8O2Bv21AzMczNoprsCuzcEo9quf2VRX%2FzyZHH1iJIEhMPYjzKf9pDj5Y5z8YbLzOv58%2B8NohHpvCvoRN9HfKk6eNn6r4fR9LvSJwChGQqdrFEXw0yOGwxSGYAR05mEURpEo%2BcbvEP6OaZJE0BPwc22awGAYIb%2F9fyB4TJwQRCf48d80fNPgTekTKPwEGnnTdxS8X6PJv%2BjvWeqdF1PvWegN5HeAQtDp9ruFv6PfhTgNT34afJdnu5Af096dm%2FpxVELlp5%2FTMMdnyy5nXWv7rOs5ln%2BO%2Fp%2Fj9BfXzh6fuWOeNmcUKytdhbE%2Bwu3rMQEV25HmbZIzNyz5sCQR7cU%2BrwfjlYTGQkCHksAA9jMQkwWPTar7gol7aDQd0nWZjdZO03Aes7nMlR4oQgi1EZy0GQWoXQc1K%2FvSS7nhRsWQtRssjg9dfxbyeN3a3jpUeVdRTTPpa2mv9TVjatA8FNFquYYzt5XqK6UqdCUxdV0WqtUfhrzQjVREmGvyGAgqXT0xYzCdgW1jfwjj%2FLDG3G4SkKaMpJv3YKlwYF6aHdzcEYy01lBf9CSua3UEWkpsIVxsZPB1u2%2BTPprYPJZF1AnOPXK0kXi0rttNsQUInExQFGzaMCJX1oumh0l7itfRYOWQ4A3REYQ%2BHQS1TLcQt2uRcivrwJa6M8ieC03GdrqQ4cNNGA5v6ncOG2AOoIFKh5dQK0yg6as7H0iZ%2BSSj2XAGBRlzJ0UOll0RU9oKYhUXYwhFRxlyedpfUW7XA7SsTAGKTLfP2PR8dDjHxEEs32iAO9Yi3iUDg8t7iuSaCHFEiRttYKkM%2FUzVF2M5G4az90AsJSP3i0keKRWQ1%2Bvgysh9JJz0CqNrLT052POi3YYVaMkpbfdZDMC5RujuZJXfnXGq%2BbyinUjFk2GaIww06gqFRIc6ViWWDG0cbfYxYUJmS7DRTg1jXfUqaQlO5XSdIoZGABYYTNJYPW6LIfryFNPRYnHJqV3xyczaq9%2FtPYJ%2Bfb2kqAjUXVKcMBJFtBJ5HEGCROam9aZGyRRGjViIVNKkRmIoiwlOosLlSDxB2Tq5SNWEGQFecZquA6dOFW91VxScIyGzQqfvFNEEn7PWEYN2Z4mKU%2FnGlhgI35r%2B1paxM2jVMYq1d6va5PAJ4rWS0%2BPRf7kIjcCi5xZicgC58sjJfbvvoflS9%2BmK6IRvisrapPGwCoSprO75qec6jMMjkLZuifbXla0W7Ta7qkCi81BCTLKlYMvYSNM%2Fjr2rwRrrzQ0t8JXr6pvCDfZ%2B58he6z3hvidbiIiYKBywZnNiDCNBzmhm4z5Kjh6G55O3SVs5QlYae0mS8FRopN7sSuKqXr8iL69kOeZux%2BwqpInIKjk8hgd5%2BK%2F2%2BNJE1FHSwdY4NXO2EOSRnF%2B9IEFf3kBaCkF1W0BsOu%2FQkpfnWwznTw0TplQihGOL1ywLDGA08TzMU2y87xM8RJp8WKEAIwR0%2Fj%2BAhrNjQKwCtGBr%2FRhznsHsAY%2BvnTkuDOHNlO3c6cQ0xNCAfIGHkVlFeBTw7GDyyrk4aLHskq5oW7N6ybt1GEzRdf5QVy5FWZnWmRnYQG5iNjdOXHjbLUIuc5elux5csXWcHO%2Fijq8%2BfJPmGAByhALdBSRZVtmtICMsIgGvpW6OjaKpcQu9SMjRYgzU01Z1s1vnRGhPVHQ6f5GKhA4iuj%2BvYJ0du0lLoX5zRnFxO32QK2xMR6J1bYhI4nZ48ZjxylBLK3tTEf3iWVqc689L4lmavcSSBhJGQLysRqJciC1s%2B4gSo%2BdZlfhqia6WsSQfjn65e%2BYtI5k5Os%2BzSbIbR0yzVav3jaUapaTzte%2BjG8oIJikwMoepOeHaK%2BDtQMqvxJdzGMYDxjY48LrKS1ADbSq9qF9sLL1eSAdO23lsRgWFrxGPzkXaBk%2FIrvucRE5PiLA7y2aQnUVSvFEntcElAwiE3YAvW0JGapzYC2fbVBneFnKrQTzgqGKithJc9C8aSJ6cpWjiLsj%2B0R00ELMstE2yUp0tY6F0tL0qQQwKN3kGshuwQOkUpRcnCUH5FZmfn5f%2F%2FBfvAspI";
        token = URLUtils.getURLDecoderString(token);
        System.out.println("原本的token");
        System.out.println(token);
        String result = decompressData(token);
        System.out.println("解密后的结果：");
        System.out.println(result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        String sign = jsonObject.get("sign").toString();
        System.out.println("原本的sign：");
        System.out.println(sign);
        String params = decompressData(sign);
        System.out.println("解密后的sign：");
        System.out.println(params);
        System.out.println("重新加密后的sign：");
        assert params != null;
        String newSign = compressData(params);
        System.out.println(newSign);
        System.out.println("前后的sign比对结果：" + Objects.equals(newSign, sign));
        System.out.println("重新加密后的token：");
        assert result != null;
        String newToken = compressData(result);
        System.out.println(newToken);
        System.out.println("前后的TOKEN比对结果：" + token.equals(newToken));
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
