package com.rockcor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rockcor.model.User;
import com.rockcor.service.IUserService;

@SpringBootTest
class SpringDataJpaApplicationTests {
	
	@Autowired
	private IUserService<User> _userService;
	
	@Autowired
	private BCryptPasswordEncoder _encoder;

	@Test
	void createUserTest() {
		User user = new User("Lilly", _encoder.encode("Lilly"));
		
		User returned = _userService.save(user);
		
		assertThat(returned.getPassword().equals(user.getPassword()));
	}
		

}
