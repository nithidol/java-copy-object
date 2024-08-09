package com.example.diff;

import com.example.diff.beans.DestinationPerson;
import com.example.diff.beans.SourcePerson;

import java.lang.reflect.Field;

public class ReflectionCopy {
    public static void main(String[] args) throws IllegalAccessException {
        SourcePerson source = new SourcePerson("John", 30);
        DestinationPerson destination = new DestinationPerson();

        for (Field field : source.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Field destField;
            try {
                destField = destination.getClass().getDeclaredField(field.getName());
                destField.setAccessible(true);
                destField.set(destination, field.get(source));
            } catch (NoSuchFieldException e) {
                // Field does not exist in destination, skip it
            }
        }
        source.setName("Jane");
        source.setAge(40);
        System.out.println(destination);
    }
}
