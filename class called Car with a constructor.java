class car{
    String make;
    String model;
    int year;
    public car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void details(){
        System.out.println("car Make: "+make);
        System.out.println("car Model: "+model);
        System.out.println("car Year: "+year);
    }
}
public class R192210646{
    public static void main(String args[]) {
        car obj= new car("bmw","classic",2021);
        obj.details();
    }
}
