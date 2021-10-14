package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

@Controller
public class Cars {
    @GetMapping("/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", new Service().addFiveCars());
        } else {
            model.addAttribute("cars", new Service().carChosenList(Integer.parseInt(count)));
        }
        return "cars";
    }
}

