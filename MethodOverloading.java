
class Calculator{
    int add(int a,int b){
        System.out.println("add1");
        return a+b;
    }
    float add(float a,float b){
        System.out.println("add2");
        return a+b;
    }
    double add(float a,double b){
        System.out.println("add3");
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[]args){
        Calculator c = new Calculator();
        System.out.println(c.add(1.4f,10.2));
        
    }
    
}
