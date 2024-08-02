package com.example;

import com.example.beans.PersonApacheCommonsLang;
import org.apache.commons.lang3.SerializationUtils;

public class CopyUsingApacheCommonsLang {
    public static void main(String[] args) {
        PersonApacheCommonsLang original = new PersonApacheCommonsLang("John", 30);
        PersonApacheCommonsLang clone = (PersonApacheCommonsLang) SerializationUtils.clone(original);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
        System.out.println("Change age in original object to 70 and name to Jane");
        original.setName("Jane");
        original.setAge(70);
        System.out.println("original = " + original);
        System.out.println("clone    = " + clone);
    }
}
