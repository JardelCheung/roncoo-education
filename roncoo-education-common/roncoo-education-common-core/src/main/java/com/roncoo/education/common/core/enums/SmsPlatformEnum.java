package com.roncoo.education.common.core.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author LYQ
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SmsPlatformEnum {
    /**
     * 领课云
     */
    LK_YUN(1, "领课云"),

    /**
     * 阿里云
     */
    ALI_YUN(2, "阿里云");

    /**
     * 编码
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String desc;

    /**
     * @param code
     * @return
     */
    public static SmsPlatformEnum byCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (SmsPlatformEnum platformEnum : SmsPlatformEnum.values()) {
            if (platformEnum.getCode().equals(code)) {
                return platformEnum;
            }
        }
        return null;
    }
}
