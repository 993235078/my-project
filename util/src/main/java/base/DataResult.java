package base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Irvin
 * @version 1.0.0
 * @date 2019/9/20 11:15 上午
 */
@Data
@ApiModel(value = "返回结果外层对象", description = "返回结果外层对象")
public class DataResult<T> implements Serializable {

    /**
     * 最大页数
     */
    @ApiModelProperty(value = "最大页数")
    private long total;

    /**
     * 200 成功 300 值逻辑校验未通过 如 用户名不对 密码不对等 400 接收参数不正确 500 服务错误
     */
    @ApiModelProperty(value = "200 成功 300 值逻辑校验未通过 如 用户名不对 密码不对等 400 接收参数不正确 500 服务错误")
    private long code;

    /**
     * 存放查询出来的结果
     */
    @ApiModelProperty(value = "存放查询出来的结果")
    private T data;

    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息")
    private String message;

    /**
     * 快速获取普通新增/删除/修改这种接口的返回结果
     *
     * @param b 结果
     * @return base.DataResult<java.lang.Boolean>
     * @author Irvin
     * @date 2020/12/17
     */
    public static DataResult<Boolean> getBooleanResultForUpd(Boolean b) {
        if (b) {
            return new DataResult<>(0, 200, true, "操作成功");
        } else {
            return new DataResult<>(0, 500, false, "网络异常");
        }
    }


    public DataResult(long total, long code, T data, String message) {
        this.total = total;
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public DataResult(long code, String message) {
        super();
        this.total = 0;
        this.code = code;
        this.data = null;
        this.message = message;
    }

    public DataResult() {
    }
}
