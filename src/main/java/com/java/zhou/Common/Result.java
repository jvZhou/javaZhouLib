package com.java.zhou.Common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Result<T> {

    //状态码
    private String code;

    //状态描述
    private String msg;

    //json数据
    private T data;

    public Result() {

    }

    //失败
    public static <T> Result<T> error(String code,String msg,T data) {
        return new Result<T>(code,msg,data);
    }
    //成功
    public static <T> Result<T> success(String code,String msg,T data) {
        return new Result<T>(code,msg,data);
    }

    private static <T> Result<T> setResult(String code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    @Override
    public String toString() {
        return data != null ?
                "{code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}' :
                "{code=" + code + ", msg='" + msg + '\'' + '}';
    }
}
