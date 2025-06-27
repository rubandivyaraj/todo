package com.ruban.todo.service;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.UserDto;
import com.ruban.todo.entity.UserDetail;
import com.ruban.todo.repository.UserDetailRepository;
import lombok.AccessLevel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class UserServiceImpl implements UserService {

    @lombok.Setter(AccessLevel.PRIVATE)
    private UserDetailRepository userDetailRepository;

    @Override
    public ResponseEntity<ApiResponseDto<String>> createUser(UserDto userDto) {
        UserDetail userDetail = UserDetail.builder().userName(userDto.userName()).build();
        userDetailRepository.saveAndFlush(userDetail);
       return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponseDto<String>(LocalDateTime.now(), HttpStatus.CREATED.toString(),"User registered successfully"));
    }
}
