package si.qi.clazz.common.enums;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
public enum ConsoleRoleEnum {

    ADMIN(0, "管理员"),
    TEACHER(1, "老师"),
    PARENT(2, "家长"),
    STUDENT(3, "学生"),
    VISITOR(4, "访客"),
    ;

    private Integer code;
    private String desc;

    ConsoleRoleEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ConsoleRoleEnum getByCode(Integer code) {
        if (code == null) {
            return VISITOR;
        }
        for (ConsoleRoleEnum value : values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return VISITOR;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
