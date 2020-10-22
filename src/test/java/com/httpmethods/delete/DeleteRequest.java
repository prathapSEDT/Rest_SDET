package com.httpmethods.delete;

import com.frameworkutils.Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

public class DeleteRequest extends Utils {
    public void deleteCustomer_By_ID(String custID) throws IOException {
        RestAssured.baseURI=getConfigProperty("BASEURI");
        String resources=getConfigProperty("DELETE_CUSTOMER").replace("REPLACEME",custID);
        Response response=RestAssured.given().when().delete(resources).then().extract().response();
        System.out.println();
        if (response.statusCode()!=200){
            System.out.println("Customer deleted sucessfully");
        }else {
            System.out.println("Customer not deleted sucessfully");
        }
    }
}
