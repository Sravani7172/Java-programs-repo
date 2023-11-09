class number{
    synchronized void printnumber1(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
    }
    synchronized void printnumber2(int n){    
        for(int i=1;i<=1;i++){
            System.out.println(n*i);
        }
    }
}
public class SynchronizationProgram {
    public static void main(String[] args) {
        number n1=new number();
        Thread t1=new Thread(){
        public void run(){
            n1.printnumber1(5);
        }
        };
        Thread t2=new Thread(){
        public void run(){
            n1.printnumber2(100);
        }
        }; 
        t1.start();  
        t2.start();   
    }  
}
