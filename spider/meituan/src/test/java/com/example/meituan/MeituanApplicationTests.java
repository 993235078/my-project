package com.example.meituan;

import com.example.meituan.forest.HotelService;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class MeituanApplicationTests {

    @Resource
    private HotelService hotelService;

    private String token = "eJyNlNmuo0gSht%2FFF3VDdZHsUNLRCDA22Gxmh1briH0xmwGztebdh6rqUWnuBiEi4yMJ%2Fvgz4e%2FTICWn7wg4DvzraU6H0%2FcT8g18I09fT9N43CFRHEdoCgcIIL6e4v9lOEV9PUWDcz59%2F5MG4CtCkfhfP4hxgD%2Fxg9A0%2BtfX3yMUP84fM6RjwqmYpn78DsPltyYtp3fYfou7Bg6XHi4IuOimtIb7roSTNKy%2FFVNT%2F%2BvIpOSDRnGMPiRTX%2BJy2g5AUF%2FGKRwmq2zSj5%2FqAIn%2FaAl8SdvkN2VQ%2BheNp8%2Bj1AcgMZQhAI4QgMIInCIAiRBHYQwckCIQEkMQgFGfMfhMGQInMJLBEJr8%2BRhKEp9h%2B67rzw75TH6KPUpOYR59Po8S6Jdp64%2FXftnrSx3mH9PwTg9L%2F4%2BO63Kcfl5%2Btfy7xbhI46fUfqAARf4A5B8o9gtp7%2Bk3w7%2BE8VGy6ZJwKrvW%2BiVi7IbpY2wOi06H%2BY11mH%2FE5z8x%2FCdO%2F82VYxMcYscyb49RelsYRGm0F5Kb3JvDNt%2FGJp5YNGGpCV82rrddCQZuy9dW1QWoTudMm%2BskGX0M7x1Ooj1MoOAGvwX0M7PbiOC0lpUeoy%2BfYcT05hskZkw7Bdj4bM%2FL%2BWwv58ebL25nAZIqZXlwkrLL7CPOl2Z7yJJiRuxTiqSxoARWAnm%2BAa5hY3KbxK3v4Ha3h4wgSG%2FGelrJz0xxvisznFSIbVDqy6hUkGYZtjIrQhO9hjEwrHuM5FsOouDWxCX1FbESixKg0Gpo32ee5voQdC4xHOwxViWSsb6va28PYnViNNpp4XGnUdDzdVaneE66Qq560FfXSWFyMg17Xkjd%2B41kSl%2B58lchgt9J7w2piY%2FWHLWqX1BBigabzMgW1UCvBax1wVGOriNKxnMimqZ1wzh3sfEFG0JnZ9Tgknd2fLpB7rLZjyuPRhPNjMmgiFv3zAmESO7Itl68KzCZvXwlcnxos229i2dcLqmE3N%2F5uLWEl5cAK3RNo2gT1mdq1Ktyc1LVbEiODvcHcxlwkQhsz2janKTwob5oSitkI6EPGJaN9WypneheLS2apWeniU6gVfmNCqMKPEA1A66dnHLyIXVhiMqZQ5yLt8fdsVFxs4j%2BVRpzX9sk8sYY5Hq3zo2tgl7vPb7tawEgmHan2SpuhGAVI9G82GVx3TrLDTqZCJ5FKWgXq72aEzUs4L6mL7bwbC6ZaIeX78ITm9F5HCYhVyMDv8PpEmmCl%2BOpYitzWgVFA0aOqap%2B5iTRyfyh2q5Z3CmDKVuiLVY6j%2B77IIZ9YuLSIzEn2HjZ%2Bl3tydh7nw2pbpS8qbcOx6z9eubOHNiJwzXZ4NJW2zbzxXnXctev86V%2FJi3WeZccz4IoXGMoiQvEpYQCk9BZBRvwz%2BfqmaYMDY0PG0VgVMN831KqsXogaHINEdJyST4puw7QK5Ieq%2Fhi2J570mXWC0pISyzBNhd2XW8Wn3ukfo9QdBUED1QXWlJdLlux94Nu7y5xS%2BM95oUibD0RfdmqUyPu2sWrPsrP5dKLru0%2Fp6m4gJ16XIu6ks5H6hrohSqq9AJG11YX51o1ulynhhVgUGOztR7A4c3qlowhz%2B8%2B7hcb8kPTdldH9LuEIJynBUVUm0B%2BVKRyR0nPVB6O78M9NobMeEMmkb0RiFCSedDQ3TY%2BFlM2sM5M2eA6FutbAyMvp%2FW6ApnZxh4WuelApO%2B4zAKNbxEngGZJKlFySKKpz1t%2BFZitNvpQLlpzMS2trFUacXWJichm5GEFlp2FcQoXW2EYOn4FmHV59TsewjTNHut3vaOuTIXjK3rV0StTcj%2BfS2dQs0CVYwFPHyNWl44TW77qjEGdkaVKTFiGsN2mdS5uzTVfP21pVElIYrRQZ5C7SRCg9dMNs9DXpK2uVu3rzRAinUWe9lOPdv%2Bcvy4ykAdWOl%2F0C64KOu06RX5JRr3W3tqYJZjSRe8ycFV%2BhpRJcogEVdpqXK8GsUmTEHQ3mRwWJcGeG2JAV7Kdjd3IOHaaTKTIlDeWG6wCKMo0k%2BFGUNamZxAS9jtWas1uWEVhM5dXbY1wRqElTqwec5vUTbyoLzDvE0M7kCK6uj4jzG3eKZyAZVR0VcBjU0VFlihhu8h0Kz%2BTRZbhATw%2B5o0wNZ0cLO3%2BYM9NgUM%2BoM0IWiqF3esXu5uKhC%2B9jiMASn22UbpXkUE8PF7gaPUw58Zt9sfp3%2F8BBG7HLA%3D%3D";

    @Test
    void contextLoads() {

        /*List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(RandomStringUtils.getString(10, RandomStringUtils.DIGITAL));
        }

        List<String> collect = list.stream().map(poi -> {
            AtomicReference<String> re = new AtomicReference<>();
            QueryHotelRoomTypeVo queryHotelRoomTypeVo = getQueryHotelRoomTypeVo(poi);
            hotelService.hotelRoomTypeList(poi, queryHotelRoomTypeVo, (result, request, response) -> {
                System.out.println("请求结果为：");
                System.out.println(result);
                re.set(result);
            }, (error, request, response) -> {
                System.out.println("请求失败：");
                System.out.println(error.toString());
                re.set(error.getMessage());
            });
            return re.get();
        }).collect(Collectors.toList());
        System.out.println("最终转换后的结果");
        System.out.println(collect.size());*/

        String poi = "1648603414";
        QueryHotelRoomTypeVo queryHotelRoomTypeVo = getQueryHotelRoomTypeVo(poi);
        hotelService.hotelRoomTypeList(poi, queryHotelRoomTypeVo, (result, request, response) -> {
            System.out.println("请求结果为：");
            System.out.println(result);
        }, (error, request, response) -> {
            System.out.println("请求失败：");
            System.out.println(error.toString());
        });
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private QueryHotelRoomTypeVo getQueryHotelRoomTypeVo(String poi) {
        QueryHotelRoomTypeVo queryHotelRoomTypeVo = new QueryHotelRoomTypeVo();
        queryHotelRoomTypeVo.setStart("1624406400000");
        queryHotelRoomTypeVo.setEnd("1624492800000");
        queryHotelRoomTypeVo.setGpsCityId(57);
        queryHotelRoomTypeVo.setCityId(57);
        queryHotelRoomTypeVo.setPoi(poi);
        queryHotelRoomTypeVo.setUuid("57b0f31f937f454ca1dc.1623930666.1.0.0");
        queryHotelRoomTypeVo.setIuUid("B228B62271DEE8B3D8F833818942A80CFC59853953D99A0920352FF2F921997F");
        queryHotelRoomTypeVo.setUserid("714621274");
        queryHotelRoomTypeVo.setToken(token);
        return queryHotelRoomTypeVo;
    }

}
