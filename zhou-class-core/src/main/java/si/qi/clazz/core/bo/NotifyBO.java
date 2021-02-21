package si.qi.clazz.core.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class NotifyBO {
    private Long id;
    private Integer type;
    private String title;
    private String content;
    private Integer time;
    private Long authorId;
    private String classIds;
    private String ext;
    private Date createTime;
    private Date updateTime;
}