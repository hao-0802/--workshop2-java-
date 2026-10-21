import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter second integer: ");
        int num2 = scanner.nextInt();

        int difference = num1 - num2;
        System.out.println("Difference of two numbers = " + difference);

        scanner.close();
    }
}
