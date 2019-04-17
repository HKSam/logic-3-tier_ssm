package com.sms.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.model.UserInfo;
import com.sms.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserInfoController {

	@Autowired
	private UserInfoService service;

	@RequestMapping(value={"/","/login"},method = RequestMethod.GET)
	protected String login() {
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	protected String login(HttpServletRequest request, Model model) {
		
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		
		UserInfo user = this.service.login(username, pwd);
		
		if(user==null)
		{
			model.addAttribute("msg", "用户名或者密码错误");
			return "/login";
		}
		else{
			request.getSession().setAttribute("user", user);
			return "redirect:/klass/list";
		}
		
	}

}
