package org.aw.play.userserver.controller;

import base.DataResult;
import io.swagger.annotations.ApiOperation;
import org.aw.play.userserver.entity.AUserCreateVo;
import org.aw.play.userserver.remote.UserServiceInOrderServer;
import org.aw.play.userserver.service.AUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Description
 * @Author Irvin
 * @Date 2021/7/23 15:01
 */
@RestController
@RequestMapping("/user/trans")
public class UserTransController {

    @Resource
    private AUserService aUserService;

    @Resource
    private UserServiceInOrderServer userServiceInOrderServer;

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
    public DataResult<Boolean> create(@RequestBody @Valid AUserCreateVo createVo) {
        /*AUser save = new AUser();
        save.setUserCode(IDUtils.getId());
        BeanUtils.copyProperties(createVo, save);*/
        /*return DataResult.getBooleanResultForUpd(aUserService.save(save));*/
        return userServiceInOrderServer.create(createVo);
    }

}
