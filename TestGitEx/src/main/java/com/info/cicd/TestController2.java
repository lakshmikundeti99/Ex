package com.info.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	
	@GetMapping("/test3")
	public String getMsg() {
		return "Welcome cicd TestController2";
	}
	
	
	@GetMapping("/test2")
	public String getMsg1() {
		return "Welcome cicd TestController2 test2 end point";
	}
	
	@GetMapping("/test3")
	public String getMsg2() {
		return "Welcome cicd TestController2 test3 end point";
	}

}
