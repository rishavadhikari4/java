import java.util.Scanner;
public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many you want to print");
        int n = sc.nextInt();
        int count = 0;
        int num = 1;
        
        while (count < n) {
            if (num % 3 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        sc.close();
    }
}