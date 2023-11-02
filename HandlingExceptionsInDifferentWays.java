import java.util.Scanner;
class Exceptions{
    void exception1() throws ArithmeticException{
        try{
            System.out.println("Enter the numerator number1:");
            Scanner scan=new Scanner(System.in);
            int number1=scan.nextInt();
            System.out.println("Enter the denominator number2:");
            int number2=scan.nextInt();
            int result=number1/number2;
            System.out.println("Result:"+result);
        }
        catch(Exception e){
            System.out.println("Invalid input:"+e.getMessage());
            throw e;
        }
        finally{
            System.out.println("Connection 2 is terminated");
        }
    }
}
public class HandlingExceptionsInDifferentWays {
    public static void main(String[] args) {
        try{
            Exceptions exceptions=new Exceptions();
            exceptions.exception1();
        }
        catch(Exception e){
            System.out.println("Invalid input from user :"+e.getMessage());
        }
        System.out.println("Connection 1 is terminated");
    }
    
}
