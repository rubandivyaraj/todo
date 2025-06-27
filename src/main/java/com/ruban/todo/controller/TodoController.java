package com.ruban.todo.controller;

import com.ruban.todo.dto.ApiResponseDto;
import com.ruban.todo.dto.TodoDto;
import com.ruban.todo.entity.Todo;
import com.ruban.todo.service.TodoService;
import lombok.AccessLevel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @lombok.Setter(AccessLevel.PRIVATE)
    private TodoService todoService;

    public ResponseEntity<ApiResponseDto<Todo>> createTodo(@RequestBody TodoDto toDoDto) {

        return todoService.createTodo(toDoDto);
    }
}
