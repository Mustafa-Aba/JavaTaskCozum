package tasks03_Scanner;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Fahrenheit degree : ");
        double fDegree=input.nextDouble();
        double cDegree=(fDegree-32)*5/9;
        System.out.println("Celsius Degree = " + cDegree);


    }


}
