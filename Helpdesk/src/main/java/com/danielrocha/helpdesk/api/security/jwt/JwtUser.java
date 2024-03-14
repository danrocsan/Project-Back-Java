// o spring security depede de um usuario que implemente a interface e userdetail ele controla quem esta no aut no sistema
package com.danielrocha.helpdesk.api.security.jwt;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1158499428690505871L;
	
	private final String id;
	private final String username;
	private final String password;
	private final Collection<? extends GrantedAuthority> authorities;
	public JwtUser(String id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}
	
	@JsonIgnore
	public String getId() {
		return id;
	}
	
	@Override
	public String getUsername() {
		return username;
		
	}
	
	@JsonIgnore
	@Override
	public boolena isAccountNonExpired() {
		return true;
	}
	
	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		
	}
	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return authorities;
	}
	
	@Override
	public boolean isEnable() {
		return true;
	}
	
	

}
