package com.example.slm_api;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.*;

class ApiControllerTest {

    @RequestMapping("/convertInch")
    public boolean convertInch(String[] args) {
        double a = 2;
        double b = 2.54;

        if (a * b == 5.08)
            return true;
        return false;
    }

}