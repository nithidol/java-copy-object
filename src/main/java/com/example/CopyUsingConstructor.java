package com.example;

import com.example.beans.PersonConstructor;

public class CopyUsingConstructor {
    public static void main(String[] args) {
        PersonConstructor original = new PersonConstructor("John", 30);
        PersonConstructor clone = new PersonConstructor(original);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
        System.out.println("Change age in original object to 70 and name to Jane");
        original.setName("Jane");
        original.setAge(70);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
    }
}
