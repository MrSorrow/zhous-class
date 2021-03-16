package si.qi.clazz.domain.db.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author bbgg
 * @since 2021-03-16
 */
@Data
@TableName("user_info")
@EqualsAndHashCode(callSuper = false)
public class UserInfoDO implements Serializable {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * uid
     */
    private Long uid;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 微信昵称
     */
    private String wechatName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 角色
     */
    private Integer role;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 所属班级
     */
    private String classes;

    /**
     * 扩展信息
     */
    private String ext;

    /**
     * 乐观锁
     */
    private Long version;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
