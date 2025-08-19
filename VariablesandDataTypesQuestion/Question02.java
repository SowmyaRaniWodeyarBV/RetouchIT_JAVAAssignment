package VariablesandDataTypesQuestion;

import java.util.Scanner;

// 02. Enter cost of 3 items from the user (using float datatype) a pencile, a pen , an eraser.
//You have to output the total cost of the items back to the user as their bill.
//(ADD on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3 inputs from user
        System.out.println("enter a first item cost (pencil): ");
        float pencil=scanner.nextFloat();
        System.out.println("enter a second item cost(pen): ");
        float pen=scanner.nextFloat();
        System.out.println("enter a third item cost(eraser): ");
        float eraser=scanner.nextFloat();

        //calculations
        double total=(pencil+pen+eraser);

        //  GST calculation (18%)
        double gstAmount=total*0.18f;
        double finalAmount= gstAmount+total;

        // Printing the bill
        System.out.println("\n======= BILL =======");
        System.out.printf("Pencil: ₹%.2f%n", pencil);
        System.out.printf("Pen   : ₹%.2f%n", pen);
        System.out.printf("Eraser: ₹%.2f%n", eraser);
        System.out.println("--------------------");
        System.out.printf("Total (without GST): ₹%.2f%n", total);
        System.out.printf("GST @18%%          : ₹%.2f%n", gstAmount);
        System.out.println("--------------------");
        System.out.printf("Final Amount (with GST): ₹%.2f%n", finalAmount);
        System.out.println("====================");

    }
}
