public class Account {

    private double balance;
    private String name;
    private String HashedKey;

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
        if (authenticated(password)) {
            this.name = name;
            return true;
        }
        System.out.println("Invalid Password");
        return false;
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

}