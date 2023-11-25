import java.io.*;
import java.util.*;
public class Employeelist {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        //file1
        //write the employee1 file
        FileWriter fWriter=new FileWriter("employee1.txt");
        BufferedWriter bw1=new BufferedWriter(fWriter);
        System.out.println("Enter the file1 employee details:");
        System.out.println("Enter the employee id:");
        int id=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the employee name:");
        String name=scan.nextLine();
        System.out.println("Enter the employee field:");
        String field=scan.nextLine();
        System.out.println("Enter the employee salary:");
        long salary=Integer.parseInt(scan.nextLine());
        bw1.write("EmployeeID:"+id+"\t"+"Employee name:"+name+"\t"+"Employee field"+field+"\t"+"Employee salary:"+salary+"\n");
        bw1.close();
        //file2
        //Write the employee2 file
        FileWriter fWriter2=new FileWriter("employee2.txt");
        BufferedWriter bw2=new BufferedWriter(fWriter2);
        System.out.println("Enter the file2 employee details:");
        System.out.println("Enter the employee id:");
        int id2=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the employee name:");
        String name2=scan.nextLine();
        System.out.println("Enter the employee field:");
        String field2=scan.nextLine();
        System.out.println("Enter the employee salary:");
        long salary2=Integer.parseInt(scan.nextLine());
        bw2.write("EmployeeID:"+id2+"\t"+"Employee name:"+name2+"\t"+"Employee field"+field2+"\t"+"Employee salary:"+salary2+"\n");
        bw2.close();
        //file3
        //write the employee3 file
        FileWriter fWriter3=new FileWriter("employee3.txt");
        BufferedWriter bw3=new BufferedWriter(fWriter3);
        System.out.println("Enter the file3 employee details:");
        System.out.println("Enter the employee id:");
        int id3=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the employee name:");
        String name3=scan.nextLine();
        System.out.println("Enter the employee field:");
        String field3=scan.nextLine();
        System.out.println("Enter the employee salary:");
        long salary3=Integer.parseInt(scan.nextLine());
        bw3.write("EmployeeID:"+id3+"\t"+"Employee name:"+name3+"\t"+"Employee field"+field3+"\t"+"Employee salary:"+salary3+"\n");
        bw3.close();
        //read employee1 file
        FileReader fr1=new FileReader("employee1.txt");
        BufferedReader br1=new BufferedReader(fr1);
        //mergefile
        FileWriter fw1=new FileWriter("Merge.txt");
        String data1;
        while((data1 = br1.readLine())!=null){
            fw1.write(data1+"\n"); 
        }
        
        br1.close();
        //read employee2 file
        FileReader fr2=new FileReader("employee2.txt");
        BufferedReader br2=new BufferedReader(fr2);
        String data2;
        while((data2 = br2.readLine())!=null){
            fw1.write(data2+"\n");              
        }
        br2.close();
        //read employee3 file
        FileReader fr3=new FileReader("employee3.txt");
        BufferedReader br3=new BufferedReader(fr3);
        String data3;
        while((data3 = br3.readLine())!=null){
             fw1.write(data3+"\n");  
        }
        br3.close();
        fw1.close();
        scan.close();    
    }
}








        




    

