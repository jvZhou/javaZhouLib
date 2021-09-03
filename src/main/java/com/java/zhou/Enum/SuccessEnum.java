package com.java.zhou.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessEnum {
    import_resume("200","导出成功-------->周明威-简历.pdf.");

    private String code;

    private String message;
}
