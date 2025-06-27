package com.ruban.todo.service;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<ApiResponseDto<String>> createUser(UserDto userDto);
}
