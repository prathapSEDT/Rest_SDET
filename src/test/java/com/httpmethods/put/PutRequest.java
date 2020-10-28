package com.httpmethods.put;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.frameworkutils.Utils;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateCustomer.CreateCustomer;
import pojo.CreateCustomer.CreateCustomerResponse;

import java.io.IOException;

public class PutRequest extends Utils {
    @Step("Update the customer with the id {0}")
    public void upDateCustomer(String custID) throws IOException {
        CreateCustomer createCustomerPayload=getCreateCustomerPayload();
        RestAssured.baseURI=getConfigProperty("BASEURI");
        String resources=getConfigProperty("UPDATE_CUSTOMER").replace("REPLACEME",custID);
        //update customer payload with new data
        createCustomerPayload.setFirstname("Raj");
        createCustomerPayload.setLastname("Kumar");

        Response response=RestAssured.given().body(createCustomerPayload).when().
                put(resources).then().extract().response();
        // check status code
        if (response.statusCode()!=200){
            System.out.println("Status Code appear to be wrong value while updating a customer");
            System.out.println("Response code : "+response.statusCode());
        }else {
            System.out.println("Customer updated sucessfully");
        }

        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        CreateCustomerResponse customerResponse=objectMapper.readValue(response.asString(), CreateCustomerResponse.class);
        System.out.println(customerResponse);




    }

}
