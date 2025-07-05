package jwt.com.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String email;


    public User(String userId,String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}

