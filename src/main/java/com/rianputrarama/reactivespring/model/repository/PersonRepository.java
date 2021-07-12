package com.rianputrarama.reactivespring.model.repository;

import com.rianputrarama.reactivespring.model.entities.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long>{
    Mono<Person> findByName(String name);
}
