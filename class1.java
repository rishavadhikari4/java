class Box{
    double l,b,h;//member variable, instance variable, member data
    double getVolume(){
        return l*b*h;
    }
    void setDimensions(double le,double br,double he)
    {
        l=le;
        b=br;
        h=he;
    }
}
 class class1 {
    public static void main(String[] args) {
        Box b1;
        b1=new Box();
        Box b2=new Box();
        b1.l=4;
        b1.b=2;
        b1.h=1;
        double v1=b1.b*b1.h*b1.l;
        System.out.println("The volume of box b1 is:"+v1);
        b2.setDimensions(4,2,3);
       
        double v2=b2.getVolume();
        System.out.println("The volume of box b2 is:"+v2);

    }    
}
//Create a class TwoDPoint with x and y as member variables. Create three instances of TwoDPoint and then print the x and y coordinate of the point with the highest y value.