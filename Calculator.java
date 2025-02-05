import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Number A");
    int num1 = sc.nextInt();
    
    System.out.println("Enter Another Number B");
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;
    int remainder = num1 % num2;

    System.out.println("\nResults:");
    System.out.println("Addition: " + sum);
    System.out.println("Subtraction: " + difference);
    System.out.println("Multiplication: " + product);
    System.out.println("Division: " + quotient);
    System.out.println("Remainder: " + remainder);

    sc.close();
    }
}
