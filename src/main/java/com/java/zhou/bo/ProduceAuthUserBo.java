package com.java.zhou.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Name: ProduceAuthUser
 * @Function: TODO
 * @Author: JavaZhou
 * @Date: 2026/2/2 16:37
 * @Version 1.0
 **/
@Data
public class ProduceAuthUserBo {
    private String userName;
    private String passWord;
    private String auth;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date date;
    private String recordStatus;
}
