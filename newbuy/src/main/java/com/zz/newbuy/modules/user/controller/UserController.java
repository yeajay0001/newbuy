package com.zz.newbuy.modules.user.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/")
public class UserController {

	@RequestMapping(value = "/{username}", method = RequestMethod.GET, consumes = "application/json")
	public String getUser(@PathVariable String username, @RequestParam(name="pwd") String pwd) {
		return "Welcome," + username + "pwd is " + pwd;
	}
}