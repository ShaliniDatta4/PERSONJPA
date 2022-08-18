package com.person.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private static final String[] SWAGGER_AUTH_WHITELIST_V2 = { 
			"/v2/api-docs",
			"/configuration/ui",
			"/swagger-resources/**",
			"/configuration/security",
			"/swagger-ui/**",
			"/swagger-ui**",
			"/webjars/**" };

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers(SWAGGER_AUTH_WHITELIST_V2).permitAll()
		.antMatchers("/health").permitAll()
		.anyRequest().fullyAuthenticated()
		.and()
		.httpBasic();
	}


}
