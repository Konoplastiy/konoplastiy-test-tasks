package com.example.konoplastiy.mapper;

import com.example.konoplastiy.dto.human.response.HumanResponse;
import com.example.konoplastiy.entity.Human;
import org.springframework.stereotype.Component;

@Component
public class HumanMapper {

    public HumanResponse toDto(Human human, Integer age) {

        HumanResponse humanResponse = new HumanResponse();
        humanResponse.setId(human.getId());
        humanResponse.setFirstName(human.getFirstName());
        humanResponse.setLastName(human.getLastName());
        humanResponse.setAge(age);
        return humanResponse;
    }
}
