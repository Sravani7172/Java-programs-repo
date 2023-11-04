import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class userRegistrationLoginException extends Exception{
    public userRegistrationLoginException(String message){
        super(message);
    }
}
public class UserRegistrationLogin {
    public static void main(String[] args) {
        Map<String,String>userdata=new HashMap<>();
        Scanner scan=new Scanner(System.in);
             try{
                    userRegistration(userdata,scan);
                }
                catch(userRegistrationLoginException e){
                    System.out.println("Registraion error:"+e.getMessage());
                }
                try{
                    userLogin(userdata,scan);
                }
                catch(userRegistrationLoginException e){
                    System.out.println("Login error"+e.getMessage());
                }
            }
        private static boolean userRegistration(Map<String,String> userdata,Scanner scan)throws userRegistrationLoginException{
            System.out.println("Enter the username:");
            String username=scan.nextLine().trim();
            System.out.println("Enter the password:");
            String password=scan.nextLine().trim();
            if(userdata.containsKey(username)){
                  throw new userRegistrationLoginException("Username already exists,please choose another option");  
            }
            if(username.isEmpty() || password.isEmpty()){
                throw new userRegistrationLoginException("user data cannot be empty");
            }

            userdata.put(username,password);
            System.out.println("Registration Successful");
            return true;
        } 
        private static void userLogin(Map<String, String> userdata, Scanner scan)throws userRegistrationLoginException {
            System.out.print("Enter your username: ");
            String username = scan.nextLine().trim();
            System.out.print("Enter your password: ");
            String password = scan.nextLine().trim();
    
            if (userdata.containsKey(username) && userdata.get(username).equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
}
