package com.berkanaslan.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

/**
 * @author Berkan Aslan
 * 31.03.2021
 */
public class Driver {
    public static void main(String[] args) {

        try {
            // Create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON file and map/convert to Java POJO: data/sample-lite.json
            Student student1 = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

            // Print student details
            System.out.println(student1);

            // Print address:
            Address address1 = student1.getAddress();
            System.out.println(address1);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
