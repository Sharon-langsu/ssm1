package com.ssm.service;

import com.ssm.model.User;
import org.springframework.stereotype.Service;


public interface IUserService {
   public User selectUser(long userId);
}
