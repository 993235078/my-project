package org.aw.play.userserver.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Irvin
 * @since 2021-07-23
 */
@Data
    @EqualsAndHashCode(callSuper = false)
@ApiModel(value="AUser对象", description="")
public class AUserCreateVo implements Serializable {

private static final long serialVersionUID = 1L;


        private String userName;

        private String userPhone;

        private Integer deleteFlag;


}
