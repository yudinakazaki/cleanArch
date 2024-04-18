package com.br.yudinakazaki.cleanarch.application.gateways;

import com.br.yudinakazaki.cleanarch.domain.entity.User;

public interface UserGateway {
  User createUser(User user);
}
