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
@TableName("menu")
@EqualsAndHashCode(callSuper = true)
public class MenuDO extends BaseDO {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 菜单类型（M目录 C菜单 F按钮）
     */
    private Integer menuType;

    /**
     * 顺序
     */
    private Integer order;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单icon
     */
    private String menuIcon;

    /**
     * 菜单url
     */
    private String menuUrl;

    /**
     * API权限标识
     */
    private String permission;

    /**
     * vue对应的组件路径
     */
    private String component;

}
