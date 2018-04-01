package com.adempiere.bysj.controller;

import com.adempiere.bysj.tools.HandleSession;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by wm on 2018/4/1.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

//    @RequestMapping(method = {RequestMethod.GET})
//    public String getLogin() {
//        return "login";
//    }

    @RequestMapping(method = {RequestMethod.POST})
    public String doLogin(@RequestParam("name") String username,
                          @RequestParam("password") String password,
                          HttpSession session) {

        if (StringUtils.equals(username, "root") && StringUtils.equals(password, "123")) {
            session.setAttribute(username, true);
            HandleSession.setUsername(username);
            return "redirect:/order1.html";
        }
//        List<User> userList = userRepository.findAll();
//        for (User item : userList) {
//            if(item.getName().equals(username)&& item.getPassword().equals(password)){
//                session.setAttribute(username,true);
//                HandleSession.setUsername(username);
//                return "redirect:/apiManage/index/" + username;
//            }
//        }
        return "error";
    }


}
