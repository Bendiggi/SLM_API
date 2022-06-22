package com.example.slm_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/convertInch")
    public double convertInch(@RequestParam double a) {
        double b = 2.54;
        return a * b;
    }

    @RequestMapping("/convertYard")
    public double convertYard(@RequestParam double a) {
        double b = 1.094;
        return a / b;

    }
}
