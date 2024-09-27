package com.example.userscrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.userscrud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "SELECT * FROM user WHERE email = ?1", nativeQuery = true)
	  User findByEmailAddress(String emailAddress);
	
	@Query(value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
	  List<User> findByName(String name);


	@Query(value = "DELETE FROM user WHERE email = :email", nativeQuery = true)
	User deleteByEmail(String email);
}
