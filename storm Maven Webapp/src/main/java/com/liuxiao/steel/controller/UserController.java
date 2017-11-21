package com.liuxiao.steel.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.liuxiao.steel.pojo.User;
import com.liuxiao.steel.service.IUserService;



@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		model.addAttribute("msg", JSON.toJSONString(user));
		return "showUser";
	}
	
	@RequestMapping("regist")  
    public String regist(User user,Model model){  
          
        System.out.println("用户注册："+user.getUserName()+user.getPassword());  
          
        //user.setId(1);  
        userService.regist(user);  
          
        model.addAttribute("msg", "注册成功");  
        //注册成功后跳转success.jsp页面  
        return "success";  
    }  
      
    @RequestMapping("login")  
    public String login(User user,Model model){  
          
        System.out.println("用户登录："+user.getUserName()+user.getPassword());  
          
        /*Map<String, String> map=new LinkedHashMap<String,String>(); 
         
        map.put("name", user.getName()); 
        map.put("password", user.getPassword());*/  
          
        String msg = userService.login(user);  
          
        model.addAttribute("msg", "登录"+msg);  
          
        return "success";  
    } 
}
