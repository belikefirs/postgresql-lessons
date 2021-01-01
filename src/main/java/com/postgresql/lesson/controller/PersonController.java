package com.postgresql.lesson.controller;

import com.postgresql.lesson.dao.PersonDao;
import com.postgresql.lesson.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonDao personDao;

    @GetMapping()
    public List<Person> findAll() {
        return personDao.findAll();
    }

}
