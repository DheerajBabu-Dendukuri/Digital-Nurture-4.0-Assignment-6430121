package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;

    public String getCode() {
        logger.info("Getting the Country code : {}",code);
        return code;
    }

    public void setCode(String code) {
        logger.info("Setting the Country name : {}",code);
        this.code = code;
    }

    public String getName() {
        logger.info("Getting the Country name : {}",name);
        return name;
    }

    public void setName(String name) {
        logger.info("Setting the Country name : {}",name);
        this.name = name;
    }

    @Override
    public String toString(){
        logger.info("toString method from Country class ");
        return " From Country class -> [ " + code + " : " + name + " ] ";
    }
}
