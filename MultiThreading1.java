class Thread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
public class MultiThreading1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        
        Thread t1=new Thread(thread1);
       
        t1.start();
        t1.interrupt();
            try{
                if(t1.isInterrupted())
                {
                    throw new InterruptedException("Thread is Interrupted");
                }
            }
            catch(InterruptedException ie){
                System.out.println("Interrupted exception occurs");

            } 
        
    }   
}
