/**
 * 
 */
package com.rockcor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rockcor.model.User;
import com.rockcor.repository.IUserRepository;

/**
 * @author ricardodelgadocarreno
 *
 */
@Service
public class UserServiceImpl implements IUserService<User>, UserDetailsService{
	
	@Autowired
	private IUserRepository _userRepository;

	@Override
	public User save(User user) {
		return _userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = _userRepository.findByUsername(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), roles);
		
		return userDetails;
	}

}
