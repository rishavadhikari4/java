import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
    }
}