import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        //numericArray
        System.out.println("Enter the size of numeric array:");
        int size = scan.nextInt();
        int[]numericArray=new int[size];
        System.out.println("Enter the numbers:");
        for(int i=0;i<size;i++){
            numericArray[i]=scan.nextInt();
        }
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array:");
        for(int number:numericArray){
            System.out.print(number+" ");
        }
        System.out.println();
        //StringArray
        System.out.println("Enter the size of StringArray:");
        int Stringvalue=scan.nextInt();
        scan.nextLine();
        String[]StringArray=new String[Stringvalue];
        System.out.println("Enter the String elements:");
        for(int i=0;i<StringArray.length;i++){
            StringArray[i]=scan.nextLine();
        }
        Arrays.sort(StringArray);
        System.out.println("Sorted StringArray:");
        for(String string:StringArray){
            System.out.println(string+" ");
        }
    }
    
}
