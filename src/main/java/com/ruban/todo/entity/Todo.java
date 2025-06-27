package com.ruban.todo.entity;

import com.ruban.todo.util.TodoStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString
@Builder
public class Todo extends DefaultTimeStamp{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long todoId;
    private Long userId;
    private String todoName;
    private String todoDescription;
    private LocalDateTime fromDate;
    private LocalDateTime actualFromDate;
    private LocalDateTime thruDate;
    private LocalDateTime actualThruDate;
    private TodoStatus status;

}
