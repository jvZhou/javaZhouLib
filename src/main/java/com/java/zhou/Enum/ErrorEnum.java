package com.java.zhou.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorEnum {

    import_resume("500","导出错误-------->周明威-简历.pdf.");

    private String code;

    private String message;
}
