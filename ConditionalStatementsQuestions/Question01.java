package ConditionalStatementsQuestions;

import java.util.Scanner;

//01. Write a java program to get a number from the user and print whether it is positive or
//negative.


public class Question01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        //Input user
        System.out.println("Enter The Number : ");
        int a = s1.nextInt();
        //Conditions
        if ( a > 0){
            System.out.println("Postive Integer");
        }else if (a < 0){
            System.out.println("Negitave Integer");
        }
        else {
            System.out.println("Number is zero");
        }

    }
}
