package com.example.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.beans.ResultJSON;
import com.example.notes.beans.User;
import com.example.notes.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public ResultJSON hello(@RequestBody User user) {
		ResultJSON resultJSON = new ResultJSON();
		try {
			User save = userService.save(user);
			resultJSON.setObj(save);
			resultJSON.setSuccess(true);
			resultJSON.setMsg("成功了");
		}
		catch (Exception e) {
			resultJSON.setMsg(e.getMessage());
		}

		return resultJSON;
	}
}
