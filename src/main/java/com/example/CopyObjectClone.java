package com.example;

import com.example.beans.PersonClone;

public class CopyObjectClone {
    public static void main(String[] args) {
        try {
            PersonClone original = new PersonClone("John", 30);
            PersonClone clone = (PersonClone)original.clone();
            System.out.println("original = " + original);
            System.out.println("clone    = " + clone);
            System.out.println("Change age in original object to 70 and name to Jane");
            original.setName("Jane");
            original.setAge(70);
            System.out.println("original = " + original);
            System.out.println("clone    = " + clone);
        } catch (CloneNotSupportedException var3) {
            var3.printStackTrace();
        }

    }
}
