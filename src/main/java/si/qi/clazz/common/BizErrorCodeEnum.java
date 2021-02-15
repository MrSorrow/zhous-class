package si.qi.clazz.common;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
public enum BizErrorCodeEnum {
    NETWORK_ERROR(50001, "网络异常，请稍后重试"),
    ;

    private Integer code;
    private String desc;

    BizErrorCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
