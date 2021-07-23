package org.aw.play.userserver.controller;

import base.DataResult;
import base.IDUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.aw.play.userserver.entity.AUser;
import org.aw.play.userserver.entity.AUserCreateVo;
import org.aw.play.userserver.entity.AUserUpdateVo;
import org.aw.play.userserver.service.AUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
@RestController
@RequestMapping("/a-user")
@Api(value = "用户", tags = "用户")
public class AUserController {

    @Resource
    private AUserService aUserService;


    @GetMapping("/list/{page}/{limit}")
    @ApiOperation("查询列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "limit", value = "每页数量", required = true, dataType = "int", paramType = "path")
    })
    public DataResult<List<AUser>> hotelList (
            @PathVariable("page") Integer page,
            @PathVariable("limit") Integer limit
    ){
        IPage<AUser> result = aUserService.page(new Page<>(page, limit), Wrappers.<AUser>lambdaQuery());
        return new DataResult<>(result.getTotal(), 200, result.getRecords(), "success");
    }


    /**
     * 根据主键查询详情
     *
     * @param code 主键
     * @return com.wxay.xhotel.wxaydiscountserver.entity.profit.Hotel
     * @author Irvin
     * @date 2021/5/19
     */
    @GetMapping("/{code}")
    @ApiOperation("查询酒店详情")
    @ApiImplicitParam(name = "code", value = "主键", required = true, dataType = "string", paramType = "path")
    public DataResult<AUser> info(@PathVariable("code") String code) {
        return new DataResult<>(0, 200, aUserService.getById(code), "success");
    }


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
        AUser save = new AUser();
        save.setUserCode(IDUtils.getId());
        BeanUtils.copyProperties(createVo, save);
        return DataResult.getBooleanResultForUpd(aUserService.save(save));
    }


    /**
     * 修改
     *
     * @param updateVo 数据对象
     * @return base.DataResult<java.lang.Boolean>
     * @author Irvin
     * @date 2021/5/19
     */
    @PutMapping
    @ApiOperation("修改")
    public DataResult<Boolean> update(@RequestBody @Valid AUserUpdateVo updateVo) {
        AUser save = new AUser();
        BeanUtils.copyProperties(updateVo, save);
        return DataResult.getBooleanResultForUpd(aUserService.updateById(save));
    }


    /**
     * 删除
     *
     * @param code 主键
     * @return base.DataResult<java.lang.Boolean>
     * @author Irvin
     * @date 2021/5/19
     */
    @DeleteMapping("/{code}")
    @ApiOperation("根据主键删除")
    @ApiImplicitParam(name = "code", value = "主键", required = true, dataType = "string", paramType = "path")
    public DataResult<Boolean> delete(@PathVariable("code") String code) {
        AUser save = new AUser();
        save.setDeleteFlag(1);
        return DataResult.getBooleanResultForUpd(aUserService.updateById(save));
    }

}

