package si.qi.clazz.core.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

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
    private List<Integer> roles;
    private String phone;
    private String password;
    private List<Integer> classes;
    private String ext;
    private Date createTime;
    private Date updateTime;
}
