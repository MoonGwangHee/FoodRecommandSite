package Project.page.global.dto;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class user {

    @NotBlank(message = "아이디를 입력해 주세요.")
    private int id;

    @NotBlank(message = "이메일을 입력해 주세요.")
    @Email(message = "올바른 이메일 주소를 입력해주세요.")
    private String email;

    @NotBlank(message = "휴대폰 번호를 입력해 주세요.")
    @Pattern(regexp = "(01[016789])(\\d{3,4})(\\d{4})", message = "올바른 휴대폰 번호를 입력해 주세요.")
    private String number;

    @NotBlank(message = "이름을 입력해주세요.")
    @Size(min = 3, max = 10, message = "이름은 3자 이상 10자 이하로 입력해 주세요.")
    private String username;

    @NotBlank(message = "주소를 입력해주세요.")
    private String address;

    @NotBlank(message = "나이를 입력해주세요.")
    @Size(min = 19 , message = "19세 이상만 회원가입 가능 합니다.")
    private int age;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 8, max = 20 , message = "비밀번호는 8자 이상 20자 이하로 입력해주세요.")
    private String password;
}
