package org.aw.play.orderserver.controller;

import base.DataResult;
import org.aw.play.orderserver.entity.AUser;
import org.aw.play.orderserver.remote.UserTransService;
import org.aw.play.orderserver.service.AOrderService;
import org.aw.play.orderserver.service.AUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/23 15:01
 */
@RestController
@RequestMapping("/order/trans")
public class OrderTransController {

    @Resource
    private AOrderService aOrderService;

    @Resource
    private AUserService aUserService;

    @Resource
    private UserTransService userTransService;

    @GetMapping("/t1")
    public DataResult<List<AUser>> t1(@RequestParam("name") String name){
        //先让userTransService新增一条数据
       return aUserService.t1(name);
    }

}
