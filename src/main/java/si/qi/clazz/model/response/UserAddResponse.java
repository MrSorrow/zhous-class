package si.qi.clazz.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.entity.UserInfo;

import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserAddResponse {
    private UserInfo userInfo;
}
