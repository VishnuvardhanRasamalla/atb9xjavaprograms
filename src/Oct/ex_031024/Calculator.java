package Oct.ex_031024;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Addition of numbers: " + add(3, 4));
        System.out.println("Subtraction of numbers: " + subtract(13, 4));
        System.out.println("Division of numbers: " + divide(30, 5));
        System.out.println("Multiplication of numbers: " + multiply(3, 4));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 to avoid crashing the program
        }
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
