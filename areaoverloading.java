import java.util.*;

class Area{
    void area(int radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is : "+area);
    }

    void  area(int length,int breadth){
        double area=length*breadth;
        System.out.println("Area of Rectanglre is : "+area);
    }

    void  area(float base, int height){
        double area=0.5*base*height;
        System.out.println("Area of triangle is : "+area);
} 
}

class areaoverloading{
    public static void main(String[] args) {
        Area shapes= new Area();
        shapes.area(5);
        shapes.area(5, 10);
        shapes.area(20, 30);
    }
   
}