package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: Lanny
 * @Date: 2019/9/11
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UserMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
