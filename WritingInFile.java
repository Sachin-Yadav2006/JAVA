import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("Filehandling.txt");
            Writer.write("Welcome to the file handling section of java!!\n");
            Writer.write("Just exploring the file handling in java!!\n");
            Writer.write("Exploring write method of the FileWriter Class\n");
            //Different write method will not write the text in different lines in the file. 
            Writer.close();
            System.out.println("Successfully written the sentences in the file");
        }
        catch (IOException e){
            System.out.println("An error has occured!!");
            e.printStackTrace();
        }
    }
}
