package si.qi.clazz.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.PageResult;
import si.qi.clazz.entity.UserInfo;

import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserPageResponse {
    private PageResult<List<UserInfo>> userInfos;
}
