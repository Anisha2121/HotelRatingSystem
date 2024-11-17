package com.proj.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer userId;

    @Column(name="name", length = 20)
    private String name;

    @Column(name="mail")
    private String email;

    @Column(name="about")
    private String about;


}
