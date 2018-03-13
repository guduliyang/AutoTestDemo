package com.autotest.service;

import com.autotest.dao.UserDao;
import com.autotest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String login(User user) {
        User user1 = userDao.findOne(user.getId());
        if (user.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword())){
            return "success";
        }else {
            return "false";
        }
    }
}
