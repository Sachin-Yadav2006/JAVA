
class Box {
    double width;
    double height;
    double depth;

    double Volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10, 20, 30);
        mybox2.setDim(8, 7, 6);
        vol = mybox1.Volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.Volume();
        System.out.println("Volume is " + vol);
    }
}