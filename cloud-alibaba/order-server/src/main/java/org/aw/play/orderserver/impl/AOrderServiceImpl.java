package org.aw.play.orderserver.impl;

import org.aw.play.orderserver.entity.AOrder;
import org.aw.play.orderserver.mapper.AOrderMapper;
import org.aw.play.orderserver.service.AOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
@Service
public class AOrderServiceImpl extends ServiceImpl<AOrderMapper, AOrder> implements AOrderService {

}
