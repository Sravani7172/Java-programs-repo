import java.util.*;
import java.util.Scanner;
class products{
    int id;
    String name;
    double price;
    int numOfItems;
    public products(int id,String name,double price,int numOfItems){
        this.id=id;
        this.name=name;
        this.price=price;
        this.numOfItems=numOfItems;
    }
}
public class SuperMarket {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<products>productlist=new ArrayList<products>();
        System.out.println("Enter the number of products:");
        int number=scan.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("Enter the id:");
            int id=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the name of the product:");
            String name=scan.nextLine();
            System.out.println("Enter the price :");
            double price=scan.nextDouble();
            System.out.println("Number of items:");
            int numOfItems=scan.nextInt();
            products product=new products(id,name,price,numOfItems);
            productlist.add(product);
        }
        System.out.println("Display list of products:"); 
        productlist.forEach(p->System.out.println("["+p.id+" "+p.name+" "+p.price+" "+p.numOfItems+"]"));  
        System.out.println("Enter the product id which you want to buy:");
        int selectedproductid= scan.nextInt();
        Optional<products>useritem=productlist.stream().filter(p->p.id==selectedproductid).findFirst();//.forEach(r->System.out.println("Selected product:"+r.id+" "+r.name+" "+r.price));
        if(useritem.isPresent()){
            System.out.println("selected product:"+useritem.get().name);
            System.out.println("Enter the number of items you want to buy:");
            int itemscount=scan.nextInt();
            double totalprice=useritem.get().price*itemscount;
            System.out.println(totalprice);
        }
        else{
            System.out.println("Product not found with the given id");
        }
        productlist.remove(selectedproductid-1);
        System.out.println("Remaining products list:");
        productlist.stream().forEach(l->System.out.println(l.id+" "+l.name+" "+l.price+" "+l.numOfItems));  
        scan.close();
    }  
}
