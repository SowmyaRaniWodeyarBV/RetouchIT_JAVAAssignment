package ConditionalStatementsQuestions;

import java.util.Scanner;

//05.Write a program that reads a set of intergers, and then prints the sum of the
//even and odd integer.


public class Question05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");//5
        int n = sc.nextInt(); //n=5

        int evenSum = 0, oddSum = 0;

        System.out.println("Enter " + n + " integers: ");// n=5
        for (int i = 0; i < n; i++) {                              //n=5 ..... 0 to 4
            int num = sc.nextInt();                                  //10,15

            if (num % 2 == 0) {
                evenSum += num;                                         // 0+10=10,
            } else {
                oddSum += num;                                        //0+15=15
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}



/*   With i <= n:
Loop runs 3 times (i = 0, 1, 2) → expects 3 numbers.
  But the user has only 2 numbers → InputMismatch / NoSuchElementException error.
With i < n:
 Loop runs 2 times (i = 0, 1) → exactly matches the number of inputs. ✅*/