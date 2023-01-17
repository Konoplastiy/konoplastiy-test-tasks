package com.example.konoplastiy.controller;

import com.example.konoplastiy.dto.human.response.HumanResponse;
import com.example.konoplastiy.entity.Human;
import com.example.konoplastiy.mapper.HumanMapper;
import com.example.konoplastiy.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/")
public class PeopleController {

    private PeopleService peopleService;
    private HumanMapper humanMapper;

    @Autowired
    public PeopleController(PeopleService peopleService, HumanMapper humanMapper) {
        this.peopleService = peopleService;
        this.humanMapper = humanMapper;
    }

    @GetMapping("/human/{id}")
    public HumanResponse getPeople(@PathVariable Long id) {
        Human humanById = peopleService.getPeopleById(id);
        int age = peopleService.getAge(humanById.getBirthday(), LocalDate.now());
        return humanMapper.toDto(humanById, age);
    }
}
