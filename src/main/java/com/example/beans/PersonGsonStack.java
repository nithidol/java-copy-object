package com.example.beans;

import java.util.List;
import lombok.Generated;

public class PersonGsonStack {
    private String name;
    private int age;
    private List<PersonGsonStack> details;

    public PersonGsonStack(String name, int age) {
        this.name = name;
        this.age = age;
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
    public List<PersonGsonStack> getDetails() {
        return this.details;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setAge(int age) {
        this.age = age;
    }

    @Generated
    public void setDetails(List<PersonGsonStack> details) {
        this.details = details;
    }
}
