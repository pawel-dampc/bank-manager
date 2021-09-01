public class Main {

    public static void main(String [] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountName("Saketh");
        checkingAccount.setAccountNumber(100);
        checkingAccount.setBalance(1000000);
        checkingAccount.limit = 1000;

        System.out.println(checkingAccount.limit);

    }
}


public class BankAccount {

    String accountName;
    int accountNumber;
    double balance;

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

}
    public class CheckingAccount extends BankAccount{
        int limit;
    }
    public class SavingAccount extends BankAccount{
        int limit;
    }
    public class COD extends BankAccount{
        int limit;
    }
