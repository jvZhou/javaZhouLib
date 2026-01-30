package com.java.zhou.Controller;

import com.java.zhou.Common.Result;
import com.java.zhou.Service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/proDuce")
public class LoginController {
   @Autowired
   LoginService loginService;
   @RequestMapping("/login")
   public Result login(String username, String password){
      Result name = loginService.login();
      System.out.println(name);
      return null;
   }
}
