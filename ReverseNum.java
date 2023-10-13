import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		int reverse=0,lastdigit;
		while(number>0) {
			lastdigit=number%10;
			reverse=reverse*10+lastdigit;
			number=number/10;
		}
		System.out.print(reverse);
        scan.close();
    }
}
