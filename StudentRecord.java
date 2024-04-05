import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class StudentRecord {
    public static void main(String[] args) {
        try{
            File file=new File("StudentRecord.txt");
            file.createNewFile();
            FileWriter Writer=new FileWriter(file);
            Writer.write("StudentName\t\tAge\t\tGender\t\tContactNo\t\tEmailID\n");
            Writer.write("Sachin Yadav\t\t 18\t\tMale\t\t6389681316\t\tsachinyadav@gmail.com\n");
            Writer.write("Rohin Kumar\t\t 18\t\tMale\t\t6389812336\t\trohinkumarv@gmail.com\n");
            Writer.write("Priyanshu \t\t 19\t\tMale\t\t369852172\t\tpriyanshuv@gmail.com\n");
            Writer.write("Ashish Kushwaaha\t\t18\t\tMale\t\t8726112768\t\tashishkushwaha@gmail.com\n");
            Writer.write("Aman Kumar Panika\t\t19\t\tMale\t\t1234567890\t\tpanikakumaraman@gmail.com");
            Writer.close();
            Scanner Reader=new Scanner(file);
            System.out.println("The details of the students are as follows:");
            while (Reader.hasNextLine()) {
                String data=Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(Exception e){
            System.out.println("An error has occured!!");
            e.printStackTrace();
        }
    }
}
