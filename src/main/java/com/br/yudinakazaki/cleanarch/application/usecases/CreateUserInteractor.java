package com.br.yudinakazaki.cleanarch.application.usecases;

import com.br.yudinakazaki.cleanarch.application.gateways.UserGateway;
import com.br.yudinakazaki.cleanarch.domain.entity.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateUserInteractor {
  private UserGateway userGateway;

  public User createUser(User user) {
    return userGateway.createUser(user);
  }
}
