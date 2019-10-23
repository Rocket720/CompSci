import java.util.Scanner;
public class test8{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.println("How many People are there?");
        Person[] people = new Person[input.nextInt()];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter the name of Person " + (i+1));
            String name = input.nextLine();
            System.out.println("What is " + name + "'s salary ");
            int salary = input.nextInt();
            System.out.println("How many hobbies does " + name + " have");
            int h = input.nextInt();
            people[i] = new Person(name, salary, h);
            for (int j = 0; j < people[i].hobbies.length; j++) {
                System.out.println("Enter Hobby " + (j+1));
                name = input.nextLine();
                System.out.println("True or false: The hobby is dangerous?");
                boolean d = input.nextBoolean();
                people[i].hobbies[j] = new Hobby(name, d);
            }
        }


        String richBoi = "";
        int s = 0;
        int dangerBoi = 0;
        for (Person p : people) {
            System.out.println(p);
            if(p.salary>s){
                s= p.salary;
                richBoi = p.name;
            }
            for (Hobby h : p.hobbies) {
                if(h.dangerous)
                    dangerBoi++;
            }
        }

        System.out.println("The highest salary belongs to " + richBoi);
        System.out.println("The average number of dangerous hobbies per person is " + (dangerBoi/people.length));
    }

}
class Person{
    String name;
    int salary;
    Hobby[] hobbies;

    Person(String n, int s, int num){
        name = n;
        salary = s;
        hobbies = new Hobby[num];
    }

    public String toString(){
        String s = "";
        s+=name + ", salary of $" + salary + ", Hobbies: ";
        for (Hobby h : hobbies) {
            s+=h.toString() + ", ";
        }
        return s;
    }
}
class Hobby{
    String name;
    boolean dangerous;
    Hobby(String s, boolean d){
        name = s;
        dangerous = d;
    }
    public String toString(){
        if (dangerous)
            return name + " (dangerous)";
        return name + " (not dangerous)";
    }
}