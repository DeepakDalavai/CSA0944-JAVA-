public class R192210646{
  public void sum(int a,int b){
    int s=a+b;
    System.out.println("sum:"+s);
  }
  public void sum(double a,double b){
    double m=a+b;
    System.out.println("sum:"+m);
  }
  public static void main(String args[]){
    R192210646 obj=new R192210646();
    obj.sum(3,4);
    obj.sum(2.34,3.43);
  }
}
