package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author stshen
 * @date 2017年2月23日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("showUser")
	public ModelAndView toIndex(HttpServletRequest request,HttpServletResponse response){
	
		return new ModelAndView("user/showUser");
	}
}
