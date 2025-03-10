package com.example.serst_api_mysql.repository;

import com.example.serst_api_mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
