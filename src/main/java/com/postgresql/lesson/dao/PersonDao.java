package com.postgresql.lesson.dao;

import com.postgresql.lesson.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}
