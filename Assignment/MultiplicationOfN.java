import java.util.Scanner;
public class MultiplicationOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        long product = 1;
        int i = 1;
        while (i <= n) {
            product *= i;
            i++;
        }
        System.out.println("Multiplication (Factorial) of " + n + " is: " + product);
    }
}