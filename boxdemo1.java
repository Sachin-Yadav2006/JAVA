class Box{
    double height,width,depth;
    void volume(){
    System.out.println("Volume is ");
    System.out.println(width*height*depth);
    }
}
class boxdemo1{
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box();
        //double vol;
        mybox1.height=10;
        mybox1.width=20;
        mybox1.depth=15;
        mybox2.height=5;
        mybox2.width=10;
        mybox2.depth=15;
        mybox1.volume();
        mybox2.volume();

    }
}