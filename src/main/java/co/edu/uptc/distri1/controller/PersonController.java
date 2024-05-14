package co.edu.uptc.distri1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import co.edu.uptc.distri1.model.Person;

@RestController
@RequestMapping("/calcular")

public class PersonController {
    @GetMapping("/all")
    public double ejemplo(
        @RequestParam("p1") String p1,
        @RequestParam("p2") String p2) {
        return Double.parseDouble(p1)/Double.parseDouble(p2);
    }
}
