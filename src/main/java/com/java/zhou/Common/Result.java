package com.java.zhou.Common;

import com.java.zhou.Enum.ErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Result<T> {

    //状态码
    private int code;

    //状态描述
    private String msg;

    //json数据
    private T data;

    public Result() {

    }

    public Result(String code, String message, Object data) {

    }


    //成功
    public static <T> Result<T> error(ErrorEnum errorEnum, T data) {
        return new Result<T>(errorEnum.getCode(), errorEnum.getMessage(),null);
    }
    //成功
    public static <T> Result<T> success(String code,String message) {
        return new Result<T>(code,message,null);
    }

    private static <T> Result<T> setResult(int code, String msg, T data) {
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
