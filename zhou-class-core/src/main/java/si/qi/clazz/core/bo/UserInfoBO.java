package si.qi.clazz.core.bo;

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
public class UserInfoBO {

    private Long id;
    private Long uid;
    private String openid;
    private String avatar;
    private String wechatName;
    private String nickName;
    private Integer role;
    private String phone;
    private String password;
    private String classes;
    private String ext;
    private Date createTime;
    private Date updateTime;
}
