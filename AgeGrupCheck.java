import java.util.Scanner;
public class AgeGrupCheck {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int Age = sc.nextInt();
    if(Age<=12){
        System.out.println("Child");

    }
    else if(Age>=13&&Age<=19){
        System.out.println("teenager");
    }
    else if(Age>=20&&Age<=64){
        System.out.println("Addult");

    }
    else{
        System.out.println("Senior");
    }
    sc.close();
    }

}
