import java.util.Scanner;

public class sumofeven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("Enter the number:"+number);
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.print("Sum of all even numbers from 1 to"+number+": "+sum);
		scan.close();
    }
}
