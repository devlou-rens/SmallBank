public class BankAccount{
    private String userName;
    private double balance;
    private int PIN = 1234;

    public BankAccount(String userName, double balance){
        this.userName = userName;
        this.balance = balance;
        }

    public boolean password(int pass){
            if (pass == PIN){
                System.out.println("Log-in Successfully!");
                return true;
            }else{
                System.out.println("Invalid PIN!");
                return false;
            }
        }


   // pag dagdag sin kwarta
    public void deposite(double amount){
            if (amount > 0){
                balance += amount;
                System.out.println("Deposited: "+ amount);
            } 
            else{
                System.out.println("Invalid amount!");
            }
        }

    //pag bawas sin kwarta
    public void withdraw(double amount){
            if (amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println("Withdrew: "+ amount);
            }
            else{
                System.out.println("Insufficient balance or invalid amount!");
            }
        }

    //pag paimod sin pangaran nan balance

    public void showAcc(){
            System.out.println("Name: "+ userName);
            System.out.println("Balance: "+ balance);
        }
}