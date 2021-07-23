package org.aw.play.userserver.remote;

import base.DataResult;
import io.swagger.annotations.ApiOperation;
import org.aw.play.userserver.entity.AUserCreateVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/23 15:21
 */
@FeignClient("order-server/o/a-user")
public interface UserServiceInOrderServer {

    /**
     * 新增
     *
     * @param createVo 数据对象
     * @return base.DataResult<java.lang.Boolean>
     * @author Irvin
     * @date 2021/5/19
     */
    @PostMapping
    @ApiOperation("新增")
    DataResult<Boolean> create(@RequestBody @Valid AUserCreateVo createVo);

}
