package com.saleh.mytest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleh.mytest.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	List<Role> findByUsername(String username);
}
