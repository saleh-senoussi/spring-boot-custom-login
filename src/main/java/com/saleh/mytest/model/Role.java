package com.saleh.mytest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="role", nullable=false)
	private String role;
	
	public Role() {
		
	}
	
	public Role(long roleId, String username, String role) {
		this.roleId=roleId;
		this.username=username;
		this.role=role;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
