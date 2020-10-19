package com.testcases;

import com.httpmethods.get.GetRequest;
import com.httpmethods.post.PostRequest;
import com.httpmethods.put.PutRequest;

import java.io.IOException;

public class TC_01 {
    public static void main(String[] args) throws IOException {
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

    }
}
