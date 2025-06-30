package jwt.com.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserModel {
    private String UserId;
    private String name;
    private String email;
}
