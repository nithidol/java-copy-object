package com.example.diff;

import com.example.diff.beans.DestinationPerson;
import com.example.diff.beans.SourcePerson;
import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilsCopy {
    public static void main(String[] args) {
        SourcePerson source = new SourcePerson("John", 30);
        DestinationPerson destination = new DestinationPerson();

        try {
            BeanUtils.copyProperties(destination, source);
        } catch (Exception e) {
            e.printStackTrace();
        }

        source.setName("Jane");
        source.setAge(40);
        System.out.println(destination);
    }
}