package Project.page.domain.controller;

import Project.page.Users.UserVo;
import Project.page.domain.service.MemberService;
import Project.page.global.dto.user;
import Project.page.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/log")
public class UserController {
    private final UserService userService;
    @Autowired
    MemberService memberService;

    @GetMapping("/Login")
    public String login() {
        return "html/LoginMain";
    }

    @RequestMapping("/newAccount")
    public String newAccountForm() {
        return "html/CreateAccount";
    }

    @PostMapping("/newAccount")
    public String newAccountMake(UserVo userVo) {
        memberService.joinMember(userVo);
        return "redirect:/html/LoginMain";
    }

    @RequestMapping("/user")
    public List<user> user() {
        return userService.getUserList();
    }

}
