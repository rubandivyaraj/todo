package com.ruban.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@RequiredArgsConstructor
@MappedSuperclass
@ToString
public class TodoCategory extends DefaultTimeStamp {

    private Long todoId;
    private Long categoryId;
}
