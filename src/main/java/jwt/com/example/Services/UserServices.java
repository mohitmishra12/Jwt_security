package jwt.com.example.Services;

import jwt.com.example.Services.user.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserServices {

    private List<user> store = new ArrayList<>();

    public  UserServices(){
        store.add(new user(UUID.randomUUID().toString(),"mohit" ,"mohit@gmail.com")){
            
        }
    }
}
