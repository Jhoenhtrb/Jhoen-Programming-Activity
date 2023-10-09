package jwho;
import java.util.Scanner;
public class Jwho {
  public static void main(String[] args) {      
         int gwen=0;  
         int nord=0; int conv=0;
         int poly=0; int trig=0;
         Scanner input = new Scanner(System.in);
while (true) {
         System.out.println("Jhoenhtrb Converter");
        System.out.println("Please Select Option:");
        System.out.println( "  " + "1. Temperature Converter");
        System.out.println( "  " + "2. Odd/Even Number Checker");
        System.out.println( "  " + "3. Trigonometric Calculator");
        System.out.println( "  " + "4. Polygon Surface Area Calculator");
        int jho = input.nextInt();
        while (true) {
            {
           if (jho == 1) {
            System.out.println("Please select to convert:");      
            System.out.println("  ");
            System.out.println("1. Celsius to Farenheight");
            System.out.println("2. Farenheight to Celsius");
            System.out.println("3. Kelvin to Celsius");
            System.out.println("4. Kelvin to Farenheight");
            System.out.println("5. Celsius to Kelvin");
            System.out.println("6. Farenheight to Kelvin");
            int htrb = input.nextInt();
           while (true) {
            switch (htrb) {
                case 1:
                    System.out.println("Enter Value to Convert:");
                    double c = input.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println(f + " " + "Farenheight");
                    break;
                case 2:
                    System.out.println("Enter Value to Convert:");
                    double f2 = input.nextDouble();
                    double c2 = (f2 - 32) * 5 / 9;
                    System.out.println("The Answer is:" + " " + c2);
                    break;
                case 3:
                    System.out.println("Enter Value to Convert:");
                    double k = input.nextDouble();
                    double c3 = k - 273.15;
                    System.out.println("The Answer is:" + " " + c3);
                    break;
                case 4:
                    System.out.println("Enter Value to Convert:");
                    double k2 = input.nextDouble();
                    double f3 = (k2 - 273.15) * 9 / 5 + 32;
                    System.out.println("The Answer is:" + " " + f3);
                    break;
                case 5:
                    System.out.println("Enter Value to Convert:");
                    double c4 = input.nextDouble();
                    double k3 = c4 + 273.15;
                    System.out.println("The Answer is:" + " " + k3);
                    break;
                case 6:
                    System.out.println("Enter Value to Convert:");
                    double f4 = input.nextDouble();
                    double k4 = (f4 - 32) * 5 / 9 + 273.15;
                    System.out.println("The Answer is:" + " " + k4);
                    break;
            }
            System.out.println("Continue calculation or go back to converter");   
            System.out.println ("press 1 to continue calculation" );       
            System.out.println("press 2 to go back to converter");
            conv=input.nextInt();
            if (conv==1) {
            }    
            else if (conv==2) {
               break;
           }
        }
            System.out.println("back to converter or main menu");   
            System.out.println ("press 1 to go back to converter" );       
            System.out.println("press 2 to go back to main menu");
            conv=input.nextInt();
            if (conv==1) {
            }    
            else if (conv==2) {
               break;
            }
           }
           }
            if (jho == 2) {
            System.out.print("Enter a Number: ");
            int x = input.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is even numbers.");
            } else {
                System.out.println(x + " is odd numbers.");
            }
        } else if (jho == 3) {
            while (true) {
                {
            }
            System.out.println("Please choose trigonometric functions:");
            System.out.println("  ");
            System.out.println("1. Sine (sin)");
            System.out.println("2. Cosine (cos)");
            System.out.println("3. Tangent (tan)");
            int en = input.nextInt();
            while (true) {
            switch (en) {
                case 1:
                    System.out.println("Enter value in degree:");
                    double sin = input.nextDouble();
                    System.out.println("The sine of" + " " + sin + " " + "is:" + " " + Math.sin(Math.toRadians(sin)));
                    break;
                case 2:
                    System.out.println("Enter value in degree:");
                    double cos = input.nextDouble();
                    System.out.println("The cosine of" + " " + cos + " " + "is:" + " " + Math.cos(Math.toRadians(cos)));
                    break;
                case 3:
                    System.out.println("Enter value in degree:");
                    double tan = input.nextDouble();
                    System.out.println("The tangent of" + " " + tan + " " + "is:" + " " + Math.tan(Math.toRadians(tan)));
                    break;
            }
                         System.out.println("Continue calculation or go back to trigo");   
            System.out.println ("press 1 to continue" );       
            System.out.println("press 2 to go back to trigo");
            trig=input.nextInt();
            if (trig==1) {
            }    
            else if (trig==2) {
               break;
            }
            }
                                 System.out.println("Continue calculation or go back to main menu");   
            System.out.println ("press 1 to continue" );       
            System.out.println("press 2 to go main menu");
            trig=input.nextInt();
            if (trig==1) {
            }    
            else if (trig==2) {
               break;
            }
        }
        }
            else if (jho == 4) {
            while (true) { 
                {
            System.out.println("Please choose a polygon:");
            System.out.println("  ");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Circle");
            int ab = input.nextInt();
            while (true) {
            switch (ab) {
                    case 1:
                    System.out.println("Enter the value of three sides of triangle");
                    System.out.println("Side 1:");
                    double a = input.nextDouble();
                    System.out.println("Side 2:");
                    double b = input.nextDouble();
                    System.out.println("Side 3:");
                    double c = input.nextDouble();
                    double abc = ((a + b + c) / 2);
                    double fv = Math.sqrt(abc * (abc - a) * (abc - b) * (abc - c));
                    System.out.println("The area of triangle is:" + " " + fv);
                    break;
                case 2:
                    System.out.println("Enter the value of length of the square:");
                    double d = input.nextDouble();
                    double fv2 = (d * d);
                    System.out.println("The area of Square is:" + " " + fv2);
                    break;
                case 3:
                    System.out.println("Enter the value of length and width of a rectangle");
                    System.out.println("Length:");
                    double e = input.nextDouble();
                    System.out.println("Width");
                    double f = input.nextDouble();
                    double fv3 = (e * f);
                    System.out.println("The area of a rectangle is:" + " " + fv3);
                case 4:
                    System.out.println("Enter the value of radius of the circle:");
                    double g = input.nextDouble();
                    double fv4 = (Math.PI * g * g);
                    System.out.println("The area of a circle is:" + " " + fv4);
                    break;
            }
            
             System.out.println("Continue calculation or go back to polygon");   
            System.out.println ("press 1 to continue" );       
            System.out.println("press 2 to go back to polygons");
            poly=input.nextInt();
            if (poly==1) {
            }    
            else if (poly==2) {
               break;
            }
            }
                }
            System.out.println("Do you want to go back to polygons?");   
            System.out.println ("press 1 to continue" );       
            System.out.println("press 2 back main menu");
            poly=input.nextInt();
            if (poly==1) {
            }    
            else if (poly==2) {
               break;
            }
            }
            }
            
            System.out.println("Do you want to go back to main menu?");   
            System.out.println ("press 1 to no" );       
            System.out.println("press 2 to yes");
            nord=input.nextInt();
            if (nord==1) {
            }    
            else if (nord==2) {
               break;
}
}
            System.out.println("you sure?");   
            System.out.println ("press 1 to continue" );       
            System.out.println("press 2 to stop calculation");
            gwen=input.nextInt();
            if (gwen==1) {
                 System.out.println("okay continue conversion");
            }    
            else if (gwen==2) {
                 System.out.println("okay stop nata");
               break; 
    }           
    }            
    
}
    }
