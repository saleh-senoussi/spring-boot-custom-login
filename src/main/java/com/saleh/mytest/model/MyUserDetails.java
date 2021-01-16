package com.saleh.mytest.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
	private User user;
	private List<Role> roles;
	
	public MyUserDetails(User user, List<Role> roles) {
		super();
		this.user=user;
		this.roles=roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if (roles==null) {
			return Collections.emptySet();
		}
		Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
		roles.forEach(role ->{
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
		});
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
