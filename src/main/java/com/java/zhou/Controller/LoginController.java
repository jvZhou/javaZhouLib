package com.java.zhou.Controller;

import com.java.zhou.Common.Result;
import com.java.zhou.Dto.LoginInDto;
import com.java.zhou.Service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/proDuce")
public class LoginController {
   @Autowired
   LoginService loginService;
   @PostMapping("/login")
   public Result login(@RequestBody LoginInDto loginInDto){
      Result resp = loginService.login(loginInDto);
      return resp;
   }
}
