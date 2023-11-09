
class MyProgram extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Hello Thread1");
        } 
    }
}
class MyProgram1 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Hello Thread2");
        } 
    }
}
public class JoinProgram {
    public static void main(String[] args) {
        MyProgram mp=new MyProgram();
        MyProgram1 mp1=new MyProgram1();
        mp.start();
        mp1.start();
        mp1.interrupt();
        try{
            if(mp1.isInterrupted())
            {
                throw new InterruptedException("Interrupted Exception occurs");
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie.getMessage());
        }
        try{
            mp.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        try{
            mp1.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        } 
    }  
}
