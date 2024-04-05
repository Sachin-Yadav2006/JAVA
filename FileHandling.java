import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) {
       try{
        File file= new File("Filehandling.txt");
        if(file.createNewFile()){
            System.out.println("The file created successfully:"+file.getName());
        }
        else{
            System.out.println("The file already exist!!");
        }
       }
       catch (IOException e) {
            System.out.println("An error has occured!!");
            e.printStackTrace();
       }
    }
}
