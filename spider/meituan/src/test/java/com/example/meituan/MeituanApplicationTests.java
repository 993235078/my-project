package com.example.meituan;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.meituan.forest.HotelService;
import com.example.meituan.vo.BaseData;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.ResponseBase;
import com.example.meituan.vo.RoomType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class MeituanApplicationTests {

    @Resource
    private HotelService hotelService;

    private String token = "eJyNVNmOq0gS%2FZd6qBdXF8kOVyqNwGazwWxmbbVKrAazQ4Ixo%2Fn34fbtVmveJpXKiDwRiow4GZn%2FfhuV9O0HCvZBfLwt2fj24w39BJ%2FU28cbnHYLhREEjqI0TqLUx1vyvxhNYx9v8eie3n78jpIE9YFh6B8%2FEWsHfkdZDHyggAF%2FfPytE7uOEfv86aXsTm8FhP30A0HKzyYr4Ry1n0nXINGzRwoSKTqY1UjflUiaRfVnAZv6X%2FtOSb9Qck%2BCJkgGvCclfO0ISb9PMBrhrWyyrz9TBBTxsy7wnrXpPyiLMb%2FQBH7vsb4ABQgKA4BmWYba4%2BEojbIog6GABQxDoBhFYSSLfyfYd4ZSgGQoDKcBy7AM2AnA2e%2BFpHCAUyyD0QwJqF2j6e%2Fvn5R%2BR%2B1c198d%2Bp3%2BWcl%2BHIzu8Xe1G7F3%2BOr3lN63Wqyj%2Bxcc52zn%2FP%2Bgoy4n%2BOfyi49%2Fyo%2BS3bfp0giWXXv7FT0psqRS2i8MYOhvgPoNw39B%2Bgz%2FwYj3ecr2RvjCcRxj9iJQ5h12VdZ%2B2Q%2B0MUSKjFtZV6jNEWBj8YFxbGiH%2BzmoO%2BA4%2Fc4N3HEteHzbwmexxljkVYOfzaOZg7g6Xs8j%2F9ysUGzu58rrT4C9ebi5MNZ660S7T57vUzfCr6nZb%2B%2B9juAXDj73a8IZ4r1u718oSnwSAKPe9p5pbnvP7LL6S0Z%2FSfj3Xtv7d6dxKu%2FtrmXnJ1trjT6Bzi7SQy1C2rz0Z62YrYv%2F4CJsLaaHJt2xOydtyivsUn%2FBoY%2B4KRKstShQ%2FCayq1s%2F8Z6hrXoW2WwxEvfYzEHBL4fRT0cMPBAY868NRSlTMrvCzexV5aqkLqppWu2HwyuCd1bcB%2B%2FyxK3Rg1DmSpGTiIFVOKdseCs4NnWKhbfTJOSPgx8oz8VexlRgLfaUXBUVjg22GlrM%2BMnJPj0jGjaPULm%2FJO%2F%2BkgMEWdoLNg5KRMktdUDykajGw2Psogw64YScGf1q5vOwYbjJ0E47KPSGOStYpg2e5wDtnkFpiVeEsLgQJxhx9ByJvfWdKmH4i%2Bx7qfOcOjgKEd9qaa9mZtSRVGkiMWLG%2BW30W2o76VYmjLAd6tO12yYAz8z6mM8Pw3LIp38iVHCiZndACZVV84f6VG6o0gPO34ZLBjPeMjLpnhh%2BlThZECB22WMQN72oo%2F3cxqcLWVPsgark2Cx9RbiOeXtsorYxAkTES1zEspQ%2BCwGES1r5cn2QbbzUZVKg%2FVBPoQJsUlAMYxbbhNC36qqSgl%2BB%2B5QtKMdOfP685IaV8iTQOV2sCkMu5Eyv8WYI8wyi%2BawuY9gHq7uET5VxnqvXGv4Jf25nUsdxeKxhhc8p9PvhwKgSRycTSfdsYWTj46K2rtENlf8SLE%2FUlBUHMbLaDr%2BAG5JrHku41ZWooWaIN7n2SuVSiBlZMt44AAGH1SoNES%2Bz9L2eJf1QKVc%2BC06EfO3jW527mRozRPuSX4Y3CS0aeKlE3rKIm7VQIBKzFKg5DBoYhShWHFe2KCN5myyCUM7Pup585h7lzTOVKuBokibAicXMF05BkcmWR2zWmmRjmT%2FFxrP1e6LzE0WV%2FOl4rtJgIHDkjp5APa1nhwhe%2B1dxYNb8KbqP21baAtiwaLuQYJVOFSvV5DjahWn4Ra6cZT%2FklprPVFEboiPlNKFP6begjecxjE1VfOZ19lqFLK4bwU89nlW9xtAq2dHt420q5PAx95LbzlcCWB5W1i%2F2wgJqPC4l5oSzfEWu%2FJG5dsY99o9LB1TzKEOVc27y8kIVl0rEafSuBYbCIeGBkJ1W40EGXvQ4q2OC1ncbO%2Fjc8GhnWxayTvE4q%2FTVEOuQY%2B0t1yByKTLIpKUfx4rZdg58dRuPVqG7ZClvCc5lrlJ0LyF1iPpwPAy%2BXc0VQJPtHOsx33WK0W%2Fn0%2FO2UqpmkjS%2BMTM3YaxOm5Aii3KqqUE%2F9dlyt%2BAzGYxniQvXg3N2%2BpXGH5e2uTf8pXw%2BQsjLNzvDkwlolzP3qkeOzwsyy0cfQZgFAjFNGQnPmVXTdorIxfETP4s6JLPr8V4FlX5iJrPKlFfujMvWuZlZHnC4glTpSVsVrdJ7GccLO0gKebETKeqzSs1ab1se%2BytVLW5Dp0rusouuUvBacEllu%2BOmoouKooF5CdFU1m6OeqGTwBLLBCidbduuECEGd4FErh7XtJmv96mUMSxJSCbeBtd8kPH5GuNUeGjRl5O8An6JqeODEq%2FKWJg%2BG1YXXJOSLTlTiH2WO1tydTzOubliKMDgi%2BRBDdPt%2B0D7WtDEdEDRqr4BuVOq7OBE4iYdLWlIk4Mb0EmC0A%2FsyF7p2LsibCEg%2FsaGbILebAcNNnxKEWCmmpFPXDIht3wqUGRt4XDN041NCqLgT2LDKS6e0%2FfczCMRM0%2BCpls9rykmUqnM9jwpk3Wjbz52ipET6tNuwkfK19t%2F%2FgsEBApb";

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


            String poi = "1562474580";//1562474580
            QueryHotelRoomTypeVo queryHotelRoomTypeVo = getQueryHotelRoomTypeVo(poi);
            String baseDataResponseBase = hotelService.hotelRoomTypeList(poi, queryHotelRoomTypeVo, (result, request, response) -> {
                System.out.println("请求结果为：");
                System.out.println(result);
            }, (error, request, response) -> {
                System.out.println("请求失败：");
                System.out.println(error.toString());
            });
            System.out.println("返回解析的结果为：");
            ResponseBase responseBase = JSON.parseObject(baseDataResponseBase, new TypeReference<ResponseBase>() {
            });
            System.out.println(responseBase);

            try {
                TimeUnit.MINUTES.sleep(1);
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
        queryHotelRoomTypeVo.setUuid("c26d86a0e2b9430bb230.1624427616.1.0.0");//c26d86a0e2b9430bb230.1624427616.1.0.0
        queryHotelRoomTypeVo.setIuUid("AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E");//AD5133FB98DCA78D58D615E1C208CDE88EAE977563A5B2D0BA78E03D4A62049E
        queryHotelRoomTypeVo.setUserid("3332885018");//3332885018
        queryHotelRoomTypeVo.setToken(token);
        return queryHotelRoomTypeVo;
    }

}
