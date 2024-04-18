package com.br.yudinakazaki.cleanarch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.yudinakazaki.cleanarch.model.User;
import com.br.yudinakazaki.cleanarch.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User create(User user) {
    return userRepository.save(user);
  }

  public User update(User user) {
    return userRepository.save(user);
  }

  public List<User> delete(Long id) {
    userRepository.deleteById(id);
    return findAll();
  }
}
