package com.example.diff.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinationPerson {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "DestinationPerson{name='" + name + "', age=" + age + "}";
    }
}
