package si.qi.clazz.core.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ClazzBO {
    private Long id;
    private String schoolName;
    private Integer grade;
    private Integer classNumber;
    private String ext;
    private Date createTime;
    private Date updateTime;
}