package com.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateCustomer.CreateCustomer;

import java.io.File;
import java.io.IOException;

public class Tc02 {
    public static void main(String[] args) throws IOException {
        File createCustomerPayload=new File("./Payloads/CreateCustomer.json");
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        CreateCustomer createCustomer=objectMapper.readValue(createCustomerPayload, CreateCustomer.class);

        RestAssured.baseURI="https://api.predic8.de:443/";

        Response response=RestAssured.given().body(createCustomer).
        when().post("/shop/customers/").
        then().extract().response();

       



    }
}
