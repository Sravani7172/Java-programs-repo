/*import java.util.*;
import java.util.Scanner;
class Donardetails{
    String name;
    long number;
    String bloodgroup;
    public Donardetails(String name,long number,String bloodgroup){
        this.name=name;
        this.number=number;
        this.bloodgroup=bloodgroup;
    }
        public String getName(){
             return this.name;
        }
        public long getNumber(){
            return this.number;
        }
        public String getBloodgroup(){
            return this.bloodgroup;
        }
}
class patients{
    String name;
    int priority;
    String bloodgroup;
    public patients(String name,int priority,String bloodgroup){
        this.name=name;
        this.priority=priority;
        this.bloodgroup=bloodgroup;
    }
} 
class Bloodbank{
    int A=5;
    int AB=3;
    int b=1;
    int O=4;
}   

public class BloodGroup {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Donardetails dd=new Donardetails("meka",1234567890,"B");
        //List<String>donar=new ArrayList<>();
        System.out.println("Enter donar name:"+dd.getName());
        System.out.println("Enter donar Number:"+dd.getNumber());
        System.out.println("Enter donar bloodgroup:"+dd.getBloodgroup());
        
    }
    
}*/
import java.util.*;
import java.util.stream.*;

class Items {
    String pname;
    int price;
    int countP;

    public Items(String pname, int price, int countP) {
        this.pname = pname;
        this.price = price;
        this.countP = countP;
    }
}

class BloodGroup {
    public static void main(String[] args) {
        List<Items> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna add the products: ");
        String choice = sc.nextLine();
        while(!choice.equalsIgnoreCase("no")){
            System.out.println("Product name: ");
            String pname = sc.nextLine();
            System.out.println("Price: ");
            int price = sc.nextInt();
            System.out.println("No.of products: ");
            int countP = sc.nextInt();
            productList.add(new Items(pname, price, countP));
            sc.nextLine();
            System.out.println("Do you want to add more? (yes/no):");
            choice = sc.nextLine();
        }
        System.out.println("The products available in supermarket are: ");
        productList.stream().forEach(pr -> System.out.println(pr.pname));
        System.out.println("Enter the item you wanna buy: ");
        String prName = sc.nextLine();
        Optional<Items> optr = productList.stream().filter(pr->pr.pname.equalsIgnoreCase(prName)).findFirst();
        if(optr.isPresent()){
            Items pr = optr.get();
            System.out.println("How many items you wanna buy? : ");
            int cnt = sc.nextInt();
            if(cnt <= pr.countP){
                pr.countP -= cnt;
                System.out.println("Total cost for "+pr.pname+" is Rs."+((pr.price)*cnt)+".");
                System.out.println("You have successfully purchased "+pr.pname);
            }
            else{
                System.out.println(pr.pname+" sold out");
            }
        }
        else{
            System.out.println("Item not found!");
        }
        System.out.println("Products left after buying: ");
        productList.stream().filter(x-> x.countP > 0).map(y -> y.pname + " , "+ y.price + " , "+ y.countP).distinct().collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
        sc.close();
    }
}
