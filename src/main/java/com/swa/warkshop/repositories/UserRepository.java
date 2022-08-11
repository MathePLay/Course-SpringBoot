package com.swa.warkshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.warkshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
