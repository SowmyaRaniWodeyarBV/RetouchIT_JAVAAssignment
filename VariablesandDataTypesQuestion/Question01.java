package VariablesandDataTypesQuestion;

import java.util.Scanner;

//01.In a program input 3 numbers : A , B and C. you have to output the average of
//these 3 numbers.(HINT : Average of N numbers is sum of those numbers divided by N )

public class Question01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = s1.nextInt();
        System.out.println("Enter Second Number : ");
        int b = s1.nextInt();
        System.out.println("Enter Third Number : ");
        int c = s1.nextInt();

        //Calculate the result
        double Average = (a+b+c)/3.0; //Divide by count (3)
        System.out.println("Average : " + Average);
    }
}
