package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class UsersController {

    private  HashMap<Integer, UserEntity> hmap = new HashMap<Integer, UserEntity>();
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

    public view()
    {
        for( Map.Entry pairEntry: hmap.entrySet())
        {
            System.out.println(pairEntry.getKey()+" : "+pairEntry.getValue() );
        }
    }


}
