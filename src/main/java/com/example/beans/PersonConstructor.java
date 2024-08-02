package com.example.beans;

import lombok.Generated;

public class PersonConstructor {
    private String name;
    private int age;

    public PersonConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonConstructor(PersonConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String toString() {
        return "Person{name='" + this.name + "', age=" + this.age + "}";
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public int getAge() {
        return this.age;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setAge(int age) {
        this.age = age;
    }
}
