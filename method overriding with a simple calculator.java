class calculator{
    public double add(double a,double b) {
        return a+b;
    }
    public double subtract(double a,double b) {
        return a-b;
    }
    public double multiply(double a,double b) {
        return a*b;
    }
    public double divide(double a,double b) {
        if (b!=0) {
            return a/b;
        }else{
    System.out.println("Error: Division by zero.");
            return 0;
        }
    }
}
class scientificcalculator extends calculator{
    @Override
    public double multiply(double a,double b) {
        double result=a*b;
        return result*result;
    }
}
public class R192210646 {
    public static void main(String args[]) {
        calculator obj=new calculator();
        scientificcalculator obj1 = new scientificcalculator();
        System.out.println("Addition: " +obj.add(5, 3));
        System.out.println("Subtraction: " +obj.subtract(5, 3));
        System.out.println("Multiplication: "+obj.multiply(5, 3));
        System.out.println("Division: " +obj.divide(5, 3));

        System.out.println("Addition: " + obj1.add(5, 3));
        System.out.println("Subtraction: " + obj1.subtract(5, 3));
        System.out.println("Multiplication (complex): " + obj1.multiply(5, 3));
        System.out.println("Division: " + obj1.divide(5, 3));
    }
}
