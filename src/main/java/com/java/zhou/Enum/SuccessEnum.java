package com.java.zhou.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessEnum {
    LOGIN_Ok("200","登录成功");

    private String code;

    private String message;
}
