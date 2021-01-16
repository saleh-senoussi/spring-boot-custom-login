package com.saleh.mytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleh.mytest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
