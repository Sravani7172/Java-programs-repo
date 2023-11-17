import java.io.File;
import java.io.FileWriter;

public class files {
    public static void main(String[] args) {
        //create file
        File file1=new File("C:\\Myfiles\\firstfile.txt");
        try{
            file1.createNewFile();
            System.out.println(file1.getName());
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        File file2=new File("C:\\Myfiles\\secondfile.txt");
        try{
            file2.createNewFile();
            System.out.println(file2.getName());
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //writefile
        try{
            FileWriter writer1 =new FileWriter(file1);
            writer1.write("Hi! This is my first file");
            writer1.flush();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileWriter writer2 =new FileWriter(file2);
            writer2.write("Hi! This is my second file");
            writer2.flush();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //canRead
        System.out.println("canRead file1:"+file1.canRead());
        System.out.println("canRead file2:"+file2.canRead());
        //canWrite
        System.out.println("canWrite:"+file1.canWrite());
        System.out.println("canWrite:"+file2.canWrite());
        //Exists
        System.out.println("Is file1 exists:"+file1.exists()+file1.getName());
        //length
        System.out.println("length of file:"+file1.length());
        //getAbsolutePath
        System.out.println("getAbsolutePath:"+file1.getAbsolutePath());
        //mkdir
        System.out.println("Is mkdir created:"+file1.mkdir());
        //create directory
        File file=new File("C:\\Myfiles\\java");
        System.out.println(file.mkdir());


        

        

        

       
        
    }
    
}
