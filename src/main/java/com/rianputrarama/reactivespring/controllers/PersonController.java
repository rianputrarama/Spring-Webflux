package com.rianputrarama.reactivespring.controllers;

import com.rianputrarama.reactivespring.model.entities.Person;
import com.rianputrarama.reactivespring.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/api")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/{name}")
    public Mono<Person> getOne(@PathVariable String name) {
        return personRepository.findByName(name);
    }
}
