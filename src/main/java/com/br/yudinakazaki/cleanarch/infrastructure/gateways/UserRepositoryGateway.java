package com.br.yudinakazaki.cleanarch.infrastructure.gateways;

import com.br.yudinakazaki.cleanarch.application.gateways.UserGateway;
import com.br.yudinakazaki.cleanarch.domain.entity.User;
import com.br.yudinakazaki.cleanarch.infrastructure.persistence.UserEntity;
import com.br.yudinakazaki.cleanarch.infrastructure.persistence.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserRepositoryGateway implements UserGateway {
  private final UserRepository userRepository;
  private final UserEntityMapper userEntityMapper;

  @Override
  public User createUser(User userDomainObj) {
    UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
    UserEntity savedObj = userRepository.save(userEntity);
    return userEntityMapper.toDomainObj(savedObj);
  }

}
