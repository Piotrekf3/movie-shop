package com.piotrek.movieshop.rest;

import com.piotrek.movieshop.entity.Currency;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CurrencyController {

    @GetMapping("/currencies")
    public Currency currencies() {
        return new Currency();
    }
}
