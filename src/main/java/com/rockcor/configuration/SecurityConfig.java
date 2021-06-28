/**
 * 
 */
package com.rockcor.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rockcor.model.User;
import com.rockcor.service.IUserService;
import com.rockcor.service.UserServiceImpl;

/**
 * @author ricardodelgadocarreno
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserServiceImpl _userService;
	
	@Autowired
	private BCryptPasswordEncoder _encoder;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Este método reemplaza la autenticación, en vez de usar las credenciales en
		// application.properties
		auth.userDetailsService(_userService).passwordEncoder(_encoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Con este método se garantiza que cualquier petición debe estar autenticada
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}

}
