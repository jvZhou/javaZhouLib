package com.java.zhou.Service.Impl;

import com.java.zhou.Common.Result;
import com.java.zhou.Consent.LoginConsent;
import com.java.zhou.Dao.LoginDao;
import com.java.zhou.Dto.LoginInDto;
import com.java.zhou.Enum.ErrorEnum;
import com.java.zhou.Enum.SuccessEnum;
import com.java.zhou.Service.LoginService;
import com.java.zhou.bo.ProduceAuthUserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public Result login(LoginInDto loginInDto) {
        ProduceAuthUserBo produceAuthUserBo=loginDao.findUser(loginInDto.getUserName());
        //管理员用户免密登录
        if (LoginConsent.ZERO.equals(produceAuthUserBo.getAuth())) {
            return Result.success(SuccessEnum.LOGIN_Ok.getCode(),SuccessEnum.LOGIN_Ok.getMessage(),null);
        }
        //TODO 用户登录密码明文存储，生产环境请使用密文存储
        if (LoginConsent.USER_NAME.equals(loginInDto.getUserName()) && LoginConsent.PASS_WORD.equals(loginInDto.getPassWord())){
            return Result.success(SuccessEnum.LOGIN_Ok.getCode(),SuccessEnum.LOGIN_Ok.getMessage(),null);
        }
        return Result.error(ErrorEnum.LOGIN_ERROR.getCode(),ErrorEnum.LOGIN_ERROR.getMessage(),null);
    }
}
