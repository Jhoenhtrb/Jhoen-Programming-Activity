package activitiest;
import java.util.Scanner;
public class Activitiest {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //back up u little shii 2,3,2
      
               for(int i=2; i<10; i++){
                   boolean prime = true;
            
            for (int j=3; j<i; j++){
            if (i%j==0) 
                    prime = false;
                    break;
            }
          if (prime) {
             System.out.println(i + " Prime number"); 
                }
            
            }
        
 
       int sum = 1;
        for(int i=2; i<10; i++){
     
            
            for (int j=3; j<i; j++){
            if (i%j==0) 
                    break;
                
             else if (i==j+1){
                    sum = sum + i;
                }
            }
        }
        System.out.println("total prime = "+sum); 
    }
}