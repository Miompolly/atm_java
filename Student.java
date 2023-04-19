public class Humans {
    String name;
    String location;
    int height;

    public static void main(String[] args) {
        Humans pers1 = new Humans();
        Student std1 = new Student();
        std1.height = 175;
        std1.regNumber="22/1622";
        System.out.println("Height: "+std1.height);
        System.out.println("REGNUMBER: "+std1.height);
        book bk=new book();
        bk.regNumber="333";
        bk.bookNumber=12;
        bk.name="Anitha";
        System.out.println("Student Name : "+bk.name+" Reg Number "+bk.regNumber+ "  & Book Number: "+bk.bookNumber);

        fac fc1=new fac();
        fc1.name="Joel";
        fc1.regNumber="22/16499";
        fc1.bookNumber=12;
        fc1.depart="CS";
        fc1.fc="AFS";


        System.out.println("Student Name : "+fc1.name+" Reg Number "+fc1.regNumber+ "  & Book Number: "+fc1.bookNumber+" Dep "+fc1.depart+" Faculty "+fc1.fc );

    }
}
    public class Student extends Humans{
        String regNumber;
}
  
public class book extends Student{
    int bookNumber;
}


public class dep extends book{
     String depart;
}
public class fac extends dep{
    String fc;
}