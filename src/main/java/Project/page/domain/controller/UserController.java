package Project.page.domain.controller;

import Project.page.global.dto.user;
import Project.page.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/log")
public class UserController {
    private final UserService userService;

    @GetMapping("/Login")
    public String login(Model model){
        model.addAttribute("data","로그인 창입니다.");
        return "/log/LoginMain";
    }
    @RequestMapping("/newAccount")
    ModelAndView newAccount() {
        ModelAndView mav = new ModelAndView("html/CreateAccount");
       

        return mav;
    }

    @RequestMapping("/user")
    public List<user> user() {
        return userService.getUserList();
    }

}
