package com.zz.newbuy.modules.user.controller;

import org.springframework.web.bind.annotation.*;

import com.zz.newbuy.modules.security.dto.LoginRequest;
import com.zz.newbuy.modules.security.dto.LoginResponse;

@RestController
@RequestMapping(value = "/users/")
public class UserController {

	@RequestMapping(value = "/{username}", method = RequestMethod.GET, consumes = "application/json")
	public String getUser(@PathVariable String username, @RequestParam(name="pwd") String pwd) {
		return "Welcome," + username + "pwd is " + pwd;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public LoginResponse login(LoginRequest loginRequest) {
		return new LoginResponse();
	}
}