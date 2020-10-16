package com.frameworkutils;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CreateCustomer.CreateCustomer;

import java.io.*;
import java.util.Properties;

public class Utils {
    protected CreateCustomer getCreateCustomerPayload() throws IOException {
        File payload=new File("./Payloads/CreateCustomer.json");
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(payload,CreateCustomer.class);
    }

    protected String getConfigProperty(String property) throws IOException {
        File f=new File("./Configuration/Config.properties");
        FileInputStream fis=new FileInputStream(f);
        Properties properties=new Properties();
        properties.load(fis);
        return properties.getProperty(property);
    }
}
