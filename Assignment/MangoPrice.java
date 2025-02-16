import java.util.Scanner;

public class MangoPrice {
    public static void main(String[] args) {
        double pricePerDozen = 100.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of mangoes: ");
        int n = scanner.nextInt();
        
        double pricePerMango = pricePerDozen / 12;
        double totalPrice = pricePerMango * n;
        
        System.out.println("Price of " + n + " mangoes: " + totalPrice);
        
        scanner.close();
    }
}
