package Project.page.Users;

import lombok.Data;

@Data
public class UserVo {
    private int id;
    private String email;
    private String number;
    private String username;
    private String address;
    private int age;
    private String password;
    private String userAuth;
}
