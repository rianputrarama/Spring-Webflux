package com.rianputrarama.reactivespring.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(value = "person")
public class Person {

    @Id
    private Long id;
    private String name;
    private int age;

}
