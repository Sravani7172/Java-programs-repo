import java.util.Arrays;
import java.util.Scanner;
public class AverageValue {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=scan.nextInt();
        int[]arrayElements=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arrayElements.length;i++){
            arrayElements[i]=scan.nextInt();
        }
        int sum=0;
        int average=0;
        for(int i=0;i<arrayElements.length;i++){
            sum=sum+arrayElements[i];
        }
        System.out.println("sum:"+sum);
        average=sum/size;
        System.out.println("Average value:"+average);

    }
    
}
