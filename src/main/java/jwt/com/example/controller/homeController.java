package jwt.com.example.controller;


import jwt.com.example.model.User;
import jwt.com.example.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class homeController {


    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting Users");
        return userServices.getUser();

    }


}
