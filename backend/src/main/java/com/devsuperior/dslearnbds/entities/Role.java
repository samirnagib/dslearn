package com.devsuperior.dslearnbds.entities;
	
public class Role {
	
	public Role(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	private Long id;
	private String authority;
	
	Public Role() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
