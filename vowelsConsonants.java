import java.util.Scanner;

public class vowelsConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		char character = scan.next().charAt(0);
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
        || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println(character + " is Vowel");
        } 
		else {
            System.out.println(character + " is Consonant");
        }
		scan.close();
    }
}
