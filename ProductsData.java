import java.io.*;
import java.util.*;
class productlistdata{
    String name;
    double price;
    int quantity;
    public productlistdata(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }   
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
}
public class ProductsData {
    public static void main(String[] args)throws Exception {
        ArrayList<productlistdata>productdata=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int number=Integer.parseInt(scan.nextLine());
        for(int i=1;i<=number;i++){
            System.out.println("Enter the product name:");
            String name=scan.nextLine();
            System.out.println("Enter the product price:");
            double price=Integer.parseInt(scan.nextLine());
            System.out.println("Enter the product quantity:");
            int quantity=Integer.parseInt(scan.nextLine());
            productlistdata list=new productlistdata(name,price,quantity);
            productdata.add(list);
        }
        System.out.println("Display list of products:"); 
        productdata.stream().forEach(p->System.out.println("["+p.name+" "+p.price+" "+p.quantity+"]"));  
        System.out.println("Enter the product name which you want to buy:");
        String selectedproductname= scan.nextLine();
        Optional<productlistdata>useritem=productdata.stream().filter(p->p.name.equalsIgnoreCase(selectedproductname)).findFirst();
        if(useritem.isPresent()){
            System.out.println("selected productname:"+useritem.get().name);
            System.out.println("Enter the number of items you want to buy:");
            int quantitycount=Integer.parseInt(scan.nextLine());
            double totalprice=useritem.get().price*quantitycount;
            System.out.println("Totalprice:"+totalprice);
            useritem.get().quantity=useritem.get().quantity-quantitycount;

        }
        else{
            System.out.println("Product not found");
        }
        
        System.out.println("Remaining products list:");
        productdata.stream().forEach(l->System.out.println(l.name+" "+l.price+" "+l.quantity));
      
        FileWriter fw=new FileWriter("ProductData.csv");
        for(productlistdata product:productdata){
            fw.write("Product name:"+product.name+"\t"+"product price:"+product.price+"\t"+"product quantity:"+product.quantity+"\n");
        }
        fw.close();
        
        FileReader fr=new FileReader("ProductData.csv");
        BufferedReader br=new BufferedReader(fr);
        String data;
            while((data = br.readLine())!=null){
                System.out.println(data);
            }
            br.close();
            fr.close();
            scan.close();
    }
}
            















        