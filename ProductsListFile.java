import java.io.*;
import java.util.*;
class productlist{
    String name;
    double price;
    int noOfProduct;
    public productlist(String name,double price,int noOfProduct){
        this.name=name;
        this.price=price;
        this.noOfProduct=noOfProduct;
    }   
}
public class ProductsListFile {
    public static void main(String[] args) {
        ArrayList<productlist>productList=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int number=scan.nextInt();
        scan.nextLine();
        for(int i=1;i<=number;i++){
            System.out.println("Enter the product name:");
            String name=scan.nextLine();
            System.out.println("Enter the product price:");
            double price=scan.nextDouble();
            scan.nextLine();
            System.out.println("Number of products:");
            int noOfProduct=scan.nextInt();
            scan.nextLine();
            productlist list=new productlist(name,price,noOfProduct);
            productList.add(list);
        }
            String path="C:\\Myfiles\\productlist.txt";
            File file=new File(path);
        try{
            file.createNewFile();
            FileWriter writer=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(writer);
            //PrintWriter printwriter= new PrintWriter(writer);
            for(productlist product:productList){
                bw.write("Product name:"+product.name+"\t"+"product price:"+product.price+"\t"+"noOfProducts:"+product.noOfProduct+"\n");
            }
            bw.close();
            writer.close();
            System.out.println("Data has been written into the file");
            FileReader reader=new FileReader(file);
            BufferedReader br=new BufferedReader(reader);
            String data;
            while((data = br.readLine())!=null){
                System.out.println(data);
            }
            br.close();
            reader.close();
            System.out.println("Data has been reader into the file");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }   
}
