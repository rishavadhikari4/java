import java.util.Scanner;
public class EnterName {
    public static void main(String[] args) {
        
   
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String Name = Sc.nextLine();

    System.out.println("Enter your age");
    int Age = Sc.nextInt();

    System.out.println("Enter your height in meters");
    double Height = Sc.nextDouble();

    System.out.println("Do you like Java?");
    boolean likeJava = Sc.nextBoolean();

    System.out.println("\nHello, " + Name + "!");
    System.out.println("You are " + Age + " years old.");
    System.out.println("Your height is " + Height + " meters.");
    System.out.println("Do you like Java? " + likeJava);
    
        Sc.close();
        }
    }
