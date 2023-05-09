package com.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{

	UserModel findByEmail(String email);
}
