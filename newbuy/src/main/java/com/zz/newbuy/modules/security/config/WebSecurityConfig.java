package com.zz.newbuy.modules.security.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
/*		http.cors().and().csrf().disable().authorizeRequests()
        .antMatchers(HttpMethod.POST, "/users/signup").permitAll()
        .anyRequest().authenticated()
        .and()
        .addFilter(new JWTLoginFilter(authenticationManager()))
        .addFilter(new JwtAuthenticationFilter(authenticationManager()));*/
	}
}
