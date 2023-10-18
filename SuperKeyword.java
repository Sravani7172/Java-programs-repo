
class Test1{
    int number=10;
    
}
class Test2 extends Test1{
    void display(){
        float number=2.5f;
         System.out.println(super.number);
        
        System.out.println(number);
       
    }
}
public class SuperKeyword {
    public static void main(String[]args){
        Test2 t2 = new Test2();
        t2.display();
    }
}
