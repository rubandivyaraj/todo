package com.ruban.todo.util;

import lombok.Getter;

@Getter
public enum TodoStatus {
    PENDING("pending"),
    IN_PROGRESS("in-progress" ),
    COMPLETED("completed" ),
    DEFERRED("deferred");

    private final String status;

    TodoStatus(String status) {
        this.status = status;
    }

}
