abstract class Animal{
  public abstract void eat();
  public abstract void sleep();
}
class Dog extends Animal{
  @Override
  public void eat(){
    System.out.println("The dog is eating.");
  }
  @Override
  public void sleep(){
    System.out.println("The dog is sleeping.");
  }
}
class Cat extends Animal{
  @Override
  public void eat(){
    System.out.println("The cat is eating.");
  }
  @Override
  public void sleep(){
    System.out.println("The cat is sleeping.");
  }
}
public class R192210646{
  public static void main(String args[]){
    Animal d1 = new Dog();
    Animal c1 = new Cat();
    
    d1.eat();
    d1.sleep();
    
    c1.eat();
    c1.sleep();
  }
}
