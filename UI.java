package u.i;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UI {
        
    public static void main(String[] args) {
    /*  String jhoen=JOptionPane.showInputDialog("hey stupid enter a number");
        String jhoen1=JOptionPane.showInputDialog("enter another number u stupid");
        
        int j=Integer.parseInt(jhoen);
        int j2=Integer.parseInt(jhoen1);
        int sum = j + j2; */
        
        String jhoen=JOptionPane.showInputDialog("JHOENBADASS CALCULATOR \n + ADDITION \n - SUBTRACTION \n * MULTIPLICATION \n / DIVISION \n TYPE 1 TO PADAYUN STUPID");  
        String ent=JOptionPane.showInputDialog("enter number");
        System.out.println (" word " + ent);
        String operation=JOptionPane.showInputDialog("enter operation");
        System.out.println (" word " + operation);
        String enter=JOptionPane.showInputDialog("enter number");
        System.out.println (" word " + enter);
        
        int sum1=Integer.parseInt(ent);
        int sum2=Integer.parseInt(enter);
       
        float result = 0;
        if (operation.equals("+")) {
               result = sum1 + sum2;
        }
        
        else if (operation.equals("+")) {
               result = sum1 + sum2;
        }
        
        else  if (operation.equals("-")) {
               result = sum1 - sum2;
        }
        
        else if (operation.equals("*")) {
               result = sum1 * sum2;
        }
        
        else if (operation.equals("/")) {
               result = sum1 / sum2;
        }
        
        JOptionPane.showMessageDialog(null, "the sum is:" + result);
           
    
    }
    
}
