/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Idk {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to generate its multiplication table: ");
        int num = scanner.nextInt();

        while (num <= 0) {
            System.out.println("Please enter a positive integer.");
            System.out.print("Enter an integer to generate its multiplication table: ");
            num = scanner.nextInt();
        }

        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 20; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
    }
}