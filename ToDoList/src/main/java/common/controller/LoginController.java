package common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import common.service.LoginService;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
	
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          Model model,
                          HttpSession session) {

        boolean result = loginService.loginCheck(username, password);

        if (result) {
            session.setAttribute("loginUsername", username);
            return "redirect:/list";
        } else {
            model.addAttribute("errorMessage", "ユーザー名またはパスワードが違います");
            return "login";
        }
    }
}