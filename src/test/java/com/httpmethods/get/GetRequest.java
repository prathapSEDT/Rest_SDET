package com.httpmethods.get;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.frameworkutils.Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.Get.GetCustomerByID;

import java.io.IOException;

public class GetRequest extends Utils {

    public void getCustomerByID(String custID) throws IOException {
        RestAssured.baseURI=getConfigProperty("BASEURI");
        String resources=getConfigProperty("GET_CUSTOMER_BY_ID").replace("REPLACEME",custID);
        Response response=RestAssured.given().when().get(resources).then().extract().response();
        ObjectMapper mapper=new ObjectMapper();
        GetCustomerByID getCustomerByID=mapper.readValue(response.asString(), GetCustomerByID.class);
        if(getCustomerByID!=null){ System.out.println(getCustomerByID);}
        else {
            System.out.println("No Customer Available with the ID : "+custID);}
    }

}
