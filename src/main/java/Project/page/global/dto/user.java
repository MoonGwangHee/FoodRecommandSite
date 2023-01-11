package Project.page.global.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class user {

    private int id;
    private String email;
    private String number;
    private String username;
    private String address;
    private int age;
    private String password;
}
