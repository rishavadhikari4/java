import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a letter: ");
        char cha = scanner.next().toLowerCase().charAt(0);
        

        if (!Character.isLetter(cha)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else {

            if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
                System.out.println(cha + " is a vowel.");
            } else {
                System.out.println(cha + " is a consonant.");
            }
        }

        scanner.close();
    }
    
}