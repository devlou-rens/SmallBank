import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
    Scanner scr = new Scanner(System.in);
    
    System.out.print("Enter Username: ");
    String userName = scr.nextLine();

    System.out.print("Enter Balance: ");
    double balance = scr.nextDouble();

    System.out.print("Enter PIN: ");
    int pass = scr.nextInt();

    BankAccount Acc = new BankAccount(userName, balance);
    
    if(Acc.password(pass)){
        int choiceNum;

    do{
        System.out.println("\n--- MENU ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Account");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
        choiceNum = scr.nextInt();

        switch(choiceNum){
            case 1:
                System.out.print("Enter Deposite Amount:" );
                double dep = scr.nextDouble();
                Acc.deposite(dep);
                break;

            case 2:
                System.out.print("Enter withdraw Amount: ");
                double wid = scr.nextDouble();
                Acc.withdraw(wid);
                break;
            
            case 3:
                Acc.showAcc();
                break;
            
            case 4:
                System.out.println("Thank you! Come Again!");
                break;
            
            default:
                System.out.println("Invalid input!");
        }
    }while(choiceNum != 4);

    } else {
            System.out.println("Access Denied!");
        }
         scr.close();
    }
    
}