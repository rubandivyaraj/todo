package com.ruban.todo.controller;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.UserDto;
import com.ruban.todo.service.UserService;
import lombok.AccessLevel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @lombok.Setter(AccessLevel.PRIVATE)
    private UserService userService;

    @PostMapping(path = "/signup")
    public ResponseEntity<ApiResponseDto<String>> createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
