package com.ruban.todo.service;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.TodoDto;
import com.ruban.todo.entity.Todo;
import com.ruban.todo.repository.TodoRepository;
import lombok.AccessLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;


public class TodoServiceImpl implements TodoService {
    @lombok.Setter(AccessLevel.PRIVATE)
    private TodoRepository todoRepository;

    @Override
    public ResponseEntity<ApiResponseDto<Todo>> createTodo(TodoDto todoDto) {
        Todo newTodo = Todo.builder().todoName(todoDto.todoName())
                .todoDescription(todoDto.todoDescription()).build();
        Todo todo = this.todoRepository.saveAndFlush(newTodo);
        ApiResponseDto<Todo> apiResponseDto = new ApiResponseDto<>(LocalDateTime.now(), "Successfully Created", todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponseDto);
    }

    @Override
    public ResponseEntity<ApiResponseDto<Todo>> updateTodo(TodoDto todoDto) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseDto<Todo>> getTodo(Long todoId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseDto<Todo>> getAllTodo(Pageable pageable) {
        return null;
    }
}
