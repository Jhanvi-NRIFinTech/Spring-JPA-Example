package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootJpaexampleApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		//adding a user
//		User user = new User();
//		user.setName("Sheldon");
//		user.setCity("Texas");
//		user.setStatus("Physisyst");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
	
		
	    //Saving multiple users
//		User user1 = new User();
//		user1.setName("Leonard");
//		user1.setCity("New York");
//		user1.setStatus("Experimentalist");
//		
//		User user2 = new User();
//		user2.setName("Howard");
//		user2.setCity("MIT");
//		user2.setStatus("Engineer");
//		
//		List<User> users= List.of(user1,user2);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		
		//updating the user of id 52
//		Optional<User> optional = userRepository.findById(52);
//		User user = optional.get();
//		System.out.println(user);
//		user.setName("Leonard Hofstater");
//		User res = userRepository.save(user);
//		System.out.println(res);
		
		
		//deleting
//		userRepository.deleteById(53);
//		System.out.println("Deleted");
		
//		List<User> users =userRepository.findByName("Sheldon");
//		users.forEach(user->{
//			System.out.println(user);
//		});
		
//		List<User> allUser =userRepository.getAllUser();
//		allUser.forEach(user->{
//			System.out.println(user);
//		});
		
		List<User> allUser =userRepository.getByName("Sheldon");
		allUser.forEach(user->{
			System.out.println(user);
		});
	}

}
