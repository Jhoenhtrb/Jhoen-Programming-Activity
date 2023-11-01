package com.mycompany.badasshop;
import javax.swing.JOptionPane;
public class BadasShop {
    public static void main(String[] args) {
       String[] products = {"egglog", "pepsilog", "pastilog", "Combolog", "Comborat"};
        double[] prices = {10.0, 20.0, 30.0, 40.0, 50.0};

      
        StringBuilder message = new StringBuilder("bada$shop:\n");
        for (int i = 0; i < products.length; i++) {
            message.append(i + 1).append(". ").append(products[i]).append(" - P").append(prices[i]).append("\n");
        }
        
   
        int j = Integer.parseInt(JOptionPane.showInputDialog(null, message.toString(), "bili na pogi", JOptionPane.PLAIN_MESSAGE));
        
    
        if (j < 1 || j > products.length) {
            JOptionPane.showMessageDialog(null, "Stupid 1-5 lang", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
     
        double discountPercentage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter discount percentage:", "Discount", JOptionPane.PLAIN_MESSAGE));
        
     
        double price = prices[j - 1];
        double discountedPrice = price - (price * discountPercentage / 100);
        
       
        JOptionPane.showMessageDialog(null, "Final Price: P" + discountedPrice, "Total Price", JOptionPane.INFORMATION_MESSAGE);
    }
}
