package com.example;

import com.example.beans.PersonSerialization;

public class CopyUsingSerialization {
    public static void main(String[] args) {
        PersonSerialization original = new PersonSerialization("John", 30);
        PersonSerialization clone = original.deepClone();
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
        System.out.println("Change age in original object to 70 and name to Jane");
        original.setName("Jane");
        original.setAge(70);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
    }
}
