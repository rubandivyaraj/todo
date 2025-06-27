package com.ruban.todo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@MappedSuperclass
@ToString
@Builder
public class UserDetail extends DefaultTimeStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private boolean userLoggedIn;
    private LocalDateTime LastLoggedIn;
}
