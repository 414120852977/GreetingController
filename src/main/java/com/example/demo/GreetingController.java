package com.example.demo;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.spring.IGreetingService;
//import com.spring.User;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();

	
	@Autowired
	private IGreetingService greetingService;
	@GetMapping(value= {"", "/", "/home"})
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//		return new Greeting(counter.incrementAndGet(),
//				String.format(template, name));
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
}
	// uc2 using service layer
	
	
	
}
