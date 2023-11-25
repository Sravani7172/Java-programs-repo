import java.io.FileReader;
import java.util.*;
import java.io.*;
public class fileMethods {
    public static void main(String[] args) {
        String path="C:\\Myfiles\\FileReader.txt";
        File file=new File(path);
        try{

            FileReader fr=new FileReader(path);
            System.out.println(fr.read());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
