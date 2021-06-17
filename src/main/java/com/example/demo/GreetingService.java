package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private GreetingRepository greetingRepository;

	
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty())? "hello World"	: user.toString());	
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
