package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public Map<String,String> getAccountDetails(@PathVariable("number") int number){
        int loan = ThreadLocalRandom.current().nextInt(8_00_000,10_00_000);
        int emi = ThreadLocalRandom.current().nextInt(5_000,7_000);
        int tenure = ThreadLocalRandom.current().nextInt(12,48);
        return Map.of("number",String.valueOf(number),
                "type","car",
                "loan",String.valueOf(loan),
                "emi",String.valueOf(emi),
                "tenure",String.valueOf(tenure)
        );
    }
}

