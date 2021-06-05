/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double order = input.nextDouble();

        System.out.println("What is the state?");
        String state = input.next().toUpperCase();

        double total;
        double tax = 0.055;
        double orderTax = order * tax;

        if (state.equals("WI"))
        {
           total = (order * tax) + order;

            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", order, orderTax, total);

            System.exit(0);
        }

        total = order;

        System.out.printf("The total is $%.2f", total);
    }
}
