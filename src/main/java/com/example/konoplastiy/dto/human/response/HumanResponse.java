package com.example.konoplastiy.dto.human.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HumanResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
