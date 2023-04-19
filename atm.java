
import java.util.*;
public class atm{
public static void main(String [] args){
    // declaration variable of PIN
int pin=1234;

Scanner sc= new Scanner(System.in);
System.out.println("Type your PIN :");

int inputpin= sc.nextInt();
if(pin==inputpin){
    System.out.println("Welcome to your ATM");
    System.out.println("Shoose :");
    System.out.println(" 1 : To Withdow \n 2 : To Deposit \n 3: Check Balance");
    int balance=500000,withdrow,deposit;
    int choice= sc.nextInt();
    if(choice==1){
        System.out.println("Enter money to be widthown");
        int inputWith= sc.nextInt();
        if(balance>=inputWith){
            balance=balance-inputWith;
          System.out.println("Successfully to withdrow "+inputWith+" Francs withdrown");
          System.out.println("Balance : "+balance);

        }else{
            System.out.println("Balance is not enough,check balance");
        }
    }
    else if(choice==2){
        System.out.println("Enter money you want to deposit");
        int inputDep= sc.nextInt();
        balance=balance+inputDep;
        System.out.println("Success to deposit,Your New balance is : "+balance);

    }
    else if(choice==3){
        System.out.println("Your Balance: "+balance);

    }else{
        System.out.println("Incorrect choice");
    }
   


}else{
    System.out.println("Incorrect PIN");  
}


    }
}