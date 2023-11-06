package calculate;

/**
 * Create four methods with names "addition","subtraction","division" and "multiplication"
 * Create four instance method with no return type with parameter of int type and print result
 */
public class Calculator {

    public void addition(int a, int b) {//instance addition method

        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));//print result
    }

    public void subtraction(int a, int b) {//instance subtraction method

        System.out.println("Subtraction  of " + a + " and " + b + " is " + (a - b));//print result
    }

    public void division(int a, int b) {// instance division method

        System.out.println("Division of " + a + " and " + b + " is " + (a / b));//print result
    }

    public void multiplication(int a, int b) {//instance multiplication method

        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));//print result
    }

    //Calculating result
    public void  calculateResult(int a, int b, char c) {
        char ch = 0;
        if (ch == '+') {
            System.out.println (a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println (a * b);
        } else if (ch == '/') {
            System.out.println(a / b);
        }

    }
}