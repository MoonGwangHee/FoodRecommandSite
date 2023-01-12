package Project.page.domain.controller;


import Project.page.global.dto.user;
import Project.page.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/log")
public class UserController {
    private final UserService userService;

    @RequestMapping("/Login")
    public String login() {
        return "html/LoginMain";
    }

    @RequestMapping("/newAccount")
    public String newAccountForm() {
        return "html/CreateAccount";
    }


    @RequestMapping("/user")
    public List<user> user() {
        return userService.getUserList();
    }

}
