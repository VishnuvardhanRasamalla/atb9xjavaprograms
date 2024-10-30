package Oct.ex_11102024;

public class Logicaloop {
    public static void main(String[] args) {
        int a=10, b=150, c= -5;
        boolean allPositive = (a > 0 && b > 0 && c > 0);
        boolean atleastOneIsGreaterThanOne = (a > 100 || b > 100 || c > 100);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Atleast one number is greater than 100: " + atleastOneIsGreaterThanOne);

    }
}
