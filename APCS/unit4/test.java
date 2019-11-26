import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class test {
    public static void main2(String[] args) {
        RentalCar r = new RentalCar("Mord Fustang", 2020);
        r.sortGallons();
        System.out.println(new ArrayList<>(Arrays.asList(r, r)));
        System.out.println(RentalCar.sortCust(new ArrayList<>(Arrays.asList(r, r))));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        int w = 0;
        while (w == 0) {
            System.out.println("Enter 1 to flip 1 coin.");
            System.out.println("Enter 2 to flip multiple coins.");
            System.out.println("Enter 3 to remove the most recent x flips.");
            System.out.println("Enter 4 to clear the list.");
            System.out.println("Enter 5 to give distribution of heads/tails.");
            System.out.println("Enter 6 to indicate the longest streak and how many times it occurs.");
            System.out.println("Enter 7 to indicate the number of changes in consecutive outcomes.");

            int sel = input.nextInt();

            if (sel == 1) {
                int flip = (int)(Math.random()*2);
                System.out.println(flip);
                x.add(flip);
            }

            if (sel == 2) {
                System.out.println("Enter the number of coins.");
                int numCoin = input.nextInt();
                for (int i = 0; i < numCoin; i++) {
                    int flip = (int)(Math.random()*2);
                    System.out.println(flip);
                    x.add(flip)
                }
            }

            if (sel == 3) {
                System.out.println("How many flips would you like to remove?");
                int numFlip = input.nextInt();
                for(int i = x.size()-1; i > x.size()-1-numFlip; i--){
                    x.remove(i);
                }
            }

            if (sel == 4) {
                x.clear();
            }

            if (sel == 5) {
                int h = 0;
                int t = 0;
                for (Integer integer : x) {
                    if (integer.toString()=="0")
                        h++;
                    else
                        t++;
                }
                System.out.println("Heads: " + h + " Tails: " + t);
            }

            if (sel == 6) {
                String current = x.get(0).toString(i);
                int streak = 0;
                for (Integer integer : x) {
                    if current==integer.toString()
                        streak++;
                    else   
                        streak = 0; current = integer.toString();
                }
                return streak;
            }

            if (sel == 7) {
                String current = x.get(0).toString(i);
                int flips = 0;
                for (Integer integer : x) {
                    if current!=integer.toString()
                        flips++; current = integer.toString();
                }
                return flips;
            }

        }
    }
}

class RentalCar {

    private String manufacturer;
    private int yearMade;
    private ArrayList<Customer> customers = new ArrayList<>();

    RentalCar(String x, int y) {
        manufacturer = x;
        yearMade = y;
        customers.add(new Customer("name", 1000, 100, 10));
        customers.add(new Customer("Jeff", 9000, 900, 90));
        customers.add(new Customer("Trump", 0, 0, 99999));
    }

    ArrayList<Customer> getCustomers() {
        return customers;
    }

    Customer mostMiles() {
        double most = 0;
        Customer driver = new Customer();
        for (Customer c : customers) {
            if (c.getMiles() > most) {
                most = c.getMiles();
                driver = c;
            }
        }
        return driver;
    }

    void sortGallons() {
        while (true) {
            for (int i = 0; i < customers.size() - 1; i++) {
                if (customers.get(i).getMiles() > customers.get(i + 1).getMiles()) {
                    Customer temp = customers.get(i);
                    customers.set(i, customers.get(i + 1));
                    customers.set(i + 1, temp);
                }
            }
            int count = 0;
            for (int i = 0; i < customers.size() - 1; i++) {
                if (customers.get(i).getMiles() > customers.get(i + 1).getMiles()) {
                    count++;
                }
            }
            if (count == 0)
                break;
        }

    }

    static double getMPG(ArrayList<RentalCar> x) {
        double totalMiles = 0;
        double totalGallons = 0;
        for (RentalCar rentalCar : x) {
            for (Customer c : rentalCar.customers) {
                totalMiles += c.getMiles();
                totalGallons += c.getGallons();
            }
        }
        return (totalMiles / totalGallons);
    }

    static ArrayList<Customer> sortCust(ArrayList<RentalCar> x) {
        ArrayList<Customer> sorted = new ArrayList<Customer>();
        ArrayList<Customer> unsorted = new ArrayList<Customer>();
        for (RentalCar rentalCar : x) {
            for (Customer c : rentalCar.customers) {
                unsorted.add(c);
            }
        }
        for (int i = 0; i < unsorted.size(); i++) {
            Customer driver = new Customer();
            double lowestPPG = unsorted.get(0).getPricePerGallon();
            for (int j = 0; j < unsorted.size(); j++){
                if (unsorted.get(j).getPricePerGallon()<lowestPPG){
                    driver = unsorted.get(j);
                    lowestPPG = unsorted.get(j).getPricePerGallon();
                }
            }
            sorted.add(sorted.size(), driver);
            unsorted.remove(driver);        
        }
        return(sorted);
    }

    public String toString() {
        String s = "";
        for (Customer c : customers) {
            s += c.toString() + " \n";
        }
        return s;
    }

}

class Customer {
    private String customerName;
    private double miles;
    private double gallons;
    private double pricePerGallon;

    Customer() {

    }

    Customer(String x, double y, double z, double a) {
        customerName = x;
        miles = y;
        gallons = z;
        pricePerGallon = a;
    }

    double getMiles() {
        return miles;
    }

    double getGallons() {
        return gallons;
    }

    double getPricePerGallon() {
        return pricePerGallon;
    }

    public String toString() {
        return "{" + customerName + ", " + miles + " miles, " + gallons + " gallons }";
    }

}
