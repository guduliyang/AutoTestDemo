package com.autotest.view;

import com.autotest.entity.User;
import com.autotest.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class MainController {
    private Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    private UserService service;
    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(HttpServletRequest request){
        User user = new User();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setId(1);
        user.setUsername(username);
        user.setPassword(password);
        if(service.login(user).equals("success")){
            return "{\"success\":true,\"message\":\"login success\"}";
        }else {
            return "{\"success\":false,\"message\":\"账号或密码错误\"}";
        }
    }
}
