
import java.util.Scanner;
public class atm1{
public static void main(String [] args){
int PIN=1234;
int balance=50000,widthown,deposit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your PIN");
int inputPin=sc.nextInt();

if(PIN==inputPin){
    System.out.println("Welcome to your ATM");
    System.out.println("SELECT OPTION:");
    System.out.println(" 1 : To Withdow \n 2 : To Deposit \n 3: Check Balance \n 4 :Exit");
  int choice=sc.nextInt();
  if(choice==1){
    System.out.println("Enter money to withdrow");
    int withdrowMoney=sc.nextInt();
    System.out.println("Enter PIN to confirm");
    int checkPin=sc.nextInt();
    if(checkPin==PIN){  
        if(withdrowMoney<=balance){
            balance=balance-withdrowMoney;
            System.out.println(" Success to withdrow : "+withdrowMoney+" FRW \n New balance : "+balance+" FRW");

        }else{
            System.out.println("Balance is not enough,Your balance :" +balance +"FRW");
        }

    }else{
        System.out.println("Incorrect PIN") ; 
    }
  }else if(choice==2){
    System.out.println("Enter money you want to deposit");
    int inputDep= sc.nextInt();
    balance=balance+inputDep;
    System.out.println("Enter PIN to confirm");
    int checkPin=sc.nextInt();
    if(checkPin==PIN){  
        System.out.println("Success to deposit,Your New balance is : "+balance);
    }else{
        System.out.println("Incorrect PIN") ; 
    }
  }

  else if(choice==3){
    System.out.println("Enter PIN to confirm");
    int checkPin=sc.nextInt();
    if(checkPin==PIN){  
        System.out.println("Your balance is : "+balance+" FRW");
    }else{
        System.out.println("Incorrect PIN") ; 
    }
  }
  else if(choice==4){
    System.out.println("You have Exit !!!");
  }
  else{
    System.out.println("Incorrect choice");
  }



    
}else{
    System.out.println("Incorrect PIN") ;
}






    }
}