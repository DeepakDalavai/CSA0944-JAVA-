class rectangle{
  double length;
  double width;
  public rectangle(double l,double w){
    this.length=l;
    this.width=w;
  }
  public void area(){
    double area=length*width;
    System.out.println("area:"+area);
  }
}
public class R192210646{
  public static void main(String args[]){
    rectangle obj=new rectangle(4,6);
    obj.area();
  
}
}
