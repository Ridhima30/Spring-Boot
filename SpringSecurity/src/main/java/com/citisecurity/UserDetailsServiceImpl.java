package com.citisecurity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		System.out.println("Inside loadUserByUsername: "+username);
		
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		UserBuilder ub=null;
		
		if(username.equals("citiuser")) {
			ub=User.withUsername("citiuser");
			ub.password(encoder.encode("citi123"))
			.roles("USER");
		}
		else if(username.equals("citiadmin")) {
			ub=User.withUsername("citiadmin");
			ub.password(encoder.encode("admin123"))
			.roles("ADMIN");
		}
		else {
			throw new UsernameNotFoundException(username);
		}
		
		return ub.build();
	}
}
