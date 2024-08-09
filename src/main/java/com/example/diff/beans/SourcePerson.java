package com.example.diff.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SourcePerson {
    private String name;
    private int age;

    public SourcePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
