package com.example;

public class APIService{
    private ExternalAPI externalAPI;

    public APIService(ExternalAPI externalAPI){
        this.externalAPI = externalAPI;
    }

    public String fetchAPIData(){
        return externalAPI.getAPIData();
    }
}