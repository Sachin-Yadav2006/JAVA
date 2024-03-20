
class Box{
    double calVol(double width, double height, double depth)
    {
        double vol=width*depth*height;
        return vol;
    }
}
public class BoxDemo{
    public static void main(String[] args){
        Box mybox=new Box();
        Box mybox1=new Box();
        double width=10;
        double height=20;
        double depth=15;
        double Vol;
        double h1=5,w1=6,d1=9;
        Vol=mybox.calVol(width,height,depth);
        
        System.out.println("The volume is " +Vol);
        Vol=mybox1.calVol(h1,w1,d1);
        System.out.println("The second volume is "+ Vol);
    }
    
}
