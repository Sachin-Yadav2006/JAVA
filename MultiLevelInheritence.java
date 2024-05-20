
// LAB TEST
//Sachin Yadav 
//Roll No. 152348
//Examination Roll no. 23312915044 
//Question 1. Write a code to demonstrate Multi-level Inheritance in Java. Include access modifiers in the demonstration.

class car{
    private String company="xyz";       //private members can only be accessed inside the class
    int SerialNo=890;     //default elements can only be accessed inside the same package 
    void printdetails(){
        System.out.println("The car is manufactured by the company : "+company);    //Private can be accessed inside the class 
    }
}
class CarSpecs extends car{
    public int modelno=789;     //public members can be accessed anywhere 
    void display(){
        System.out.println("Inside the display function of the CarSpecs class ");
        //System.out.println("The manufacturer of the car is company: "+ company); //This line would give error as private members cannot be accessed outside.
        //Printing the company's name using a function
        printdetails(); //printdetails method can be called inside this child class 
        System.out.println("The Serial no of the car is : "+ SerialNo);
    }
    
}
//One more level of inheritance 
class CarVariant extends CarSpecs{
    String Variant="Diesel";
    void printvar(){
        System.out.println("For the model no : "+modelno+" out of the variants diesel, petrol and cng, this car is of the following variant : ");
        System.out.println(Variant);
    }
}


public class MultiLevelInheritence {
    public static void main(String[] args) {
        CarSpecs c = new CarSpecs();
        c.display();
        CarVariant cv= new CarVariant();
        cv.printvar();

    }
}
