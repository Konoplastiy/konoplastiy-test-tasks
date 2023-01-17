package com.example.konoplastiy.repository;

import com.example.konoplastiy.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Human, Long> {
}
