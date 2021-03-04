package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User selectUser(long userId) {
        System.out.println(userId);
        return userDao.selectUser(userId);
    }
}
