
class Thread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread1");
            try{
             Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());

            }
        }
    }
}
class  Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread2");
            try{
             Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());

            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start(); 
        t2.start(); 
    }   
}
