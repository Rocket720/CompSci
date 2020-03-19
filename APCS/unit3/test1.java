//import java.util.Scanner;
//
//public class test1 {
//    public static void main(String[] args){
//        Acct a = new Acct("bill", 0);
//    }
//    public static void main1(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter how many accounts will be made.");
//        int entered = input.nextInt();
//        Acct[] accts = new Acct[entered];
//        for (int i = 0; i < accts.length; i++) {
//            System.out.println("Enter the name and balance.");
//            accts[i] = new Acct(input.next(), input.nextInt());
//        }
//        int choice = 0;
//        int which = 0;
//        while (choice != 99) {
//            for (int i = 0; i < accts.length; i++) {
//                System.out.println("enter " + i + " for " + accts[i].getName());
//
//            }
//            which = input.nextInt();
//            // which is the index of the person selected.
//            System.out.println("Enter 1 to deposit.");
//            System.out.println("Enter 2 to withdraw.");
//            System.out.println("Enter 3 to change pin.");
//            System.out.println("Enter 99 to exit.");
//            choice = input.nextInt();
//            if (choice == 1) {
//
//                accts[which].deposit(input.nextInt());
//
//            }
//            if (choice == 2) {
//
//                accts[which].withdraw(input.nextInt());
//
//            }
//            if (choice == 3) {
//
//                accts[which].changePin(input.nextInt());
//
//            }
//
//            for (int i = 0; i < accts.length; i++) {
//                System.out.println(accts[i]);
//            }
//        }
//    }
//
//}
//
//class Acct {
//    Scanner input = new Scanner(System.in);
//    private String name = "";
//    private int acctNum = 0;
//    private int balance = 0;
//    private String secretQuestion = "";// for security, like "whatcitywereyoubornin?"
//    private String secretAnswer = "";// for security, "Rye Brook"
//    private int pin = 0;// 4-7 digit passcode
//    private static int numAccts = 0;// holds the number of accounts.
//    private static int[] acctNums = new int[100];// holds all of the account numbers, up to 100 accounts.
//
//    Acct(String nam, int bal) {
//        name = nam;
//        balance = bal;
//        numAccts++;
//        setAcctNum();
//        System.out.println("Please enter your secret question.");
//        secretQuestion = input.nextLine();
//        System.out.println("Please enter your secret answer.");
//        secretAnswer = input.nextLine();
//        setPin();
//        System.out.println("Your account number is " + acctNum);
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void deposit(int x) {
//        balance += x;
//    }
//
//    private void setAcctNum() {
//        /*
//         * This method should set the account number by randomly choosing an integer on
//         * the interval [100,999]. Should add the selected account number to the
//         * acctNums array Must check acctNums to ensure that the account number hasn't
//         * been chosen already.
//         */
//
//        int num = (int) ((Math.random() * 900)) + 100;
//        int i = 0;
//        while (acctNums[i] == num) {
//            num = (int) ((Math.random() * 900) + 100);
//            i++;
//            if(i==acctNums.length)
//                i=0;
//        }
//        for (int j = 0; i < acctNums.length; j++){
//            if(acctNums[j]==0)
//                acctNums[j] = num;
//            break;
//
//        }
//        acctNum = num;
//
//    }
//
//    private void setPin() {
//        /*
//         * This method should ask the user to set a pin. The pin must consist of between
//         * 4 and 7 digits, with no 0's. If the user enters a pin that doesn't meet the
//         * criteria, the user should be prompted to try again. we can assume the user
//         * enters a positive integer.
//         */
//        System.out.println("Enter a pin");
//        int p = input.nextInt();
//        String q = Integer.toString(p);
//        while(p>10000000 || p< 1000 || q.contains("0")){
//            System.out.println("Invalid pin, enter a pin");
//            p = input.nextInt(); q = Integer.toString(p);
//        }
//        pin = p;
//    }
//
//    public void changePin() {
//        /*
//         * This method should be used when the user wants to change his/her pin. The
//         * user should be given his/her secret question. If he/she responds with the
//         * secret answer, then he/she is allowed to change the pin. Note that to test if
//         * two Strings are equal, we should use String1.equals(String2), rather than
//         * String1==String2
//         */
//        System.out.println("Enter answer to " + secretQuestion);
//        if (input.nextLine().equals(secretAnswer)){
//            setPin();
//        }
//        else{
//            System.out.println("Incorrect answer");
//        }
//    }
//
//    public void withdraw(int x) {
//        /*
//         * This method must ask the user for his/her pin. The user can not withdraw more
//         * money than is in the account. If the user tries to withdraw more than he/she
//         * has in the account, the withdrawal should be for the full amount in the
//         * account. If the pin is entered incorrectly, the amount of the withdrawal
//         * should be 0.
//         */
//        System.out.println("Enter pin");
//        if(input.nextInt()==pin){
//            bal-=x;
//            if(bal<0) {
//                System.out.println("Cant take more out than what you got");
//                bal += x;
//            }
//        }
//    }
//
//    public String toString() {
//        return name + ", Account Number: " + acctNum + ", balance: $" + balance;
//    }
//
//}
