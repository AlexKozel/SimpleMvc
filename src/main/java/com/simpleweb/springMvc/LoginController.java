package com.simpleweb.springMvc;

import com.simpleweb.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    LoginService service = new LoginService();

    @GetMapping("/login")
    public String sayHello() {
        return "login";
    }

    @PostMapping("/login")
    public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (!service.validateUser(name, password)) {
            model.put("errorMessage", "Invalid password or user name");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "Welcome";
    }


}
