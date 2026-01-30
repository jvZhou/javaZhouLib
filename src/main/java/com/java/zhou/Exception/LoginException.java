package com.java.zhou.Exception;

public class LoginException extends  RuntimeException{

    public LoginException(String code, String message) {
        super(message);
    }
}
