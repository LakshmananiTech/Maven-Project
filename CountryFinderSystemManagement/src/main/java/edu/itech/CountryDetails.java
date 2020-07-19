package edu.itech;

import com.itech.CountryFinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryDetails {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter Country Code");
        String cCode = br.readLine();


        CountryFinder cfinder = new CountryFinder();
        String result4 = cfinder.findCountry(cCode);
        System.out.println(result4);
    }

}
