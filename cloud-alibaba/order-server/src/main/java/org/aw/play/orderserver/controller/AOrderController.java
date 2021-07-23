package org.aw.play.orderserver.controller;

import base.DataResult;
import base.IDUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.aw.play.orderserver.entity.AOrder;
import org.aw.play.orderserver.entity.AOrderCreateVo;
import org.aw.play.orderserver.entity.AOrderUpdateVo;
import org.aw.play.orderserver.service.AOrderService;
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
@RequestMapping("/a-order")
@Api(value = "订单", tags = "订单")
public class AOrderController {

    @Resource
    private AOrderService aOrderService;


    @GetMapping("/list/{page}/{limit}")
    @ApiOperation("查询列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "limit", value = "每页数量", required = true, dataType = "int", paramType = "path")
    })
    public DataResult<List<AOrder>> hotelList (
            @PathVariable("page") Integer page,
            @PathVariable("limit") Integer limit
    ){
        IPage<AOrder> result = aOrderService.page(new Page<>(page, limit), Wrappers.<AOrder>lambdaQuery());
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
    public DataResult<AOrder> info(@PathVariable("code") String code) {
        return new DataResult<>(0, 200, aOrderService.getById(code), "success");
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
    public DataResult<Boolean> create(@RequestBody @Valid AOrderCreateVo createVo) {
        AOrder save = new AOrder();
        save.setOrderCode(IDUtils.getId());
        BeanUtils.copyProperties(createVo, save);
        return DataResult.getBooleanResultForUpd(aOrderService.save(save));
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
    public DataResult<Boolean> update(@RequestBody @Valid AOrderUpdateVo updateVo) {
        AOrder save = new AOrder();
        BeanUtils.copyProperties(updateVo, save);
        return DataResult.getBooleanResultForUpd(aOrderService.updateById(save));
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
        AOrder save = new AOrder();
        save.setOrderCode(code);
        save.setDeleteFlag(1);
        return DataResult.getBooleanResultForUpd(aOrderService.updateById(save));
    }



    public DataResult<Boolean> testTrans(){

        return null;
    }
}

