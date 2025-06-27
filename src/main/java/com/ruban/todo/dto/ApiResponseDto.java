package com.ruban.todo.dto;

import java.time.LocalDateTime;

public record ApiResponseDto<T>(LocalDateTime respondedTime, String message, T data) {
}
