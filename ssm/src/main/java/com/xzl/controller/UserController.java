package com.xzl.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.xzl.pojo.User;  
import com.xzl.service.IUserService;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        logger.debug("查询成功，id=【{}】",userId);
        logger.info("查询成功，id2=【{}】",userId);
        model.addAttribute("user", user);  
        return "showUser";
    }  
}  
