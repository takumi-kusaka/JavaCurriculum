package common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import common.entity.Login;
import common.service.RegisterService;

@Controller
public class RegisterController {
	
	private final RegisterService registerService;
	
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    
    @PostMapping("/register")
    public String doRegister(Login login) {
    	registerService.register(login);
    	return "redirect:/login";
    }
    
    
}
