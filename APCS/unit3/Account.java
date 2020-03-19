public class Account {

    private double balance;
    private String name;
    private String HashedKey;
    private int numDeposits = 0;
    private int numWithdrawals = 0;

    Account(String name, String password) {
        this.name = name;
        HashedKey = hash(password);
    }

    Account(String name, String password, double balance) {
        this.name = name;
        this.balance = balance;
        HashedKey = hash(password);
    }

    public String toString() {
        return ("Account Name: " + name + "\nBalance: $" + balance);
    }

    public boolean changeName(String name, String password) {
        if (authenticated(password))
            this.name = name;
        else
            wSystem.out.println("Invalid Password");
    }

    private String hash(String password) {
        String hashed = "";
        for (char c : password.toCharArray()) {
            hashed += (int) c;
        }
        return hashed;
    }

    private boolean authenticated(String password) {
        if (HashedKey.equals(hash(password)))
            return true;
        return false;
    }

    public void deposit(double deposit, String password){
        if(authenticated(password))
            this.balance += Math.abs(deposit); numDeposit++;
        else
            System.out.println("Invalid Password");
    }

    public void withdraw(double withdrawal, String password){
        if((this.balance-Math.abs(withdrawal))<0)
            System.out.println("WARNING: Withdrawal amount would make current balance negative"); return;
        if(authenticated(password))
            this.balance -= Math.abs(withdrawal); numWithdrawals++;
        else
            System.out.println("Invalid Password");
        

    }

}