package com.mycompany.shopv2;
import javax.swing.JOptionPane;
public class ShopV2 {
  private static final String[] item = {"Product 1", "Product 2", "Product 3", "Product 4", "Product 5"};
    private static final double[] price = {10.0, 20.0, 30.0, 40.0, 50.0};
    
    public static void main(String[] args) {
        int choice;
        int quantity;
        double total = 0.0;
        
        do {
            choice = showMenu();
            
            if (choice >= 1 && choice <= item.length) {
                quantity = getQuantity();
                total += calculateTotal(choice - 1, quantity);
                
                int chsy = JOptionPane.showConfirmDialog(null, "Do you want to continue shopping?", "Continue Shopping", JOptionPane.YES_NO_OPTION);
                if (chsy == JOptionPane.NO_OPTION) {
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
        
        double dscnt = applyDiscount(total);
        double csh = total - dscnt;
        
        JOptionPane.showMessageDialog(null, String.format("Total: P%.2f\nDiscount: $%.2f\nTotal Amount: P%.2f", total, dscnt, csh), "Order Summary", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static int showMenu() {
        StringBuilder menuMessage = new StringBuilder();
        menuMessage.append("Choose a product:\n");
        
        for (int i = 0; i < item.length; i++) {
            menuMessage.append(i + 1).append(". ").append(item[i]).append(" - P").append(price[i]).append("\n");
        }
        
        String choiceString = JOptionPane.showInputDialog(null, menuMessage.toString(), "7/7", JOptionPane.QUESTION_MESSAGE);
        
        try {
            return Integer.parseInt(choiceString);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static int getQuantity() {
        String quantityString = JOptionPane.showInputDialog(null, "Enter the quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
        
        try {
            return Integer.parseInt(quantityString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    private static double calculateTotal(int choice, int quantity) {
        return price[choice] * quantity;
    }
    
    private static double applyDiscount(double total) {
        String discountString = JOptionPane.showInputDialog(null, "Discount Percentage:", "Discount", JOptionPane.QUESTION_MESSAGE);
        
        try {
            double dscntt = Double.parseDouble(discountString);
            return total * (dscntt / 100.0);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}