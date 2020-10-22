package com.frameworkutils;

import com.github.javafaker.Faker;

public class FakerData {
    private Faker faker;

    public FakerData(){
        faker = new Faker();
    }

    public String getPersonFirstName(){
       return faker.name().firstName();
    }

    public String getPersonLastName(){
        return faker.name().lastName();
    }

    public String getAddress()
    {
        return faker.address().fullAddress();
    }



}
