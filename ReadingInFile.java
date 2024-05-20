import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingInFile {
    public static void main(String[] args) {
        try {
            File file = new File("Filehandling.txt");
            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error  has occured!!");
        }
    }
}
