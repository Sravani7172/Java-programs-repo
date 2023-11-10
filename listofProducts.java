import java.util.*;
class products{
    int id;
    String name;
    double price;
    public products(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class listofProducts {
        public static void main(String[] args) {
            List<products>productlist=new ArrayList<products>();
            productlist.add(new products(1,"Dairymilk Chocolates",500));
            productlist.add(new products(2,"Chocolate Icecreams",400));
            productlist.add(new products(3,"Persona soaps",300));
            productlist.add(new products(4,"Maggie",200));
            productlist.add(new products(5,"Dove Shampoos",185));
            System.out.println("List of products:");
            productlist.stream().forEach(p->System.out.println(p.name));

            System.out.println("List of product prices:");
             productlist.stream().forEach(p->System.out.println(p.price));
            
            long count=productlist.stream().filter(p->p.price>300).count();
            System.out.println("Counting the products which is greater than 300: "+count);
            productlist.stream().filter(p->p.price>300).forEach(p->System.out.println(p.name));           
        }
    
}
