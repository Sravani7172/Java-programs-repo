import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
public class lastModified {
    public static void main(String[] args) {
        File file1=new File("\\Myfiles\\lastModified.txt");
        try{
            file1.createNewFile();
            long lastModified=file1.lastModified();
            Date date= new Date(lastModified);
            System.out.println("File was last modified at:"+date);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }

    
}
