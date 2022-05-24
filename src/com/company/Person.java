package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String SurnameMasoka56335, FirstNameMasoka56335, StreetMasoka56335, ZipCodeMasoka56335, CityMasoka56335;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void initialize() throws IOException {

        System.out.println(" Please Enter your Surname:");
        SurnameMasoka56335 = br.readLine();
        System.out.println("Please Enter FirstName:");
        FirstNameMasoka56335 = br.readLine();
        System.out.println(" Please Enter your Street:");
        StreetMasoka56335 = br.readLine();
        System.out.println("Please Enter Zipcode:");
        ZipCodeMasoka56335 = br.readLine();
        System.out.println("Please Enter City:");
        CityMasoka56335 = br.readLine();

    }

    String print() {
        String resultMasoka56335 = " Surname = " + SurnameMasoka56335 + "\n FirstName = " + FirstNameMasoka56335 +
                "\n Street= " + StreetMasoka56335 + "\n Zipcode = " + ZipCodeMasoka56335
                + "\n City = " + CityMasoka56335;
        System.out.println("*********************");
        System.out.println(resultMasoka56335);
        return resultMasoka56335;
    }

    public static void main(String[] args) throws IOException {
        Person per = new Person();
        per.initialize();

    }
}
