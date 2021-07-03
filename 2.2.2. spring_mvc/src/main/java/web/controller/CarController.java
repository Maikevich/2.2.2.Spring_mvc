package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getList(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("message", CarService.getMyCar(count));
        return "cars";
    }
}
