package org.aw.play.orderserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class AUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_code", type = IdType.ASSIGN_UUID)
    private String userCode;

    private String userName;

    private String userPhone;

    private Integer deleteFlag;


}
