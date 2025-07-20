package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public Map<String,String> getAccountDetails(@PathVariable("number") String number){
        int balance = ThreadLocalRandom.current().nextInt(10000,20000);
        return Map.of("number",number,
                "type","savings",
                "balance",String.valueOf(balance)
        );
    }
}
