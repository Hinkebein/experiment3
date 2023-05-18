package com.hnust.mapper;

import com.hnust.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    //用户登录
    public User login(User user);
}




