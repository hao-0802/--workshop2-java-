import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = pi * Math.pow(radius,2);
        System.out.println("Area of circle = "+ area);
        sc.close();
    }
}

