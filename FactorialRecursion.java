import java.util.Scanner;
public class FactorialRecursion {
        static long factorial(int number){
            if(number==0 || number==1) {
                return 1;
            }
            return number*factorial(number-1);
        }
        public static void main(String[]args) {
            Scanner scan=new Scanner(System.in);
            int number = scan.nextInt();
            
            System.out.print(factorial(number));
            scan.close();
        }
    }
