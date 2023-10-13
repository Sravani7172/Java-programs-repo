import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int N;
		N=scan.nextInt();
		int num,sum=0;
		float avg;
		for(int i=0;i<N;i++) {
			num=scan.nextInt();
			sum=sum+num;
		}
		avg =sum/N;
		System.out.println("Average:"+avg);	
        scan.close();
    }
}
