package com.bidv.rest.webservices.restfullwebservices.jwt;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;
import com.bidv.rest.webservices.restfullwebservices.service.UserService;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserService service;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity user = service.findByUsername(username);
		if(user == null) {

            throw new UsernameNotFoundException(String.format("User not found '%s'", username));
		}
			Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
			grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
		
		
		
		return new JwtUserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getRole());
		
	}

}
