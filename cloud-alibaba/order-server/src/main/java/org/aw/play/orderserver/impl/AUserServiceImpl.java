package org.aw.play.orderserver.impl;

import base.DataResult;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.aw.play.orderserver.entity.AUser;
import org.aw.play.orderserver.entity.AUserCreateVo;
import org.aw.play.orderserver.mapper.AUserMapper;
import org.aw.play.orderserver.remote.UserTransService;
import org.aw.play.orderserver.service.AOrderService;
import org.aw.play.orderserver.service.AUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
@Slf4j
public class AUserServiceImpl extends ServiceImpl<AUserMapper, AUser> implements AUserService {


    @Resource
    private AOrderService aOrderService;

    @Resource
    private AUserService aUserService;

    @Resource
    private UserTransService userTransService;

    @Override
    public DataResult<List<AUser>> t1(@RequestParam("name") String name){
        //先让userTransService新增一条数据
        AUserCreateVo createVo = new AUserCreateVo();
        createVo.setUserName(name);
        createVo.setUserPhone(name);
        createVo.setDeleteFlag(2);
        DataResult<Boolean> booleanDataResult = userTransService.create(createVo);
        log.info("userserver新增数据结果{}", booleanDataResult);
        //自己再用aUserService查询刚才新增的这条数据
        List<AUser> zfq = aUserService.list(Wrappers.<AUser>lambdaQuery().eq(AUser::getUserName, name));
        return new DataResult<>(zfq.size(), 200, zfq, "查询成功");
    }

}
