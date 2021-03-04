package com.ssm.dao;

import com.ssm.model.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    User selectUser(@Param("id") long id);
}
