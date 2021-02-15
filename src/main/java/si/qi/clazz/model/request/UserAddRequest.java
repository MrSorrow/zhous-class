package si.qi.clazz.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserAddRequest {
    @NotNull(message = "nickName不能为空")
    private String nickName;
    @NotNull(message = "phone不能为空")
    private String phone;
    @NotNull(message = "password不能为空")
    private String password;
    @NotNull(message = "所属班级不能为空")
    private List<Integer> classes;


}
