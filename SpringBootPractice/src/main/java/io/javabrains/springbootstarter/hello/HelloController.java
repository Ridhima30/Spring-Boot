package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//from Spring MVC
@RestController
public class HelloController {
	
	//url to be mapped is mentioned
	//there is no http method here, this mapping is only for a GET
	//for other methods, annotations need to be specified
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}
	
}
