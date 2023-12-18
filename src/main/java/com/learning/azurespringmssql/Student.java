package com.learning.azurespringmssql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
