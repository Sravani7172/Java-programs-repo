
public class Encapsulation {
    public static void main(String[]args){
        BankAccount bala = new BankAccount();
        bala.setData(10000);
        System.out.println(bala.getData());
    }
}
 class BankAccount{
        private long balance;
        public void setData(long amount){
            if(amount>=0){
             balance=amount;
            }
            else{
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        public long getData(){
            return balance;
        }
    }

