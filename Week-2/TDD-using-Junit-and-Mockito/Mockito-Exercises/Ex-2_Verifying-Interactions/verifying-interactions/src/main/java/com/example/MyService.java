package com.example;

import java.util.random.RandomGenerator;

public class MyService {
    private final ExternalAPI api;

    public MyService(ExternalAPI api){
        this.api = api;
    }

    public void fetchData(){
        api.getData();
    }
}