package com.bjsxt.test;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Lanny
 * @Date: 2019/9/11
 * @Description: com.bjsxt.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class Manager {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        Users user = new  Users();
        user.setUserage(20);
        user.setUsername("张三");
        userMapper.insertUser(user);
        System.out.println();
    }
}
