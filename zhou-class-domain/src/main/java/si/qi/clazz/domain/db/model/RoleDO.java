package si.qi.clazz.domain.db.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author bbgg
 * @since 2021-03-25
 */
@Data
@TableName("role")
@EqualsAndHashCode(callSuper = true)
public class RoleDO extends BaseDO {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色显示名称
     */
    private String remark;

    /**
     * 顺序
     */
    private Integer order;


}
