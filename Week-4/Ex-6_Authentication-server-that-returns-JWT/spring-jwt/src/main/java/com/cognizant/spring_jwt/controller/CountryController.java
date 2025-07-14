package com.cognizant.spring_jwt.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/countries")
    public List<Map<String, String>> getAllCountries() {
        LOGGER.info("Starting getAllCountries method in CountryController Class");
        return List.of(
                Map.of("code", "IN", "name", "India"),
                Map.of("code", "US", "name", "United States"),
                Map.of("code", "JP", "name", "Japan"),
                Map.of("code", "UK", "name", "United Kingdom")
        );
    }
}