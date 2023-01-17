package com.example.konoplastiy.service;

import com.example.konoplastiy.entity.Human;
import com.example.konoplastiy.repository.PeopleRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;


@Service
@Log4j2
public class PeopleService {

    private PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public int getAge(LocalDate birthDate, LocalDate currentDate) {
        return  Period.between(birthDate,currentDate).getYears();
    }
    public Human getPeopleById(long id) {
        return peopleRepository.findById(id).orElseThrow(() -> new RuntimeException("Human not found by Id " + id));
    }
}
