class person{
  String name;
  int age;
  public person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void details(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
  }
}
public class R192210646{
  public static void main(String args[]){
    person obj=new person("roman reigns",35);
    obj.details();
  }
}
