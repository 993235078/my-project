package org.aw.play.api.controller;

import io.swagger.annotations.Api;
import org.aw.play.api.remote.service.AOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
@RestController
@RequestMapping("/a-order")
@Api(value = "订单", tags = "订单")
public class AOrderController {

    @Resource
    private AOrderService aOrderService;



}

