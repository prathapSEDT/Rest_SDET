package com.testcases;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.frameworkutils.FakerData;
import pojo.CreateCustomer.CreateCustomer;

import java.io.File;
import java.io.IOException;

public class TC_02_Faker {
    public static void main(String[] args) throws IOException {

        for(int i=1;i<=10;i++){
            System.out.println("--------------------------------------");
            File f=new File("./Payloads/CreateCustomer.json");
            ObjectMapper mapper=new ObjectMapper();
            CreateCustomer createCustomer=mapper.readValue(f, CreateCustomer.class);
            createCustomer.setFirstname(new FakerData().getPersonFirstName());
            createCustomer.setLastname(new FakerData().getPersonLastName());
            System.out.println(createCustomer.getFirstname());
            System.out.println(createCustomer.getLastname());

            System.out.println("--------------------------------------");


        }




    }
}
