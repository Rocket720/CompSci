//import java.util.Scanner;
//public class day7_1{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of salespeople");
//        SalesPerson[] sales = new SalesPerson[input.nextInt()];
//        for (int i = 0; i < sales.length; i++) {
//            System.out.println("Enter the salesperson's name and salary");
//            sales[i] = new SalesPerson(input.next(), input.nextInt());
//            System.out.println("How many clients does " + sales[i].name + " have?");
//            Client[] c = new Client[input.nextInt];
//            for (int i = 0; i < c.length; i++) {
//                System.out.println("Enter client's name and budget");
//                c[i] = new Client(input.next(), input.nextInt());
//            }
//            sales[i].clients = c;
//        }
//
//        int m = 0;
//        int c = 0;
//        for (int i = 0; i < sales.length; i++) {
//            if(sales[i].clients.length>c)
//                c=sales[i].clients.length; m = i;
//        }
//        System.out.println("The salesperson with the most clients is " + sales[m] + " with " + c + " clients");
//
//        int m = 0;
//        int b = 0;
//        for (int i = 0; i < sales.length; i++) {
//            if(sales[i].getBudg()>b)
//                b=sales[i].getBudg(); m = i;
//        }
//        System.out.println("The salesperson with the most budget is " + sales[m] + " with $" + b );
//    }
//}
//
//class SalesPerson {
//    String name = "";
//    int salary;
//    Client[] clients;
//
//    SalesPerson(String n, int s) {
//        name = n;
//        salary = s;
//    }
//
//    int getBudg() {
//        int sum = 0;
//        for (Client c : clients) {
//            sum+=c.budget;
//        }
//        return(sum);
//    }
//}
//
//class Client {
//    String name;
//    int budget;
//
//    Client(String n, int b) {
//        name = n;
//        budget = b;
//    }
//}
