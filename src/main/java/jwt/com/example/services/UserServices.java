package jwt.com.example.services;


import jwt.com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {
    private List<User> store = new ArrayList<>();

    public UserServices() {
        store.add(new User(UUID.randomUUID().toString(),"mohit mishra","mohitmishra747041@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"rohit mishra","rohitmishra747041@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"pramila mishra","pramilamishra747041@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"himanshu mishra","himanshumishra747041@gmail.com"));

    }


    public List<User> getUser(){
        return this.store;
    }

}




