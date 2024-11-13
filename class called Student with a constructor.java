class student {
    String name;
    int idnum;
    int marks1;
    int marks2;
    int marks3;
    public void details(String name,int idnum,int marks1,int marks2,int marks3){
        this.name=name;
        this.idnum=idnum;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public int average(){
        return (marks1+marks2+marks3)/3;
    }
    public String grade() {
        int avg=average();
        if(avg>=90){
            return "A grade";
        }
      else if(avg>=80){
            return "B grade";
        } else if(avg>=70){
            return "C grade";
        } else{
            return "Fail";
        }
    }
    public void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+idnum);
        System.out.println("Marks: "+marks1+ " "+marks2+" "+marks3);
        System.out.println("Average: " +average());
        System.out.println("Grade: " +grade());
    }
}
public class R192210646 {
    public static void main(String args[]) {
        student obj1 = new student();
        obj1.details("Deepak",23,76,87,67);
        obj1.printDetails();
    }
}
