package org.aw.play.orderserver.service;

import base.DataResult;
import com.baomidou.mybatisplus.extension.service.IService;
import org.aw.play.orderserver.entity.AUser;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
public interface AUserService extends IService<AUser> {


    DataResult<List<AUser>> t1(@RequestParam("name") String name);

}
