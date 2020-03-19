//import java.util.Scanner;
//
//class day1_3{
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many stus");
//        Student [] stu = new Student [input.nextInt()];
//
//        for (int i = 0; i < stu.length; i++){
//            System.out.println("Enter first name, last name, age, gpa for Student");
//            stu[i] = new Student(input.next(), input.next(), input.nextInt(), input.nextDouble());
//        }
//
//        int age = stu[0].age;
//        Student s = stu[0];
//        for (int i = 0; i < stu.length; i++) {
//            if(stu[i].age<age)
//                age = stu[0].age;
//                s = stu[i];
//        }
//        System.out.println("The oldest student: " + s);
//
//        double gpa = stu[0].gpa;
//        s = stu[0];
//        for (int i = 0; i < stu.length; i++) {
//            if(stu[i].gpa<gpa)
//                gpa = stu[0].gpa;
//                s = stu[i];
//        }
//        System.out.println("The student with the highest gpa: " + s);
//        for (int i = 0; i < stu.length; i++) {
//            System.out.println(stu[i]);
//        }
//
//
//    }
//
//}
//
//class Student{
//
//    String firstName = "";
//    String lastName = "";
//    int age = 0;
//    double gpa = 0;
//    Student(){
//
//    }
//    Student(String firstName, String lastName, int age, double gpa){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.gpa = gpa;
//    }
//
//    public String toString(){
// 	    return firstName+" "+lastName+", age: "+age+", gpa: "+gpa;
//    }
//
//}
//
//class Course{
//
//
//
//}