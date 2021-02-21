package si.qi.clazz.domain.db.model;

import java.io.Serializable;
import java.util.Date;

/**
 * (Clazz)实体类
 *
 * @author makejava
 * @since 2021-02-07 00:22:53
 */
public class ClazzDO implements Serializable {
    private static final long serialVersionUID = -93912026570938108L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 学校名称
     */
    private String schoolName;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 班级
     */
    private Integer classNumber;
    /**
     * 扩展信息
     */
    private String ext;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}