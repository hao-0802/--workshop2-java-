import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean stringsEqual = s1.equals(s2);
        System.out.println("the two given strings are equal: "+ stringsEqual);

        char firstChar1 = s1.charAt(0);
        char firstChar2 = s2.charAt(0);
        boolean firstCharEqual = (firstChar1 == firstChar2);
        System.out.println("First characters are equal: "+ firstCharEqual);

        sc.close();
    }
}
