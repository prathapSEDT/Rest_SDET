package com.testcases;

import com.httpmethods.post.PostRequest;

import java.io.IOException;

public class TC_01 {
    public static void main(String[] args) throws IOException {
        //create a customer
        PostRequest postRequest=new PostRequest();
        postRequest.createCustomer();
    }
}
