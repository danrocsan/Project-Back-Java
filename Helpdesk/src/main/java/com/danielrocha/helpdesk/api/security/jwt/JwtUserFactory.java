//converte nosso usuario para um usuario conhecido no sppring security
package com.danielrocha.helpdesk.api.security.jwt;

import com.danielrocha.helpdesk.api.entity.User;

public class JwtUserFactory {
	
	private JwtUserFactory() {
		
	}
	
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), mapToGrantedAuthorities(user.getProfile());
	}

}
