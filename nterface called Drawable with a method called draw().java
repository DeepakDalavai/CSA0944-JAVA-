interface drawable{
  void draw();
}
class circle implements drawable{
  @Override
  public void draw(){
    System.out.println("Drawing a circle.");
  }
}
class square implements drawable{
  @Override
  public void draw(){
    System.out.println("Drawing a square.");
  }
}
public class R192210646{
  public static void main(String args[]){
    drawable a = new circle();
    drawable b = new square();
    
    a.draw();
    b.draw();
  }
}
