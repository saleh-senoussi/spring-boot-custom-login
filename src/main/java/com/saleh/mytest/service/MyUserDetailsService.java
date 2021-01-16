package com.saleh.mytest.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.saleh.mytest.model.MyUserDetails;
import com.saleh.mytest.model.Role;
import com.saleh.mytest.model.User;
import com.saleh.mytest.repository.RoleRepository;
import com.saleh.mytest.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository; 
	
	public MyUserDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository=userRepository;
		this.roleRepository=roleRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user==null) {
			throw new UsernameNotFoundException("Cannot find username: "+username);
		}
		List<Role> roles = this.roleRepository.findByUsername(username);
		return new MyUserDetails(user, roles);
	}

}
