package ConditionalStatementsQuestions;
import java.util.Scanner;

//04.Write a program to find the factorial of any number entered by the user?


public class Question04 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enetr the Number : ");
        int num = s1.nextInt();
        long fact = 1;
        for( int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        //OutPut
        System.out.println("Factorial of " + num + " is : " + fact);

    }
}
