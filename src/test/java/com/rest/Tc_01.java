package com.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.GetUsers.EmployeeDetails;
import pojo.GetUsers.GetUsersPojo;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Tc_01 {
    public static void main(String[] args) throws IOException {

        RestAssured.baseURI="https://reqres.in/";

        Response response=given().param("page","2").
        when().get("/api/users").
        then().extract().response();

        // map Json to Java Object

        ObjectMapper objectMapper=new ObjectMapper();// jackson api
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        GetUsersPojo userDetails=objectMapper.readValue(response.asString(),GetUsersPojo.class);
        objectMapper.writeValue(new File("Usedetails.json"),userDetails);



    }
}
