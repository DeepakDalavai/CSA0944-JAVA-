class bank{
  int acc_num;
  int initialbalance;
  public bank(int acc_num,int balance){
    this.acc_num=acc_num;
    this.initialbalance=balance;
    System.out.println("account number:"+acc_num);
    System.out.println("initial balance:"+initialbalance);
  }
  public void deposit(int amount){
    initialbalance+=amount;
    System.out.println("balance after deposit:"+initialbalance);
  }
  public void withdraw(int amount){
    initialbalance-=amount;
        System.out.println("balance after withdraw:"+initialbalance);
  }
}
public class R192210646{
  public static void main(String args[]){
    bank obj=new bank(473085,1000);
    obj.deposit(200);
    obj.withdraw(300);
  }
}
