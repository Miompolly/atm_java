public class students{
    int Age;
    String RegNumber;
    students(){};
    students(int Age,String RegNumber){
        this.Age=Age;
        this.RegNumber=RegNumber;
    }
   
    // addData(){};

    // public void addData(String lname,String fname){
    //     this.lname=lname;
    //     this.fname=fname;
    //     return fname+lname;
    // }
public static void main(String[] args) {
       students std1=new students();
       std1.Age=25;
       std1.RegNumber="22/16499";
       students std2 =new students(24,"22663");
       System.out.println(std1.Age+" , "+std1.RegNumber);
       System.out.println("Students 2 "+std2.Age+" , "+std2.RegNumber);



    //   addData std7=new addData();
    //   std7.addData("joel","MINANI");


    //    System.out.println(std7.lname+","+std7.fname);
       



    }
}