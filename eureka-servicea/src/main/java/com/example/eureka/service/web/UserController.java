package com.example.eureka.service.web;


import com.example.eureka.service.domain.UserService;
import com.example.eureka.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class UserController {

	
	@RequestMapping(value="/getInfo",method=RequestMethod.GET)
	public String readUserInfo(){

		return "result is : "+System.currentTimeMillis();
	}

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String  hello(){
		return "hello";
	}
}
