package com.trigyn.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trigyn.authentication.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	List<User> findByUserNameAndPassword(String userName, String password);
}
