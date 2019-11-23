package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.CustomerEmiDetails;
import com.demo.entity.CustomerProfile;
import com.demo.repository.MainRepository;
import com.demo.service.MainService;
import java.util.*;

@Controller
public class MainController {
	
	@Autowired
	MainRepository mainrepo;
	
	@Autowired
	MainService service;
	
	@RequestMapping(path="dashbord.lti",method=RequestMethod.POST)
	String dashview(HttpServletRequest request,Map model)
	{
        List<CustomerProfile>list = service.GetEmiDetails();
        model.put("li",list);
		return "dashboard.jsp";
		
	}

}
