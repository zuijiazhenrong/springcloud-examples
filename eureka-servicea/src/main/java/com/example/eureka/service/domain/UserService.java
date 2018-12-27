package com.example.eureka.service.domain;


import com.example.eureka.service.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Service
public class UserService {

	

	
	public List<User> searchAll(){

		User user = new User();
		User user1 = new User();
		user.setUsername("张三");
		user1.setUsername("李四");
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);
		return list;
	}
}
