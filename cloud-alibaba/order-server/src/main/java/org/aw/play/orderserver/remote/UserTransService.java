package org.aw.play.orderserver.remote;

import base.DataResult;
import io.swagger.annotations.ApiOperation;
import org.aw.play.orderserver.entity.AUserCreateVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/23 15:03
 */
@FeignClient("user-server/u/user/trans")
public interface UserTransService {

    @PostMapping
    @ApiOperation("新增")
    DataResult<Boolean> create(@RequestBody @Valid AUserCreateVo createVo);

}
