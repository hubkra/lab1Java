package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;

public class UsersController {

    private static HashMap<Integer, UserEntity> hmap = new HashMap<Integer, UserEntity>();
    {
        UserEntity person1 = new UserEntity("Kamil", "Pietrzak", 15);
        UserEntity person2 = new UserEntity("Hubert", "Kras", 22);
        UserEntity person3 = new UserEntity("Zuza", "Siemaszko", 26);
        UserEntity person4 = new UserEntity("Java", "JestCool", 12);

        hmap.put(1, person1);
        hmap.put(2, person2);
        hmap.put(3, person3);
        hmap.put(4, person4);
    }

    public static String view() throws JsonProcessingException {
        String json = new ObjectMapper().writeValueAsString(hmap);
        System.out.println(json);
        return json;
    }


}
