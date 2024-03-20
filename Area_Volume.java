import java.util.Scanner;
//Multilevel Inheritance
//14

class Area extends Volume{
    double rectangle(double length, double breadth){
        double area_rec=length*breadth;
        return area_rec;
    }
    double square(double side){
        double area_s=side*side;
        return area_s;
    }
    double sphere(double radius){
        double area_sp=4*3.14*radius*radius;
        return area_sp;
    }
    double circle(double radius){
        double area_c=3.14*radius*radius;
        return area_c;
    }
    double cone(double radius,double slant_height){
        double area_cone=3.14*radius*slant_height;
        return area_cone;
    }
    double triangle(double side1,double side2,double side3){
        double semi_peri=(side1+side2+side3)/2;
        double area_S=(semi_peri*(semi_peri-side1)*(semi_peri-side2)*(semi_peri-side3));
        double area_tr=Math.pow(area_S,0.5);
        return area_tr;
    }
    double cube(double side){
        double area_cube=6*side*side;
        return area_cube;
    }
    double cylinder(double radius,double height){
        double area_cy=2*3.14*radius*height;
        return area_cy;
    }
}
class Volume{
    double sphere_vo(double radius){
        double vol_sp=4/3*3.14*radius*radius*radius;
        return vol_sp;
    }
    
    double cone(double radius,double height){
        double vol_cone=1/3*3.14*radius*radius*height;
        return vol_cone;
    }
    double cube_vo(double side){
        double vol_cube=side*side*side;
        return vol_cube;
    }
    double cylinder_vo(double radius,double height){
        double vol_cy=3.14*radius*radius*height;
        return vol_cy;
    }
    double cuboid(double length,double breadth,double height){
        double vol_cuboid=length*breadth*height;
        return vol_cuboid;
    }
}
public class Area_Volume extends Area{
    public static void main(String[] args) {
        Area_Volume ar_vo= new Area_Volume();
        System.out.println("Enter the length and breadth of the rectange:");
        Scanner obj=new Scanner(System.in);
        double length=obj.nextDouble();
        double breadth=obj.nextDouble();
        System.out.println("The area of the rectangle is :"+ar_vo.rectangle(length,breadth));
        System.out.println("Enter the length , breadth and height of the cuboid respectively: ");
        double length1=obj.nextDouble();
        double breadth1=obj.nextDouble();
        double height=obj.nextDouble();
        System.out.println("The Volume of the cuboid with the dimensions entered is :"+ar_vo.cuboid(length1, breadth1, height));
        System.out.println("Enter the radius of the sphere: ");
        double radius=obj.nextDouble();
        System.out.println("The outer surface area of the sphere is : "+ar_vo.sphere(radius));
        obj.close();
    }
}
