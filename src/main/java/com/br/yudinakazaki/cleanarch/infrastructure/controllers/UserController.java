package com.br.yudinakazaki.cleanarch.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.yudinakazaki.cleanarch.application.usecases.CreateUserInteractor;
import com.br.yudinakazaki.cleanarch.domain.entity.User;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {
  private final CreateUserInteractor createUserInteractor;
  private final UserDTOMapper userDTOMapper;

  @PostMapping
  CreateUserResponse create(@RequestBody CreateUserRequest request) {
    User userBusinessObj = userDTOMapper.toUser(request);
    User user = createUserInteractor.createUser(userBusinessObj);
    return userDTOMapper.toResponse(user);
  }
}
