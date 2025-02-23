/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.education.common.core.tools;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.file.FileNameUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 判断文件类型
 *
 * @author fengyw
 */
@Slf4j
public final class FileUtils {
    private static final String PIC_TYPE_MAP = "jpg|png|gif|bmp|webp";

    private FileUtils() {
    }

    public static boolean isPic(MultipartFile file) {
        try {
            String fileType = FileNameUtil.getSuffix(file.getOriginalFilename());
            if (!StringUtils.hasText(fileType)) {
                fileType = FileTypeUtil.getType(file.getInputStream());
            }
            return StrUtil.isNotBlank(fileType) && PIC_TYPE_MAP.contains(fileType);
        } catch (IOException e) {
            log.error("判断文件类型错误", e);
            return false;
        }
    }

}
