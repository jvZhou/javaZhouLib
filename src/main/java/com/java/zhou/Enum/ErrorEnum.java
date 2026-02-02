package com.java.zhou.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorEnum {

    LOGIN_ERROR("500","用户名密码错误!!!");

    private String code;

    private String message;
}
