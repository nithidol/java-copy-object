package com.example;

import com.example.beans.PersonGson;
import com.example.beans.PersonGsonStack;
import com.google.gson.Gson;

import java.util.ArrayList;

public class CopyUsingGsonStack {
    public static void main(String[] args) {
        PersonGsonStack original = new PersonGsonStack("John", 30);
        original.setDetails(new ArrayList());
        original.getDetails().add(original);
        Gson gson = new Gson();
        String originalJson = gson.toJson(original);
        PersonGson clone = (PersonGson)gson.fromJson(originalJson, PersonGson.class);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
    }
}
