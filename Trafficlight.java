import java.util.Scanner;
class Traffic{
    String color;
    int duration;
    public Traffic(String color,int duration){
        this.color=color;
        this.duration=duration;
    }
    public String getColor(){
        return color;
    }
    public int getDuration(){
        return duration;
    }
    public void changeColor(String newColor,int newDuration){
        color=newColor;
        duration=newDuration;
    }
    public boolean isRed(){
        return color.equalsIgnoreCase("Red");
    }
    public boolean isGreen(){
        return color.equalsIgnoreCase("Green");
    }
    public void countduration(int durationReduce){
        if(duration>durationReduce){
            duration=duration-durationReduce;
        }
        else{
            duration = 0;
        }
    }
}
public class Trafficlight {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Traffic trafficLight=new Traffic("Red", 60);
        System.out.println("Present traffic light color is:"+trafficLight.getColor());
        System.out.println("If is it red:"+trafficLight.isRed());
        System.out.println("If is it green:"+trafficLight.isGreen());
        System.out.println("Enter the no of seconds to countduration:");
        int durationReduce=scan.nextInt();
        trafficLight.countduration(durationReduce);
        System.out.println("Duration left for"+trafficLight.getColor()+":"+trafficLight.getDuration());

        trafficLight.changeColor("Green", 45);
        System.out.println("Present traffic light color is:"+trafficLight.getColor());
        System.out.println("If is it red:"+trafficLight.isRed());
        System.out.println("If is it green:"+trafficLight.isGreen());
         trafficLight.countduration(durationReduce);
        System.out.println("Duration left for"+trafficLight.getColor()+":"+trafficLight.getDuration());


        scan.close();
    }   
}

