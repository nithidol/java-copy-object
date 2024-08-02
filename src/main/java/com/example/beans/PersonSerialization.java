package com.example.beans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lombok.Generated;

public class PersonSerialization implements Serializable {
    private String name;
    private int age;

    public PersonSerialization(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonSerialization deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);
            return (PersonSerialization)in.readObject();
        } catch (ClassNotFoundException | IOException var5) {
            var5.printStackTrace();
            return null;
        }
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
