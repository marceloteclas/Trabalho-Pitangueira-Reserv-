package com.System.clinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/home")
    public String mostrarMenu() {
        return "home"; // JTE procura automaticamente por home.jte
    }

    @GetMapping("/questionario")
    public String mostrarQuestionario() {
        return "questionario"; // <-- NÃO use ".jte", nem "/questionario.jte"
    }

}
