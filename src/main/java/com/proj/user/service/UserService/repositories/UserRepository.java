package com.proj.user.service.UserService.repositories;

import com.proj.user.service.UserService.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>
{
    //can create custom query.
}
