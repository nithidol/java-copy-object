package com.example.diff;

import com.example.diff.beans.DestinationPerson;
import com.example.diff.beans.SourcePerson;
import org.modelmapper.ModelMapper;

public class ModelMapperCopy {
    public static void main(String[] args) {
        SourcePerson source = new SourcePerson("John", 30);
        DestinationPerson destination = new DestinationPerson();

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(source, destination);

        source.setName("Jane");
        source.setAge(40);
        System.out.println(source);
        System.out.println(destination);
    }
}
