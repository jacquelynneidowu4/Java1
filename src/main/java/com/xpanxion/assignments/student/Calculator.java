package com.xpanxion.assignments.student;

import java.sql.Array;
import java.util.ArrayList;

public class Calculator {

    //private int x, y;
    String calculation;
    private ArrayList<String> pastCalculations;

    public Calculator(){
        calculation="";
        pastCalculations=new ArrayList<>();
    }
    public double add(double x, double y) {
        calculation = x + " + " + y + " = " + (x + y);
        pastCalculations.add(calculation);
        return x + y;


    }

    public double subtract(double x, double y) {
        calculation = x + " - " + y + " = " + (x - y);
        pastCalculations.add(calculation);
        return x - y;
    }

    public double divide(double x, double y) {
        calculation = x + " / " + y + " = " + (x / y);
        pastCalculations.add(calculation);
        return x / y;
    }

    public double multiply(double x, double y) {
        calculation = x + " * " + y + " = " + (x * y);
        pastCalculations.add(calculation);
        return x * y;
    }

    public String toString() {
        String record="";
        for (String calc : pastCalculations) {
            record+= calc+ "\n";
        }
        return record;
    }
}
