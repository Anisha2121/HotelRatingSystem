package com.proj.user.service.UserService.services;

import com.proj.user.service.UserService.entities.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    // we will create user operations.

    List<UserEntity> getAllUsers();
    UserEntity getUser(Integer userId);
    void saveOrUpdateUser (UserEntity user);
    void deleteUser (UserEntity userEntity);
}
