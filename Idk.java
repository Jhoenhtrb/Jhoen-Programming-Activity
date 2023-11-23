package com.mycompany.idk;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Idk {
    public static void main(String[] args) {
       String[] products = {"Americano", "Cappucino", "Spanish Latte", "Dark Mocha Latte", "Creamcheese Cloud Matcha"};
        double[] prices = {120, 130, 140, 160, 170};

        int choice;
        int totalQuantity = 0;
        double totalCost = 0;
        double discount = 10.0;

        do {
                    String menu = "Choose a product:\n";
            for (int i = 0; i < products.length; i++) {
                menu += (i + 1) + ". " + products[i] + " - P" + prices[i] + "\n";
            }
            menu += "0. Exit";
            String input = JOptionPane.showInputDialog(null, menu, "J's Cafe", JOptionPane.QUESTION_MESSAGE);
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = -1;
            }
            if (choice >= 1 && choice <= products.length) {
                int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity for" + products[choice - 1] + ":", "Quantity", JOptionPane.QUESTION_MESSAGE));
                totalQuantity += quantity;
                totalCost += prices[choice - 1] * quantity;
            } else if (choice == 0) {
                /* bayadan area */
                    double discountAmount = totalCost * (discount / 100);
                    double discounted = totalCost - discountAmount; 
                    double payment = Double.parseDouble(JOptionPane.showInputDialog(null, "Total cost before discount: P" + totalCost + "\n Discount: %" + discount + "\n Discounted cost: P" + discounted +  "\n Your Cash:", "Bayad pls :(", JOptionPane.WARNING_MESSAGE));
                if (payment < totalCost) {
                    JOptionPane.showMessageDialog(null, "Insufficient payment", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    double change = payment - discounted;
                 JOptionPane.showMessageDialog(null, "Receipt:\nTotal Quantity: " + totalQuantity + "\nTotal Cost befor discount: P" + totalCost + "\nDiscounted Cost: P" + discounted + "\nMoney Received: P" + payment + "\nChange: P" + change, "Receipt", JOptionPane.INFORMATION_MESSAGE);
                    totalQuantity = 0;
                    totalCost = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (choice != 0);
    }
}