package less02.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import less02.mvc.service.MyService;

@Controller
public class MyController {
	@Autowired
	MyService myservice;
	public void service(String sql){
		System.out.println(myservice.query(sql));
	}
}
