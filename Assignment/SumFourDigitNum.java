import java.util.Scanner;
public class SumFourDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a four-digit number: ");
        int number = sc.nextInt();
        
        if (number < 1000 || number > 9999) {
            System.out.println("Error: Please enter a valid four-digit number.");
        } else {
            int digit1 = number / 1000;
            int digit2 = (number / 100) % 10; 
            int digit3 = (number / 10) % 10;
            int digit4 = number % 10;
            
            int sum = digit1 + digit2 + digit3 + digit4;
            
            System.out.println("The sum of the digits is: " + sum);
        }
        sc.close();
    }
}
