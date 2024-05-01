import java.io.InputStream;

public class filesinputoutput {
    public static void main(String[] args) {
        InputStream obj=new FileInputStream("inputoutput.java");
        System.out.print(obj.available());
    }
}
