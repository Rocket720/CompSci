//
//import java.util.Scanner;
//public class day6_1{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many Kids are there?");
//        Kid[] kids = new Kid[input.nextInt()];
//        for (int i = 0; i < kids.length; i++) {
//            System.out.println("Enter kid #" + (i+1) + " 's name, age, and gender (m or f)");
//            kids[i] = new Kid(input.next(), input.nextInt(), (input.next().equals("m")) ? false : true)
//            System.out.println("How many sports does " + kids[i].name + " play?");
//            kids[i].sports = new Sports[input.nextInt()];
//            for (int j = 0; j < kids[i].sports.length; j++) {
//                System.out.println("Enter the following info about sport # " + (j+1) + ". \n
//                                    Sport name, Sport Season, Contact? (true or false), team? (true or false)");
//                kids[i].sports[j] = new Sport(input.next(), input.next(), input.nextBoolean(), input.nextBoolean());
//            }
//        }
//        for (Kid k : kids) {
//            System.out.println(kid);
//        }
//        System.out.println(Kid.getAvgnumSport);
//        System.out.println(Kid.atLeastOneContact);
//    }
//}
//class Kid{
//   	int age=0;
//   	String name;
//   	Sport [] sports;
//   	boolean female;
//
//   	Kid(String n, int a, boolean f){
//        name = n;
//        age = a;
//        female = f;
//   	}
//
//   	static double getAvgnumSport(Kid[] x){
//        int a = 0;
//        for(Kid b : x){
//            a+=b.sports.length;
//        }
//        return(a/x.length);
//    }
//
//   	static int atLeastOneContact(Kid[] x){
//        int a = 0;
//        for(Kid b : x){
//            for(Sport c : b.sports){
//                if(c.contact)
//                    a++;
//            }
//        }
//        return(a);
//    }
//
//
//   	public String toString(){
//        String s = "";
//        s+= name + ", a " + age + " year old ";
//        if(female)
//            s+="female"
//        else
//            s+="male"
//        s+= " who plays: "
//        for (Sport a : Sports) {
//            s+= a.name + ", "
//        }
//        s.substring(0,s.length-3);
//        return(s)
//   	}
//}
//
//class Sport
//{
//   	String name;//Name of sport
//   	boolean contact;//Contact sport?
//   	String season;//Winter, Spring, Summer, Fall
//   	boolean team;//Is it a team sport?
//
//   	Sport(String s, String s, boolean c, boolean t){
//        name = n;
//        season = s;
//        contact = c;
//        team = t;
//    }
//}
