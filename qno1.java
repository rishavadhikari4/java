import java.util.Scanner;

class TwoDPoint{
    double x;
    double y;
}
class qno1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TwoDPoint p1=new TwoDPoint();
        TwoDPoint p2=new TwoDPoint();
        TwoDPoint p3=new TwoDPoint();
        System.out.println("Enter x and y for point 1:");
        p1.x=sc.nextDouble();
        p1.y=sc.nextDouble();
        System.out.println("Enter x and y for point 2:");
        p2.x=sc.nextDouble();
        p2.y=sc.nextDouble();
        System.out.println("Enter x and y for point 3:");
        p3.x=sc.nextDouble();
        p3.y=sc.nextDouble();
        if(p1.y>p2.y&&p1.y>p3.y)
        {
            System.out.println("The coordinate with highest y is ("+p1.x+","+p1.y+")");
        }
        else if(p2.y>p1.y&&p2.y>p3.y)
        {
            System.out.println("The coordinate with highest y is ("+p2.x+","+p2.y+")");
        }
        else{
            System.out.println("The coordinate with highest y is ("+p3.x+","+p3.y+")");
        }
        sc.close();


    }
}
