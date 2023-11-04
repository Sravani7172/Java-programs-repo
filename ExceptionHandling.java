import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("Enter the numerator number1:");
            int number1=scan.nextInt();
            System.out.println("Enter the denominator number2:");
            int number2=scan.nextInt();
            int result=number1/number2;
            System.out.println("Result:"+result);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic exception"+ae.getMessage());
        }
        try{
             System.out.println("Enter the size of the array:");
             int size=scan.nextInt();
             if(size<0){
                System.out.println("Array size cannot be zero");
             }
                int[]array=new int[size];
        }
        catch(NegativeArraySizeException na){
            System.out.println("NegativeArraySizeException"+na.getMessage());
        }
        try{
            System.out.println("Enter the Integer value:");
            int number=scan.nextInt();
        }
         catch(InputMismatchException im){
            System.out.println("InputMismatchException");
        }  
        try{
            System.out.println("Enter the index value:");
            int index=scan.nextInt();
            int[]array={1,2,3,4,5};
            int element=array[index];
            System.out.println("Element at index"+index+":"+element);

        }

        catch(ArrayIndexOutOfBoundsException aio){
            System.out.println("ArrayIndexOutOfBoundException"+aio.getMessage());
        }
        try{
            FileInputStream file_data=null;
            file_data=new FileInputStream("sravs");
        }
        catch(FileNotFoundException fn){
            System.out.println("FileNotFoundException");
        }
        try{
            System.out.println("Enter the Integer value:");
            int number=scan.nextInt();
        }
         catch(InputMismatchException im){
            System.out.println("InputMismatchException"+im.getMessage());
        }         
    }
    
}
