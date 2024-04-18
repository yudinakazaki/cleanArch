package com.br.yudinakazaki.cleanarch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yudinakazaki.cleanarch.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
