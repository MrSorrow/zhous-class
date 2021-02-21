package si.qi.clazz.core.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: guoping
 * @date: 2021/2/21
 */
@Getter
@Setter
@ToString
public class UserInfoVO {
    private Long id;
    private Long uid;
    private String avatar;
    private String wechatName;
    private String nickName;
    private Integer role;
    private String phone;
    private String classes;
    private String ext;
    private Date createTime;
}
