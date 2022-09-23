package com.roncoo.education.common.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 上传方式
 *
 * @author LHR
 */
@Getter
@AllArgsConstructor
public enum StoragePlatformEnum {

    LOCAL(1, "本地", "local%", "local"), MinIO(2, "MinIO(商业版)", "minio%", "minio");

    private Integer code;

    private String desc;

    /**
     * 标记
     */
    private String tag;

    /**
     * 标记
     */
    private String mode;

    /**
     * 根据编码获取枚举信息
     *
     * @param code 编码
     * @return 枚举信息
     */
    public static StoragePlatformEnum byCode(Integer code) {
        for (StoragePlatformEnum val : StoragePlatformEnum.values()) {
            if (val.getCode().equals(code)) {
                return val;
            }
        }
        return null;
    }
}
