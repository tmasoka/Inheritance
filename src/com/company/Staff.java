package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person {
    String EducationMasoka56335, PositionMasoka56335;
    Person ps = new Person();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void initialize1() throws IOException {
        ps.initialize();
        System.out.println("Enter your Education:");
        String educationMasoka56335 = br.readLine();
        System.out.println("Enter Position:");
        String positionMasoka56335 = br.readLine();

    }
    String print1(){
        String print = ps.print();
        String result= print+ "\n Education: "+EducationMasoka56335+ " \n Position: "+PositionMasoka56335;
       System.out.println(result);
       return result;
    }

    public static void main(String[] args) throws IOException {
        Staff ps = new Staff();
        ps.initialize();
    }
}
