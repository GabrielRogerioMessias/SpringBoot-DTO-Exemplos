package com.gabriel.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.dto.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
