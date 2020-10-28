package com.testcases;

import com.httpmethods.delete.DeleteRequest;
import com.httpmethods.get.GetRequest;
import com.httpmethods.post.PostRequest;
import com.httpmethods.put.PutRequest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_01 {
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Integration test")
    @Story("US1932")
    @Feature("Fruit shop integration")
    @Description("validate E2E scenrio of fruit shop API")
    @Test
    public static void Tc_01() throws IOException {
        //create a customer
        PostRequest postRequest=new PostRequest();
        String custID=postRequest.createCustomer();

        //get the created customer
        GetRequest getRequest=new GetRequest();
        getRequest.getCustomerByID(custID);

        // UPDATE the customer
        PutRequest putRequest=new PutRequest();
        putRequest.upDateCustomer(custID);

        //create order
        postRequest.createOrder(custID);

        //delete customer
        DeleteRequest deleteRequest=new DeleteRequest();
        deleteRequest.deleteCustomer_By_ID(custID);

    }
}
