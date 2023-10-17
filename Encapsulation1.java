public class Encapsulation1 {
    public static void main(String[]args){
        Customer c1=new Customer();
        c1.setData(10,"Sravs",9988776655L);
        System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getCnumber());
    }
    
}
class Customer{
    private int cid;
    private String cname;
    private long cnumber;
    public void setData(int cid,String cname,long cnumber){
        this.cid=cid;
        this.cname=cname;
        this.cnumber=cnumber;
    }
    public int getCid(){
        return cid;
    }
    public String getCname(){
        return cname;
    }
    public long getCnumber(){
        return cnumber;
    }
    
}
