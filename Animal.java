

 class Animals{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void tail(){
        System.out.println("Animal have tail");
    }
}
 class Mammal extends Animals{
    public void MammaryGlands(){
        System.out.println("Mammal animal have mammary glands");
    }
}
class Reptile extends Animals{
    public void layeggs(){
        System.out.println("Reptile layeggs");
    }
}
class Tiger extends Mammal{
    public void eat(){
        System.out.println("Tiger eats meat");
    }
    public void habitat(){
        System.out.println("Tiger habitats or lives in forest");
    }
}
class Lizard extends Reptile{
    public void crawl(){
        System.out.println("Lizard crawls on the ground");
    }
}
public class Animal {
    public static void main(String[]args){
        Tiger tiger = new Tiger();
        Lizard lizard = new Lizard();
        tiger.eat();
        tiger.tail();
        tiger.habitat();
        tiger.MammaryGlands();
        lizard.layeggs();
        lizard.crawl();
    }
}
    

