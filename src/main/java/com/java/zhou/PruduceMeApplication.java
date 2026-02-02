package com.java.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.java.zhou.Dao")
public class PruduceMeApplication {
    public static void main(String[] args) {SpringApplication.run(PruduceMeApplication.class, args);}
}
