package com.crud.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/*
 * ssm中使用session
 */

@Controller
@SessionAttributes("Save")
public class SessionController {
	
	@RequestMapping("save")
	public String save(Integer save, ModelMap modelMap) {
		modelMap.addAttribute("Save", save);
		return "save";
	}
	
	@RequestMapping("get")
	public String get(@ModelAttribute("Save") Integer save, ModelMap modelMap) {
		System.out.println("save:"+save);
		return "get";
	}
	
/*	@RequestMapping("login")
	public String Login(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception{
		
		String uname = httpServletRequest.getParameter("uname");
		String password = httpServletRequest.getParameter("password");
		User user = userService.findUserByName(uname);
		
		if(user.getPassword().equals(password)
				&&user.getUname().equals(uname)) {
			//存进session
			httpServletRequest.getSession().setAttribute("currentUser", user);
			
			return "redirect:/types";
		}else {
			httpServletRequest.setAttribute("errorInfo", "用户名或者密码错误");
			return "login";
		}
	}
	*/
	
	
}
