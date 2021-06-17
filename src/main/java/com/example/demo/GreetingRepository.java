package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{

	Greeting save(Greeting greeting);
	
	List<User> list = new ArrayList<User>();
	

}
