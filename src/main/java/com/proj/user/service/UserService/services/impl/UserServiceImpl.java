package com.proj.user.service.UserService.services.impl;

import com.proj.user.service.UserService.entities.UserEntity;
import com.proj.user.service.UserService.exception.ResourceNotFoundException;
import com.proj.user.service.UserService.payload.ApiResponses;
import com.proj.user.service.UserService.repositories.UserRepository;
import com.proj.user.service.UserService.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException());
    }

    @Override
    public void saveOrUpdateUser(UserEntity user) {
        try {
            userRepository.saveAndFlush(user);
        }
        catch(Exception e)
        {
            System.out.println("some exception occured while saveorupdate.");
            throw new HttpServerErrorException(HttpStatusCode.valueOf(500));
        }
    }

    @Override
    public void deleteUser(UserEntity userEntity)
    {
        try {
            userRepository.delete(userEntity);
        }
        catch(Exception ex)
        {
            System.out.println("exception occurred while deleting.");
           throw new HttpServerErrorException(HttpStatusCode.valueOf(500));
        }
    }
}
