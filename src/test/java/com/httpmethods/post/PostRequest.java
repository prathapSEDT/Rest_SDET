package com.httpmethods.post;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.frameworkutils.Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateCustomer.CreateCustomer;
import pojo.CreateCustomer.CreateCustomerResponse;
import pojo.Post.CreateOrder.CreateOrder;

import java.io.IOException;

public class PostRequest extends Utils {

    public String createCustomer() throws IOException {
        CreateCustomer createCustomerPayload=getCreateCustomerPayload();
        RestAssured.baseURI=getConfigProperty("BASEURI");
        String resources=getConfigProperty("CREATE_CUSTOMERS");

        Response response=RestAssured.given().body(createCustomerPayload).when().
        post(resources).then().extract().response();
        // check status code
        if (response.statusCode()!=201){
            System.out.println("Status Code appear to be wrong value while creating a customer");
            System.out.println("Response code : "+response.statusCode());
        }else {
            System.out.println("Customer created sucessfully");
        }

        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        CreateCustomerResponse customerResponse=objectMapper.readValue(response.asString(), CreateCustomerResponse.class);
        String custID=customerResponse.getCustomerUrl();
        System.out.println(customerResponse);
        return custID.replaceAll("[^0-9]","");



    }

    public String createOrder(String custID) throws IOException {

        RestAssured.baseURI=getConfigProperty("BASEURI");
        String resources=getConfigProperty("CREATE_ORDER").replace("REPLACEME",custID);;

        Response response=RestAssured.given().when().
                post(resources).then().extract().response();
        // check status code
        if (response.statusCode()!=201){
            System.out.println("Status Code appear to be wrong value while creating an order to the customer");
            System.out.println("Response code : "+response.statusCode());
        }else {
            System.out.println("Order created sucessfully");
        }

        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        CreateOrder createOrder=objectMapper.readValue(response.asString(), CreateOrder.class);
        String orderID=createOrder.getItemsUrl();
        System.out.println(createOrder);
        return orderID.replaceAll("[^0-9]","");



    }








}
