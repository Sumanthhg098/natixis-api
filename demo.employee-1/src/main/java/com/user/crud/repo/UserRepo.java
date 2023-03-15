package com.user.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.crud.model.User;

public interface UserRepo extends JpaRepository<User, String> {

	

}
