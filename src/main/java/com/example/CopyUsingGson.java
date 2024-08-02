package com.example;

import com.example.beans.PersonGson;
import com.google.gson.Gson;

public class CopyUsingGson {
    public static void main(String[] args) {
        PersonGson original = new PersonGson("John", 30);
        Gson gson = new Gson();
        String originalJson = gson.toJson(original);
        PersonGson clone = (PersonGson)gson.fromJson(originalJson, PersonGson.class);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
        System.out.println("Change age in original object to 70 and name to Jane");
        original.setName("Jane");
        original.setAge(70);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
        System.out.println("Change age in clone object to 35 and name to Jack");
        clone.setName("Jack");
        clone.setAge(35);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
    }
}
