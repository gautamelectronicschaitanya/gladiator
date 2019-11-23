package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.UserDetails;
import com.demo.repository.AdminRepository;
import com.demo.service.AdministratorService;

@Controller
public class ViewController {
	
	@Autowired
	AdministratorService service;
	
	@Autowired
	AdminRepository repo;


	@RequestMapping(path="register.lti",method=RequestMethod.POST)
	public String login(HttpServletRequest request, ModelMap model)
	//public String login(AdminDetails details)
	{
		String adminname=request.getParameter("adminName");
		String adminpass=request.getParameter("adminPassword");
		System.out.println(adminname);
		System.out.println(adminpass);
		boolean ans = service.LoginValidate(adminname,adminpass);
		System.out.println(ans);
		if(ans==true)
		{
			int userId = 123;
			List<UserDetails> uds = repo.fetchAllStatus();
			model.put("users", uds);
			return "Administrator.jsp";
		}
		else
		{
			return "Fail.jsp";
		}
		
	}
	}

