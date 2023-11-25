import java.io.*;
public class CopingReadToWriteFile {
    public static void main(String[] args) {
        File file1=new File("C:\\Myfiles\\firstfile.txt");
        File file2=new File("C:\\Myfiles\\secondfile.txt");
        try{
            FileReader filereader=new FileReader(file1);
            FileWriter filewriter=new FileWriter(file2);
            //BufferedReader reader=new BufferedReader(filereader);
            //BufferedWriter writer=new BufferedWriter(filewriter);
            int data;
            while((data=filereader.read())!=-1){
                filewriter.write(data);
            }
            filereader.close();
            filewriter.close();
            System.out.println("Copied data from"+" "+file1+" "+"to"+" "+ file2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    } 
}



