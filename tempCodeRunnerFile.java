public class bankAccount{
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
