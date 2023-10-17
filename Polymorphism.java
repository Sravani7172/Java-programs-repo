public class Polymorphism {
    public static void main(String[]args){
        CargoPlane cargoplane = new CargoPlane();
        PassengerPlan passengerplan = new PassengerPlan();
        FighterPlan fighterplan = new FighterPlan();
        Plan ref;
        ref=cargoplane;
        ref.fly();
        ref=passengerplan;
        ref.fly();
        ref=fighterplan;
        ref.fly();
    } 
}
class Plan{
    public void takeoff(){
        System.out.println("Plan is taking off");
    }
    public void fly(){
        System.out.println("Plan is flying");
    }
}
class CargoPlane extends Plan{
    public void fly(){
        System.out.println("CargoPlan is flying at low height");
    }
}
class PassengerPlan extends Plan{
    public void fly(){
        System.out.println("PassengerPlan is flying at medium height");
    }
}
class FighterPlan extends Plan{
    public void fly(){
        System.out.println("FighterPlan is flying at great height");
    }
}
