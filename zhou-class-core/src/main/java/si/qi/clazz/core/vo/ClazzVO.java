package si.qi.clazz.core.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClazzVO {
    private Long id;
    private String schoolName;
    private Integer grade;
    private Integer classNumber;
}