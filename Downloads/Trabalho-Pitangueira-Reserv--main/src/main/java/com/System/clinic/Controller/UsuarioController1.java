package com.System.clinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController1 {

    @PostMapping("/login")
    public String fazerLogin(@RequestParam String emailusuario, @RequestParam String senhausuario) {

        if ("mdj3114@gmail.com".equals(emailusuario) && "123".equals(senhausuario)) {
            return "redirect:/home";
        } else {
            return "redirect:/login?erro=true";
        }
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
}
