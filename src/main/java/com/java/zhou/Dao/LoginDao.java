package com.java.zhou.Dao;

import com.java.zhou.bo.ProduceAuthUserBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name: dao
 * @Function: TODO
 * @Author: JavaZhou
 * @Date: 2021/9/9 20:27
 * @Version 1.0
 **/
@Mapper
@Repository
public interface LoginDao {
    ProduceAuthUserBo findUser(String userName);
}
