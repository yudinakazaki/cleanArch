package com.br.yudinakazaki.cleanarch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.yudinakazaki.cleanarch.model.User;
import com.br.yudinakazaki.cleanarch.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
  private UserService userService;

  @GetMapping
  List<User> findAll() {
    return userService.findAll();
  }

  @PostMapping
  User create(@RequestBody User user) {
    return userService.create(user);
  }

  @PutMapping
  User update(@RequestBody User user) {
    return userService.update(user);
  }

  @DeleteMapping("{id}")
  List<User> delete(@PathVariable("id") Long id) {
    return userService.delete(id);
  }
}
