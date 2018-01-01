package unit5;

import java.util.Scanner;

public class unit5Project {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many minutes the day is shortened by");
        int dif = input.nextInt();

        System.out.println("Is it a late start or early dismissal?");
        String offset = input.next();

        System.out.println("Activity period?");
        String ap = input.next();

        if (dif==0){
            if(ap.equals("yes")){
                    System.out.println("Period 1 - 7:50 to 8:30");
                    System.out.println("Period 2 - 8:33 to 9:16");
                    System.out.println("Period 3 - 9:19 to 9:59");
                    System.out.println("Period 4 - 10:02 to 10:42");
                    System.out.println("Period 5 - 10:45 to 11:25");
                    System.out.println("Period 6 - 11:28 to 12:08");
                    System.out.println("Period 7 - 12:11 to 12:51");
                    System.out.println("Period 8 - 12:54 to 13:34");
                    System.out.println("Period 9 - 13:37 to 14:17");
                    System.out.println("Activity - 14:20 to 14:40");
            }
            else if(ap.equals("no")) {
                    System.out.println("Period 1 - 7:50 to 8:32");
                    System.out.println("Period 2 - 8:35 to 9:20");
                    System.out.println("Period 3 - 9:23 to 10:05");
                    System.out.println("Period 4 - 10:08 to 10:50");
                    System.out.println("Period 5 - 10:53 to 11:35");
                    System.out.println("Period 6 - 11:38 to 12:20");
                    System.out.println("Period 7 - 12:23 to 13:05");
                    System.out.println("Period 8 - 13:08 to 13:50");
                    System.out.println("Period 9 - 13:53 to 14:35");
            }
        }
        else if(dif!=0){
            if(offset.equals("late")){
                if(ap.equals("yes")){
                    System.out.println("Period 1 - 7:50 to 8:30");
                    System.out.println("Period 2 - 8:33 to 9:16");
                    System.out.println("Period 3 - 9:19 to 9:59");
                    System.out.println("Period 4 - 10:02 to 10:42");
                    System.out.println("Period 5 - 10:45 to 11:25");
                    System.out.println("Period 6 - 11:28 to 12:08");
                    System.out.println("Period 7 - 12:11 to 12:51");
                    System.out.println("Period 8 - 12:54 to 13:34");
                    System.out.println("Period 9 - 13:37 to 14:17");
                    System.out.println("Activity - 14:20 to 14:40");
                }
                else if(ap.equals("no")){
                    System.out.println("Period 1 - 7:50 to 8:30");
                    System.out.println("Period 2 - 8:33 to 9:16");
                    System.out.println("Period 3 - 9:19 to 9:59");
                    System.out.println("Period 4 - 10:02 to 10:42");
                    System.out.println("Period 5 - 10:45 to 11:25");
                    System.out.println("Period 6 - 11:28 to 12:08");
                    System.out.println("Period 7 - 12:11 to 12:51");
                    System.out.println("Period 8 - 12:54 to 13:34");
                    System.out.println("Period 9 - 13:37 to 14:17");
                    System.out.println("Activity - 14:20 to 14:40");
                }
            }
            else if(offset.equals("early")){
                if(ap.equals("yes")){
                    System.out.println("Period 1 - 7:50 to 8:30");
                    System.out.println("Period 2 - 8:33 to 9:16");
                    System.out.println("Period 3 - 9:19 to 9:59");
                    System.out.println("Period 4 - 10:02 to 10:42");
                    System.out.println("Period 5 - 10:45 to 11:25");
                    System.out.println("Period 6 - 11:28 to 12:08");
                    System.out.println("Period 7 - 12:11 to 12:51");
                    System.out.println("Period 8 - 12:54 to 13:34");
                    System.out.println("Period 9 - 13:37 to 14:17");
                    System.out.println("Activity - 14:20 to 14:40");
                }
                else if(ap.equals("no")){
                    System.out.println("Period 1 - 7:50 to 8:30");
                    System.out.println("Period 2 - 8:33 to 9:16");
                    System.out.println("Period 3 - 9:19 to 9:59");
                    System.out.println("Period 4 - 10:02 to 10:42");
                    System.out.println("Period 5 - 10:45 to 11:25");
                    System.out.println("Period 6 - 11:28 to 12:08");
                    System.out.println("Period 7 - 12:11 to 12:51");
                    System.out.println("Period 8 - 12:54 to 13:34");
                    System.out.println("Period 9 - 13:37 to 14:17");
                    System.out.println("Activity - 14:20 to 14:40");
                }
            }
        }


    }

}
