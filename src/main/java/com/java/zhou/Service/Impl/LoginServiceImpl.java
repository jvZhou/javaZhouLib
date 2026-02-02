package com.java.zhou.Service.Impl;

import com.java.zhou.Common.Result;
import com.java.zhou.Consent.LoginConsent;
import com.java.zhou.Dto.LoginInDto;
import com.java.zhou.Enum.ErrorEnum;
import com.java.zhou.Enum.SuccessEnum;
import com.java.zhou.Service.LoginService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Result login(LoginInDto loginInDto) {
        if (LoginConsent.USER_NAME.equals(loginInDto.getUserName()) && LoginConsent.PASS_WORD.equals(loginInDto.getPassWord())){
            return Result.success(SuccessEnum.LOGIN_Ok.getCode(),SuccessEnum.LOGIN_Ok.getMessage(),null);
        }
        System.out.println(Result.error(ErrorEnum.LOGIN_ERROR.getCode(),ErrorEnum.LOGIN_ERROR.getMessage(),null));
        return Result.error(ErrorEnum.LOGIN_ERROR.getCode(),ErrorEnum.LOGIN_ERROR.getMessage(),null);
    }
}
