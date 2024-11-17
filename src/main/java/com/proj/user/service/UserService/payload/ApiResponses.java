package com.proj.user.service.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponses {
    private String message;
    private boolean success;
    private HttpStatus status;
}
