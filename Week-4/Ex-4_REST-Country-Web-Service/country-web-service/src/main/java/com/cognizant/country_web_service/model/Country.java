package com.cognizant.country_web_service.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Country {
    private final static Logger logger = LoggerFactory.getLogger(Country.class);
    private String code,name;

    public String getCode() {
        logger.info("Calling getCode function in Country class");
        return code;
    }

    public void setCode(String code) {
        logger.info("Calling setCode function in Country class with code: {}",code);
        this.code = code;
    }

    public String getName() {
        logger.info("Calling getName function in Country class");
        return name;
    }

    public void setName(String name) {
        logger.info("Calling setName function in Country class with name: {}",name);
        this.name = name;
    }

    @Override
    public String toString(){
        logger.info("Calling the toString function in Country Class");
        return "From Country Class -> [ Code : " + code + " Name : " + name + " ]";
    }
}
