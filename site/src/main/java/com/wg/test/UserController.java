package com.wg.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wg.bean.User;
import com.wg.service.UserService;



@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public ModelAndView regist(HttpServletRequest request, User user) {
		try {
			List<User> list = userService.getUsers();
			request.setAttribute("list", list);
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("succ");
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login(String username, String password) {
		if (this.checkParams(new String[] { username, password })) {
			ModelAndView mav = new ModelAndView("succ");
			mav.addObject("username", username);
			mav.addObject("password", password);
			System.out
					.println("username=" + username + " password=" + password);
			return mav;
		}
		return new ModelAndView("login");
	}

	/***
	 * 
	 * @param params
	 * @return
	 */
	private boolean checkParams(String[] params) {
		for (String param : params) {
			if (param == "" || param == null || param.isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
}