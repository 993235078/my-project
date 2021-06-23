package com.example.meituan.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.meituan.forest.HotelService;
import com.example.meituan.vo.QueryHotelRoomTypeVo;
import com.example.meituan.vo.ResponseBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
@Async
public class TestTask {


    @Resource
    private HotelService hotelService;

    private String token = "eJyVk9mOo0oSht%2FFF31jq0kyWVsqjcBms8GAMRh8dFRiNZh9NeZo3n2omjk9mstBSPHlH6Eg8s%2Fkr02nRJtfOFgfYreZ4m7za4P%2FBD%2BpzW4z9GuGggSBEEQkAvhuE%2F6vRhHMbhN0zmHz6w%2BcJKgdhPifX8plFf7AWQh2OGDAn7u%2FmVgZEuv7VaWsRZt0GJr%2BF4ZlP8s4G0a%2F%2BhnWJea%2FGiwlsbQe4gJr6gyLYr%2F4mQ5l8Y91pUQfOLkOQRMkA36E2fBeFZL%2B0Q9%2BN1yzMv74HhFQxNe%2BwI%2B4iv6rspD5txoOn2uvD0ABgoIA0CzLUGs%2FhNM4izMQByxgGAKHFAVJFn2G8DPGKUAyFEQ0YBmWATSiEfs5kRQCiGIZSDMkoFai6c%2FPL0s%2F%2FWosis8a%2F4y%2Bd7J%2BbvAfwWe%2BJuGP4d2sI%2F1YCrHwHx9DN8ar5%2F%2B3HX3c91ldfbZj3L0%2F8M1qbHn9MpaEaIdTaO1JQvibfmuA2a0efhO1EvFN6xGR%2BEoEu2oE%2B03ESsxKkGJ2BPkNcEd89YAk2qHv1Hry6KsXROwOwS9YbxP%2BVYwzxO470swO%2Fo7rkPnXkGv0%2FxOHv9faegPXwj57VCvFxxdbaKXeg9pKo20hDrR5ao5aOl5O7pPz4Zz2T016wAcnLcr7XkfuhAYXcyLMmwtRoPhFZGeneKGGoS%2FFKLLxZITOvhy9lJ%2B2nRt1EDyxIeDfC45TpmTWqRNbs8rlYZHmfT9bT5tXhNtRcZ68wxPXUvfuMpeJnES0rMLZWclfvH1ZRPB%2BPfRC8ty6nvKarKmLBPbCHsKzog5dCWdDCxg3PFiHl08P5fOuPN7S7fGWPQybqhPsWsWn5IraYklH5N322dV%2BPNj3Hjsy%2BtlMxnaByGRou2oVeoH2DKZ%2BGY6jh9cvL7uIZ4y4cHdEMGJ3syX22tSqBNGbbBqpvtmFtxd8vtKiRo1NvyapzMQCzAySa%2BdW1HLQL7HQDVVbHM710oPhyMzP8fg0Ljb5cg%2BECg7U6LQ4obJq8lRfyhVXGsC5S3uKh5i%2FGLH0CA03D%2B3Y8zAra%2BCAzJtf025iof5EFhS7pXI5MDNXEc5dUu1LvyoNDxNRhkQYR%2FRR8IZhinJXLrayhTJdJgXavevRoACLFBTDGMUqJPQlP6uk4Obg0ccTzrE9n7xOiXGJeBLonC7mqSGncqwXqGzvSTzgyahO3b3xZme6v1TGfs23ynAP6LUcSR2hYV8MORqjwW3aLaNKHB32JN2wqRF3z5NaOUbd5u5buNxETZkRCLDZsvkJXLFEu7GEk5%2BJYtAM8SoXt0w5pWJMZsyta4GAhnyWWp%2BXWfpRjJK%2BzZUzH3sHQj43wbVInFgNGKJ6y2%2Fj1gsV7t0iibzGPjdqd4EIzUygxrtXDv4dh%2Bl%2BZtPMl5f%2BQhDK8VUUvcs8%2FKR8RVIObE3ShKFnoflG1CAy8fQMzEKTLBi7fWC8KrchajdUVMnt98c88loCYQ%2F8AIp%2BPtqE9x7qfMvMyUt0ntclswSwQH85kWCWDjkrFWTXWalpuGmiHGX3zk0FH6ui1vp7yi7vLqVfvSoYu3tgquIrKeL3LMRBUQpudONZ9VYaWi7burW%2F9ql8f46N5FTjmQCXG8yKN3tiAdXtpwza91E%2BY2d%2Bz5xr4xG4%2B6kGqrmXB5Wzr%2FL0xhWHCsW%2Bu51TiA9tyAMhPszGk%2FRu%2FvOodiFePCy4dbn2WY2WLMS1cuMumaveYY3ti9t09nyHIr1Ympquy5ll9cBVl25%2FSXWHzOQlRFzsKGn9FiKbKLb7beta%2BZgDPFyOgR7wda0YzXI8vK4zpWomSaOFGbkesjptDhSZZn1BtfqhiafHZXiFrfHKkHDe2ke7mWn0PFXlo%2BRP2et5H3j5asUo7IF2OnLvouP4JCXjpHMxjJkGIEYRI6GEmTVttYicbDd0Y7%2FGYqvoHrmX6wemN%2FNYeSd2Ny21E5vZFg0ziJSGtFTxkt3exv7EtpJCnqxQ8ps4V%2BPqtkzP9S9VL9yC97lcxyddpYZzyoW55XSLik8qjnvm6Y5Hsna11RMdehcxC4FSW5blCD5mcKeBSNT9HJXj%2BdFnMoRhSDLB0jrmkwyO5wBR922Fv%2B3w7fFTQO2flHhWutR02Xt%2BQpoULuGRwqyjXFuSo6Mg4cacoQCDJuk2aFC3Hi3tal4Z0B5Fq%2FoC5FrJ463ti4u0v0htFG4djw5DjH7CPXumg9sZY1MBcxf2zob41bJxb0F9hAEz0oyk58IeuyZ9imNzNbTnJFrYMCVS%2FiCWnOKghH4kZuKL0DwImn5peE0xsVxlltdB6S9X%2BurCQ4AdcJd2Qt5XPjb%2F%2FBe%2Fw%2BI%2B";


    @Scheduled(cron = "0 0/1 * * * ?")
    public void t1() {
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
