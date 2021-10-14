package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.Service;

@Controller
public class Cars {
    @GetMapping("/cars")
    public String getCars(ModelMap model) {
        model.addAttribute("cars", new Service().addFiveCars());
        return "cars";
    }
}

