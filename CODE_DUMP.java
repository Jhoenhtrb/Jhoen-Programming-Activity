package jhoenmf.code_dump;
import java.util.Scanner;
public class CODE_DUMP {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Loan Payment Calculator Menu: ");
            System.out.println("1. Calculate Monthly Loan Payment");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menu2();
                    break;
                case 2:
                    System.out.println("Exiting the Loan Payment Calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 2);
        scanner.close();
    }
    private static void menu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Monthly Payment Submenu:");
        System.out.println("1. Loan period in months");
        System.out.println("2. Loan period in years");
        System.out.print("Enter your choice: ");
        int choice2 = scanner.nextInt();

        switch (choice2) {
            case 1:
                months(true);
                break;
            case 2:
                months(false);
                break;
            default:
                System.out.println("Invalid choice. Returning to the main menu.");
        }
    }
//months
    private static void months(boolean mloanperiod) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount:");
        double loan = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualinterest = scanner.nextDouble();

        System.out.print("Enter loan period: ");
        int loanPeriod = scanner.nextInt();

        int numberOfMonths = mloanperiod ? loanPeriod : loanPeriod * 12;

        double mpayment = months(loan, annualinterest, numberOfMonths);
        System.out.println("Monthly Loan Payment: " + mpayment);
    }
//years
    private static double months(double loan, double annualinterest, int numberOfMonths) {
        double monthlyinterest = annualinterest / 12 / 100;
        double denominator = Math.pow(1 + monthlyinterest, numberOfMonths) - 1;
        double mpayment = (loan * monthlyinterest) / denominator;

        return mpayment;
    
    }
}