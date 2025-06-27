package com.ruban.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@RequiredArgsConstructor
@MappedSuperclass
@ToString
public class Category extends DefaultTimeStamp{
    @Id
    private Long categoryId;
    private String categoryName;
}
