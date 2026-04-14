package com.siddhi;
import java.util.*;
public class TempConvertor {
    public static void main(String[] args) {
        double f = printCelsiustoFarenheit(37);
        System.out.println("Temperature in Fahrenheit: " + f);

        double c = printFrenheittoCelsius(32);
        System.out.println("Temperature in Celsius: " + c);
    }

    public static double printCelsiustoFarenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double printFrenheittoCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}


