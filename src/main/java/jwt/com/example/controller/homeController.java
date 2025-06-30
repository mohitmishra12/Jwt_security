package jwt.com.example.controller;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class homeController {


    @GetMapping("/user")
    public String getUser(){
        System.out.println("getting User");
        return "user";

    }


}
