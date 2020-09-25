package com.citisecurity;

import org.springframework.context.annotation.Bean; 
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Bean
	public UserDetailsService userService() {
		return new UserDetailsServiceImpl();
	}

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.authorizeRequests()
		.antMatchers("/hellouser").hasAnyRole("USER", "ADMIN")
		.antMatchers("/helloadmin").hasRole("ADMIN")
		.antMatchers("helloall").permitAll()
		.and().formLogin();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
		
		authenticationManagerBuilder.userDetailsService(userService());
		
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		
//		authenticationManagerBuilder.inMemoryAuthentication()
//		.withUser("user_bansal").password(encoder.encode("password_bansal")).roles("USER")
//		.and()
//		.withUser("user_hello").password(encoder.encode("password_hello")).roles("ADMIN");
	}
	
}
