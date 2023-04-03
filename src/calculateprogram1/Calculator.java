package calculateprogram1;

public class Calculator {
    static int a, b;
    char symbol;

    public void addition() {//instance method
        int result;
        result = a + b;
        System.out.println("Addition of 2 numbers is " + result);
    }

    public void subtraction() {//instance method
        int result;
        result = a - b;
        System.out.println("Subtraction of 2 numbers is " + result);
    }

    public void multiplication() {//instance method
        int result;
        result = a * b;
        System.out.println("Multiplication of 2 numbers is " + result);
    }

    public void division() {//instance method
        int result;
        result = a / b;
        System.out.println("Division of 2 numbers is " + result);
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition();
        } else if (symbol == '-') {
            subtraction();
        } else if (symbol == '/') {
            division();
        } else if (symbol == '*') {
            multiplication();
        } else {
            System.out.println("Enter a valid operator");
        }

    }
}