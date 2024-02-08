package com.JwtAuthentication.services;

import com.JwtAuthentication.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Vivek","vivek@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit","ankit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Harsh","harsh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Mike","mike@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
