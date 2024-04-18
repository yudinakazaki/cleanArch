package com.br.yudinakazaki.cleanarch.infrastructure.gateways;

import com.br.yudinakazaki.cleanarch.domain.entity.User;
import com.br.yudinakazaki.cleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
  UserEntity toEntity(User userDomainObj) {
    return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
  }

  User toDomainObj(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
  }
}
