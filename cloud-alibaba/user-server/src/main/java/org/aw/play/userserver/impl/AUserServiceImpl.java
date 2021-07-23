package org.aw.play.userserver.impl;

import org.aw.play.userserver.entity.AUser;
import org.aw.play.userserver.mapper.AUserMapper;
import org.aw.play.userserver.service.AUserService;
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
public class AUserServiceImpl extends ServiceImpl<AUserMapper, AUser> implements AUserService {

}
