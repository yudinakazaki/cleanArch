package com.br.yudinakazaki.cleanarch.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.yudinakazaki.cleanarch.application.gateways.UserGateway;
import com.br.yudinakazaki.cleanarch.application.usecases.CreateUserInteractor;
import com.br.yudinakazaki.cleanarch.infrastructure.controllers.UserDTOMapper;
import com.br.yudinakazaki.cleanarch.infrastructure.gateways.UserEntityMapper;
import com.br.yudinakazaki.cleanarch.infrastructure.gateways.UserRepositoryGateway;
import com.br.yudinakazaki.cleanarch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
  @Bean
  CreateUserInteractor createUserCase(UserGateway userGateway) {
    return new CreateUserInteractor(userGateway);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }
}
