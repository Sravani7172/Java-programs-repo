class program extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
        }
    }
}

public class myownProgram {
    public static void main(String[] args) {
        program p=new program();
        p.start();
    }
    
}
