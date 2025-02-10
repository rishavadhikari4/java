import java.util.Scanner;

public class ConcentricCircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the outer circle: ");
        double outerRadius = sc.nextDouble();
        
        System.out.print("Enter the radius of the inner circle: ");
        double innerRadius = sc.nextDouble();
        
        if (innerRadius >= outerRadius) {
            System.out.println("Error: Inner radius should be smaller than outer radius.");
        } else {

            double outerArea = Math.PI * outerRadius * outerRadius;
            double innerArea = Math.PI * innerRadius * innerRadius;
            double areaBetween = outerArea - innerArea;
            
            System.out.println("The area between the two concentric circles is: " + areaBetween);
        }
        sc.close();
    }
}
