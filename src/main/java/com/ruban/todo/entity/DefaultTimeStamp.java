package com.ruban.todo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DefaultTimeStamp {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
