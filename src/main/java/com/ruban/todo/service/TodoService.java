package com.ruban.todo.service;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.TodoDto;
import com.ruban.todo.entity.Todo;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;


public interface TodoService {
    ResponseEntity<ApiResponseDto<Todo>> createTodo(TodoDto todoDto);

    ResponseEntity<ApiResponseDto<Todo>> updateTodo(TodoDto todoDto);

    ResponseEntity<ApiResponseDto<Todo>> getTodo(Long todoId);

    ResponseEntity<ApiResponseDto<Todo>> getAllTodo(Pageable pageable);
}
