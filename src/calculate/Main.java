package calculate;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first Number");
        int num = scanner.nextInt();
        System.out.println("Please enter second number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter one of operation symbol");
        char c = scanner.next().charAt(0);
        Calculator calculator = new Calculator();
        calculator.addition(5,10);
        calculator.subtraction(5,10);
        calculator.multiplication(5,10);
        calculator.division(5,10);
       calculator.calculateResult(5,10,c);
        System.out.println("Would you like to do more calculation?  Enter 'Y' for yes and  'N' for no ");
        String choice = scanner.next();
    }
}
