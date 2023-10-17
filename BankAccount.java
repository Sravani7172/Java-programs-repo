public class BankAccount {
    public static void main(String[]args){
        bankAccount bala = new bankAccount();
        bala.setData(1000000);
        System.out.println(bala.getData());
    }
}
    
     class bankAccount{
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
