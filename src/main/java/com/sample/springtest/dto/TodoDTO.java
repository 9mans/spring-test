package com.sample.springtest.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Long tno;
    @NotEmpty
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    @NotEmpty
    private String writer;

}
