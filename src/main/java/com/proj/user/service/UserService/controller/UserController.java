package com.proj.user.service.UserService.controller;

import com.proj.user.service.UserService.entities.UserEntity;
import com.proj.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")

public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(path = "/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody UserEntity userEntity) {

            userService.saveOrUpdateUser(userEntity);

            return new ResponseEntity<>("Success", HttpStatus.OK);
        }



    @GetMapping(path = "/{userId}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Integer userId)
    {
       UserEntity user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }


    @GetMapping(path = "/get-all-users")
    public ResponseEntity<List<UserEntity>> getAllUsers()
    {
        List<UserEntity> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);

    }

    @DeleteMapping(path = "/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody UserEntity userId) {

        userService.deleteUser(userId);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}
