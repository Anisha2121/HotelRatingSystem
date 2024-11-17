package com.proj.user.service.UserService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException()
    {
        super("user not found");
    }
}
